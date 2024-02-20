import java.util.Scanner;
public class  odd-even{
    public static void main(String[]args){
    Scanner read=new Scanner(System.in);
    System.out.print("Enter a number");
    int n=read.nextInt();
    if(n%2==0)
        System.out.println("the number is a even number="+ n);
        else
        System.out.println("the number is a odd number="+ n);
}
}
