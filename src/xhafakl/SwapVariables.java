package xhafakl;

public class SwapVariables {
    public static void main(String[] args) {


        int a =5;
        int b =10;

        System.out.println("before swap a= "+a+" , b="+b);

a=a+b; // a becomes now 15
b=a-b; //b becomes 5
a=a-b; // a becomes 15-5=10

        System.out.println("after swap a= "+a+" , b="+b);



    }
}
