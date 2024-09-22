package kevin;
import java.util.Scanner;

public class week1 {

    public static String evenOrOdd(int number){
        if(number % 2 == 0){
            return "identify("+number+") -> Even";
        } else {
            return "identify("+number+") -> Odd";
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");

        int number = input.nextInt();
        System.out.println(evenOrOdd(number));

        }


}
/*
Write  a method which can identify given number is even or odd
         Output ex:
         identify(5); ->"Odd"
         identify(6); ->"Even"
 */