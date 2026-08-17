public class Scope {

    public static void main(String[] args) {

//        System.out.println(7347/10); //7
//        System.out.println(734%10);//4
//        System.out.println(73%10);//3
//        System.out.println(7%10);//7
//



//       System.out.print(sumFirstAndLastDigit(5));
//        System.out.println(isPalindrome(1241));

       // System.out.print(getEvenDigitSum(-22));


//         System.out.println(12/10);//7

        System.out.print( hasSharedDigit(15,55));
    }




    public static boolean isPalindrome(int number){
        int reverse = 0;

        int lastDigit=0;
        int numberEntered=number;
        while (number != 0){
            lastDigit = number%10;
            reverse = reverse * 10;
            reverse += lastDigit;
            number/=10;
        }

        return reverse == numberEntered;
    }



    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }

        int lastDigit = number%10;
        int firstDigit=0;

        if( number < 10){
            return number *2;
        }

        while(number != 0) {
            number = number / 10;
            if (number < 10) {
                firstDigit = number;
                break;
            }

        }

        return firstDigit + lastDigit;
    }




    public static int getEvenDigitSum(int number){

        if(number < 0){
            return -1;
        }
        int sumOfDigits=0;
        int tempNum = 0;
        while (number != 0){
            tempNum = number%10;
            if(tempNum%2 == 0){
                sumOfDigits+=tempNum;
            }
            number = number / 10;
        }
        return  sumOfDigits;
    }



    public static boolean hasSharedDigit(int num1, int num2){
        if( (num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)){
            return false;
        }

        int num1FirstDigit =0;
        int num1LastDigit =0;

        int num2FirstDigit =0;
        int num2LastDigit =0;


        int counter=0;
        do{
            num1FirstDigit = num1 / 10;
            num1LastDigit = num1 %10;

            num2FirstDigit = num2 / 10;
            num2LastDigit = num2 %10;

            counter --;

        }while (counter > 0);
        return (num1FirstDigit == num2FirstDigit)
                || (num1LastDigit == num2LastDigit) ||
                (num1FirstDigit == num2LastDigit) ||
                (num1LastDigit == num2FirstDigit);
    }



}
