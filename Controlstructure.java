import java.util.Scanner;

public class Controlstructure {
    public static void main(String[] args) {
    
      //  Scanner sc=new Scanner(System.in);
        //System.out.println("Enter the age");
       // int age=sc.nextInt();
        //if(age>=18)
      //      System.out.println("eligible");
       // sc.close();
       //if else biggest of two numbers
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        if(a>b)
            System.out.println("First no is largeer");
        else
            System.out.println("second no is larger");

    }
}
