package andrei_curosu;

import java.util.ArrayList;

/*
      Write  a method which can identify given number is even or odd
       Output ex:
       identify(5); ->"Odd"
       identify(6); ->"Even"

       */
public class JavaQuestionWeek1 {
    public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(12);
      list.add(23);
      list.add(34);
      list.add(43);
      list.add(17);
        for (Integer i : list) {
            if (i % 2 == 0) {
                System.out.println("number " + i + " is even");
            }else{
                System.out.println("number: " + i + " is odd");
            }

        }


    }
}
