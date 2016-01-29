/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeline;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Charlie
 */
public class GanttChart extends JPanel{
    
    ArrayList <TableEntry> taskList = new ArrayList<>();
    int lastx = -20;
    
   
 
    public GanttChart(ArrayList<TableEntry> listOfTasks){
        
        this.setLayout(null);//sets the layout so we can have freedom
        
        this.setSize(new Dimension(620, 620));
        this.setBackground(Color.white);
        taskList = listOfTasks;
        for(TableEntry t :taskList){
            if(t.isInGroup()){//if the table entry is a group
                ArrayList<Task> list = t.getListOfTasks();
                for(Task task: list){
                    addNode(task); //for every item in the group
                }
                
               
            }else{ //if tableEntry is not a group
               
            }
        }
    }
    
    public void addNode(Task t){
        JPanel node = new JPanel();
        node.setBackground(Color.black);
        node.setBounds(0, 0, t.getDaysDiff()*10, 20); //Always 20 pixels high
        node.setVisible(true);
        this.add(node);
    }
}
