public class Main {

    public static void main(String[] args) {
//        int value = 1 ;

//        if (value ==1){
//            System.out.println("Value is 1");
//        }else if (value == 2){
//            System.out.println("Value is 2");
//        } else {
//            System.out.println("Value is not 1 or 2");
//        }

        char value = 'A';

//        switch(value){
//            case 'A':
//                System.out.println(value+ ": Alpha");
//                break;
//            case 'B':
//                System.out.println(value+ ":Baker");
//                break;
//            case 'C':
//                System.out.println(value+ "Charlie");
//                break;
//            case'D':
//                System.out.println(value+ "Dog");
//                break;
//            case 'E':
//                System.out.println(value+ "Easy");
//                break;
//            default:
//                System.out.println("Letter not found");
//                break;





for(int i=0; i <=6; i++){
    printDayOfWeek( i);

}

        }

        public static void printDayOfWeek(int day){

        String dayOfTheWeek = switch (day){
            case ( -1) -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> {
                yield "Invalid Day";
            }
        };

            System.out.println( dayOfTheWeek + " is the " + day + " day of the week");
    }

    public static void printWeekDay(int day){

        String dayOfTheWeek="";

        if(day ==0){
            dayOfTheWeek = "Sunday";
        }else if(day ==1){
            dayOfTheWeek = "Monday";
        }else if(day == 2){
            dayOfTheWeek = "Tuesday";
        }else if(day ==3){
            dayOfTheWeek = "Wednesday";
        } else if (day==4){
            dayOfTheWeek = "Thursday";
        }else if (day == 5) {
            dayOfTheWeek = "Friday";
        }else if (day ==6){
                dayOfTheWeek = "Saturday";
        }else{
            System.out.println("Invalid Day");
        }

        System.out.println(dayOfTheWeek + " is the " + day + " day of the week");
    }



}
