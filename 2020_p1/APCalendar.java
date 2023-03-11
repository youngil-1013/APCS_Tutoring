
public class APCalendar {
    public APCalendar() {

    }

    private static boolean isLeapYear(int year) {
        if(year % 4 == 0){
            return true;
        }
        return false;
    }

    public static int numberOfLeapYears(int year1, int year2) {
       int a = 0;
       for(int i = 0; i <= year2 - year1; i++){
            if(isLeapYear(year1 + i)){
                a++;
            }
       }
       return a;
    }

    private static int firstDayOfYear(int year) {
        if(year == 2023){
            return 0;
        }
        if(year == 2022){
            return 6;
        }
        if(year == 2021){
            return 5;
        }
        if(year == 2020){
            return 3;
        }
        if(year == 2019){
            return 2;
        }
        if(year == 2018){
            return 1;
        }
        return 0;

    }

    private static int dayOfYear(int month, int day, int year){
        int b = 0;
        for(int i= 1; i < month; i++){
            if(i == 1 || i ==3 || i == 5 || i == 7|| i == 8 || i == 10 || i == 12){
                b += 31;
            }
            else if (i == 2){
                if(isLeapYear(year)){
                    b += 29;
                }
                else{
                    b += 28;
                }
            }
            else{
                b+=30;
            }
        }
        return b + day;
    }

    public static int dayOfWeek(int month, int day, int year) {
        int x = 0;
        x = (firstDayOfYear(year) + dayOfYear(month, day, year) - 1)%7;
        return x;
    }

    public static void main(String args[]){
        APCalendar a = new APCalendar();
        System.out.println(a.isLeapYear(2024)== true);
        System.out.println(a.numberOfLeapYears(2019, 2031)==3);
        System.out.println(a.numberOfLeapYears(2020, 2024)==2);
        System.out.println(a.dayOfYear(7, 20, 2023)== 201);
        System.out.println(a.dayOfWeek(2, 27, 2023) == 1);
    }
}
