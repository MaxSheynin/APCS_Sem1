public class StepTracker{
    
    //global variables:
    private int minimumSteps;
    private int days;
    private int activeDays;
    private int totalSteps;
    
    //constructor:
    public StepTracker(int minimum){
        minimumSteps = minimum;
        days = 0;
        activeDays = 0;
        totalSteps = 0;
    }
    
    //methods:
    public void addDailySteps(int a){
        totalSteps = totalSteps + a;
        if(a>10000){
            activeDays++;
        }
    }
    public int activeDays(){
        return activeDays;
    }
    public double averageSteps(){
        double averageSteps;
        averageSteps = totalSteps/days;
        return averageSteps;
    }
    
    
    
    
    
}