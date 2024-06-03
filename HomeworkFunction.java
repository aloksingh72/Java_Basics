import java.util.Scanner;

public class HomeworkFunction {
    // finding the avg of the number of threee number given by user
    // function declarations
    public static float avgNumber(int a,int b,int c) {
       float average = (a +b+c)/3;
        return average ;

        
    }
    public static void  main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the three no.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("this is an avg of the no "+ avgNumber(a, b, c));
    }
    
}
