package arlinda;

public class Week1_OddOrEvenTask {

    /*
    Write  a method which can identify given number is even or odd
         Output ex:
         identify(5); ->"Odd"
         identify(6); ->"Even"
     */
    public static void main(String[] args) {

        OddOrEven(5);
        OddOrEven(6);
    }

    public static void OddOrEven(int number){
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        }else{
            System.out.println(number + " is odd");
        }
    }



}

