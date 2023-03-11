public class StepTracker{
    //instance variable
    private int minSteps;
    private int days = 0;
    private int tSteps = 0;
    private int aDays = 0;


    public StepTracker(int minSteps){
        this.minSteps = minSteps;
    }

    public void addDailySteps(int steps){
        days += 1;
        tSteps += steps;
        if(steps >= minSteps){
            aDays += 1;
        }
    }

    public int activeDays(){
        return aDays;
    }

    public double averageSteps(){
        if(days >= 1){
            return tSteps/days;
        }
        return 0.0;
    }


    public static void main(String[] args){
        StepTracker tr = new StepTracker(10000);
        System.out.println(tr.activeDays() == 0);
        System.out.println(tr.averageSteps() == 0.0);
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.println(tr.activeDays() == 0);
        System.out.println(tr.averageSteps() == 7000.0);
        tr.addDailySteps(13000);
        System.out.println(tr.activeDays() == 1);

    }
}