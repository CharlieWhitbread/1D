
package timeline;

import java.util.ArrayList;
import java.util.Date;

public class Group extends TableEntry {

    String title;
    Date startDate;
    Date endDate;
  
        
    public Group(String name) {
        title = name;
        inGroup = true;
        for(Task t:listOfTasks){
            t.setGroup(true);
        }
    }
    
    
    public void addTask(Task task){
        listOfTasks.add(task);
    }
    
    public ArrayList<Task> getListOfTasks(){
        return listOfTasks;
    }
    
    public Task getParent(){
        return listOfTasks.get(0);
    }
    
}
    
    // Table.getSelectedRows(); used in the listner to outline the gantt nodes and such.