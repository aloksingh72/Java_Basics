import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no a:-");
        int a = sc.nextInt();
        System.out.println("Enter the no b:-");
        int b = sc.nextInt();
        System.out.println("Press 1 for additon");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiply");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 for Modulo ");
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("Additon:-");
                int add = (a + b);
                System.out.println(add);

            case 2:
                System.out.println("Subtract:-");
                int subtract = (a - b);
                System.out.println(subtract);
            case 3:
                System.out.println("Multiplicaton:-");
                int Multiply = (a * b);
                System.out.println(Multiply);
            case 4:
                System.out.println("Divison:-");
                float Divide = (a / b);
                System.out.println(Divide);
            case 5:
                System.out.println("Modulo:-");
                float Modulo = (a % b);
                System.out.println(Modulo);

        }
    }

}
