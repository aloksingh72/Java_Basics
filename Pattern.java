public class Pattern {
    public static void main(String[] args) {
        // solid rectangle pattern
        // int n = 4;
        // int m = 5;
        // // outer for loop
        // for (int i = 1; i <= n; i++) {
        // // inner for loop
        // for (int j = 1; j <= m; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Hollow Rectangle Pattern
        // int n = 4;
        // int m = 5;
        // // outer loop
        // for (int i = 1; i <= n; i++) {
        // // inner loop
        // for (int j = 1; j <= m; j++) {
        // // cell-> (i,j)
        // if (i == 1 || j == 1 || i == n || j == m) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }

        // }
        // System.out.println();

        // }
        // outer loop

        // reverse pyramid
        // int n = 4;
        // // inner loop ->space print
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");

        // }
        // // inner loop -> start print
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 123 pattern
        // int n=5;
        // // outer loop
        // for(int i= 1;i<=n;i++){
        // // inner loop
        // for(int j=1;j<=i;j++){
        // System.out.print(j);
        // }
        // System.out.println( );

        // }

        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // // inner loop for space
        // for (int j = 1; j <= n-i; j++) {
        // System.out.print(" ");
        // }
        // // inner loop for start
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // int n = 5;
        // // outer loop
        // for (int i = 1; i <= n; i++) {
        // // inner loop
        // for (int j = 1; j <= n - i + 1; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();

        // }
        // Floyd's Triangle
        // int n = 5;
        // int number = 1;
        // // outer loop
        // for (int i = 1; i <= n; i++) {
        // // inner loop
        // for (int j = 1; j <= i; j++) {
        // System.out.print(number+" ");
        // number++;
        // }
        // System.out.println();
        // }

        // o &1 triangle
        // int n = 5;
        // // outer loop
        // for (int i = 1; i <= n; i++) {
        // // innner loop
        // for (int j = 1; j <= i; j++) {
        // //print condition
        // if ((i + j) % 2 == 0) {
        // System.out.print("1"+" ");
        // } else {
        // System.out.print("0"+" ");

        // }
        // }
        // System.out.println();
        // }

        // -------------------------Adavance pattern problem --------------------
        // ---------------Butterfly pattern problem
        // int n = 4;
        // // upper half
        // for (int i = 1; i <= n; i++) {
        // // inner loop 1st part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // // inner loop for spaces
        // int spaces = 2 * (n - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }
        // // part inner loop again stars
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // // lower half
        // for (int i = n; i >= 1; i--) {
        // // inner loop 1st part
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // // inner loop for spaces
        // int spaces = 2 * (n - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }
        // // part inner loop again stars
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // }

        // -----------solid rhombus
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // // innner loop for spaces
        // int space = n - i;
        // for (int j = 1; j <= space; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= n; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // // INNER loop for spaces
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }
        int n=4;
        int m=5;
        // outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=m;j++){
                // cell (i,j)
                if(i==1|| i== n || j==1 || j== m){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                

            }
            System.out.println();
        }

    }
}
