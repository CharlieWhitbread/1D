/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeline;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Date;
import javafx.scene.shape.Line;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Charlie
 */
public class Gantt extends JPanel{
    
    public int col,rows,width,height;
    public Date startDate;
    public Date endDate;
    ArrayList<Task> taskList = new ArrayList<Task>();
    Color aColor = new Color(0xFF0096);
    int lastx,lasty = 0;
    
    public Gantt (ArrayList list){
        
        width = this.getWidth();
        col = width/10;
        height = this.getHeight();
        rows = height/10;
        taskList = list;
        this.setLayout(null);
        this.setSize(this.getWidth(),this.getHeight());
        
        
        JScrollPane scrollPane = new JScrollPane(this);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        
        
        
        startDate = taskList.get(0).startDate; //Sets a defualt start and end date as the first Task.
        endDate = taskList.get(0).endDate;
        
        for(Task task:taskList){ //Looks through rest of tasks to see if there is an earlier date
            if(task.getStartDate().before(startDate)){
                startDate = task.getStartDate();
            }
        }
        
        for(Task task:taskList){
            if(task.getEndDate().after(endDate)){
                endDate = task.getEndDate(); //Checks and sets the last date
            }
        }
        
        this.setBackground(Color.red);
        
        for(Task task:taskList){
            createNode(task);
        }
    }
    
    public void createNode(Task t){
        JPanel node = new JPanel();
        node.setVisible(true);
        node.setBounds(lastx*200, lasty, t.getDaysDiff(), 20);
        
        JLabel nodeName = new JLabel(t.getName());
        nodeName.setVisible(true);
        nodeName.setBounds(lastx*200, lasty+20, t.getDaysDiff(), 20);
        
        
        this.add(nodeName);
        this.add(node);
        lasty = lasty + 20; // Vertical
        lastx = lastx + t.getDaysDiff();
        
    }
}




       
        
     
           
    
    
    

