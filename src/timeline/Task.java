/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeline;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Task extends TableEntry {
    
    public Date startDate = new Date();
    public Date endDate = new Date();
    public String title;
    
    public Task(){};
    
    public Task(String inTitle, Date inStartDate, Date inEndDate){
        title = inTitle;
        startDate = inStartDate;
        endDate = inEndDate;
    }
    
    public int getDaysDiff(){
        long diff = endDate.getTime() - startDate.getTime();
        return (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); //This converts the difference in time between the 2 days into the DAYS format
    }
    
    public Date getStartDate(){
        return startDate;
    }
    
    public Date getEndDate(){
        return endDate;
    }
    
    public void setGroup(Boolean state){
        inGroup = state;
    }
   
    
    
    
    
    
    
    
    
    
    
    
    
    
}
