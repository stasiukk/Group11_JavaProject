package vladimir;


import java.util.Scanner;

public class week03_Q01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int a = scanner.nextInt();

        System.out.println("Please enter second number");
        int b = scanner.nextInt();
        scanner.close();

        System.out.println( "a : "+ a +" , " + " b : "+ b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println( "a : "+ a +" , " + " b : "+ b);



    }
}
