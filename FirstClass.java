import java.util.*;

public class FirstClass {
    public static void main(String[] args) {
        // variables
        // int a = 10;
        // int b = 5;
        // int sum = a + b;
        // String name = "Jarvis";
        // double price = 15.13;
        // int ans = (a * b) /(a-b);
        // System.out.print("answer is:");
        // System.out.println(ans);

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // nextInt()
        // nextFloat();

        // System.out.println("the name that is i enterd:");
        // System.out.println(name);

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println(sum);
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if (age > 18) {
        // System.out.println("You are elligible for voting");
        // } else {
        // System.out.println("you are not eligible");

        // }
        // --------------------------------------------------------------------------------
        // **********************conditional Statements**********************

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if (a == b) {
        // System.out.println("Equal");
        // } else if (a > b) {
        // System.out.println("a is greater than b");
        // } else {
        // System.out.println("b is greater than a");
        // }

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
           case 2 :System.out.println("Namaste");
           break;
           case 3: System.out.println("Bonjour");
           break;
           default: System.out.println("Invaild button");    
        }

    }

}
