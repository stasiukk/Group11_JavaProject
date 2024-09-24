package andrii;

public class Week_3_Java_Practice {

    //create main method
    public static void main(String[] args) {
        // Swap two variables' values without using a third variable
        int a = 10, b = 20;
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);



    }


}
