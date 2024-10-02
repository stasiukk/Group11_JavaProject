package kevin;

import java.util.ArrayList;
import java.util.Scanner;

public class week03_javaPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = input.nextInt();
        ArrayList<Integer>list = new ArrayList();
        list.add(num1);
        list.add(num2);

        System.out.println("Your numbers are: "+list);
        ArrayList<Integer>list2 = new ArrayList();
        list2.add(num2);
        list2.add(num1);
        System.out.println("Your numbers swap: "+list2);
    }
}
