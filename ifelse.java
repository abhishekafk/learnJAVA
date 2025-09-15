import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR MARKS");
        int marks= sc.nextInt();
        if ( marks >= 90) {
            System.out.println("GRADE A");

        } else if ( marks >=70){
        System.out.println("GRADE B");
        } else if ( marks >=50) {
            System.out.println("GRADE C");
        } else if ( marks >=35) {
            System.out.println("GRADE D");
        } else {
            System.out.println("FAIL");
        }
        sc.close();
    }
}
