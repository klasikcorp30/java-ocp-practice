public class WhileLoop {

    public static void main(String[] args){


//        int value = 5;
//        int totalEvenNumbers=0;
//        int totalOddNumbers=0;
//
//        while(value <= 20){
//            if(isEven(value)) {
//                totalEvenNumbers++;
//                System.out.println(value + " is an even number");
//            }else{
//                totalOddNumbers++;
//            }
//            value++;
//
//        }
//        System.out.println("There are a total number of: "+totalEvenNumbers+ " even numbers and total number of: "+ totalOddNumbers + " odd numbers." );


//        System.out.println(125%10); // => 5
//        System.out.println(12%10); // 2
//        System.out.println(1/10); // 1

//        System.out.print(sumDigits(11));


    System.out.print(sumOfAllDigits2(1234));

    }


    public static boolean isEven(int number){
        return number % 2 == 0;
    }


    public static int sumDigits (int number){
        int sumOfAllDigits =0;
        int remainder = 0;
        if (number < 0 ){
            return -1;
        }

        if(number < 10 && number >= 1){
            return number;
        }

        while(number != 0){
            sumOfAllDigits += (number%10);
            remainder = number/10;
            number = remainder;

        }




        return sumOfAllDigits;
    }



    public static int sumOfAllDigits2 (int number){

        if (number < 0){
            return -1;
        }

        if (number < 10 && number >=1){
            return number;
        }
        int sum=0;
        while (number > 9){

            sum += (number%10);
            number/=10;
        }
        sum+=number;
        return sum;
    }
}
