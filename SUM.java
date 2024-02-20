import java.util.Scanner;
public class SUM {
    public static void main(String[]args){
  
    int a,b,c;
    System.out.println("enter a number");
    Scanner read=new Scanner(System.in);
    a=read.nextInt();
    System.out.println("enter second number");
    Scanner d=new Scanner(System.in);
    b=d.nextInt();
     c=a+b;
    System.out.println("the sum of two numbers is "+c);
}
}
