import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double sumOfValues = 0;
        double valuePassed= 0;
        double minValue=0;
        double maxValue=0;
        do{
            System.out.println("Enter 0 or any character to quit!");
            try {
                valuePassed = Double.parseDouble(scanner.nextLine());
                if( minValue == 0 && maxValue ==0){
                    minValue =valuePassed;
                    maxValue = valuePassed;
                    System.out.println("The current minimum number is: "+minValue);
                    System.out.println("The current maximum number is: "+maxValue);
                    continue;
                }
                if(valuePassed > minValue && valuePassed >= maxValue){
                    maxValue = valuePassed;
                }else{
                    minValue = valuePassed;
                }

                System.out.println("The current minimum number is: "+minValue);
                System.out.println("The current maximum number is: "+maxValue);

            } catch(NumberFormatException e){
                System.out.println("Please enter a valid number");
            }


        }while(valuePassed !=0);

        System.out.println("You exited the program");


    }
}
