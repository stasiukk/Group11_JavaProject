package andrei_curosu;

import java.util.ArrayList;
import java.util.Scanner;

/*
Swap two variables' values without using a third variable
 */
public class JavaQuestionWeek3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int x = sc.nextInt();
        System.out.println("Please enter second number");
        int y = sc.nextInt();
        sc.close();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(x);
        list1.add(y);
        System.out.println("list1 = " + list1);
        x = x + y;
        y = x - y;
        x = x - y;
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(x);
        list2.add(y);
        System.out.println("list2 = " + list2);

    }
}
