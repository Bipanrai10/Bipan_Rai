import java.util.*;
public class Prime {
    public static void main(String[] arg){
        int n,i,count=0;
        System.out.println("Please enter a number: ");
        Scanner a = new Scanner(System.in);
        n = a.nextInt();
        for(i=1;i<=n;i++){
            if(n%i == 0){
                count++;
            }
        }
        if(count>2){
            System.out.println(" The number is not a prime number."+ n);
        }else{
            System.out.println("The number is a prime number."+ n);
        }
    }
}
