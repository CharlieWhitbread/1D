/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeline;

import java.util.ArrayList;
import javax.swing.JComponent;

/**
 *
 * @author Charlie
 */
public  class TableEntry extends JComponent{
    
    Boolean inGroup = false;
    ArrayList<Task> listOfTasks = new ArrayList <Task>();
    public boolean isInGroup(){
        return inGroup;
    }
    
    public ArrayList<Task> getListOfTasks(){ //ONLY USED IF IN GROUP
        return listOfTasks;
    }
    
    
}

