public class Challenge1 {

    public static void main(String[] args) {

//        System.out.println(isLeapYear(-2000));

//        System.out.println(-1600 > 9999);

        System.out.println(getDaysInMonth(2,-1600));
    }

    public static boolean isLeapYear(int year){

        if((year < 1) || (year > 9999)){
            return false;
        } else if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            return true;
        }else{
            return false;
        }
    }


    public static int getDaysInMonth(int month, int year){
        if (month <1 || month > 12 || year < 1 || year  > 9999){
            return -1;
        }
        boolean leapYear = isLeapYear(year);
        return switch(month){
            case 1 -> 31;
            case 2 -> {yield leapYear ? 29:28;}
            case 3 -> 3;
            case 4 -> 30;
            case 5 -> 31;
            case 6 -> 30;
            case 7 -> 31;
            case 8 -> 31;
            case 9 -> 30;
            case 10 -> 31;
            case 11 -> 31;
            case 12 -> 31;
            default -> 0;
        };
    }


}
