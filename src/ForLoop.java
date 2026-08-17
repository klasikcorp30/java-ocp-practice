public class ForLoop {
    public static void main(String[] args) {
//
//        System.out.println("8 is" +(isPrime(8) ? " ": " NOT ") + "a prime number");
//        System.out.println("5 is" +(isPrime(5) ? " ": " NOT ") + "a prime number");
//        System.out.println("17 is" +(isPrime(17) ? " ": " NOT ") + "a prime number");
//        System.out.println("31 is" +(isPrime(31) ? " ": " NOT ") + "a prime number");
//        System.out.println("71 is" +(isPrime(71) ? " ": " NOT ") + "a prime number");
//        System.out.println("4 is" +(isPrime(4) ? " ": " NOT ") + "a prime number");
//
//        System.out.println("-1 is" +(isPrime(-1) ? " ": " NOT ") + "a prime number");

//        int primeNumberCounter=0;
//        for (int counter = 700; counter <= 1000; counter++) {
//            if(isPrime(counter)) {
//                System.out.println(counter + " is a prime number");
//                primeNumberCounter++;
//            }else{
//                System.out.println(counter + " is not prime number");
//            }
//
//            if(primeNumberCounter ==3){
//                break;
//            }
//        }



        int numberCounter =0;
        int sumValue=0;

        for(int i=1; i<= 1000; i++){
            if ((i%3 == 0) && (i%5==0)){
                sumValue+=i;
                numberCounter++;
                System.out.println("We have the valaue: "+i);
            }
            if (numberCounter ==5 ){
                System.out.println("We have reached the limit of 5. The sum of all values divisible by 3 and 5 are: "+ sumValue);
                break;
            }
        }












//
    }

//     public static double calculateInterest(double amount, double interestRate){
//        return (amount * (interestRate/100));
//     }


    public static boolean isPrime(int wholeNumber){
        if (wholeNumber <= 2){
            return wholeNumber == 2;


        }
        for (int divisor=2; divisor < wholeNumber; divisor++){
            if (wholeNumber % divisor == 0){
                return false;
            }
        }

        return true;
    }



    public class SumOddRange {
        // write code here

        public static boolean isOdd(int value){
            return value < 1 ? false:value%2!=0;
        }

        public static int sumOdd(int start, int end){

            if((end < start) || (start < 0 || end < 0)){
                return -1;
            }

            int sumValue=0;
            for (int i=start; i <= end; i++){

                if(isOdd(i)){
                    sumValue+=i;
                }
            }

            return sumValue;
        }


    }
}
