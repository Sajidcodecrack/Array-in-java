import java.util.*;
import java.lang.*;
public class revnum {
    public static void main(String[] args)
    {
       Scanner sc= new Scanner(System.in);
       int i=0,num,rev=0;
       System.out.println("Enter any number :");
       num=sc.nextInt();
       while(num!=0)
       {
        rev=rev*10+num%10;
        num=num/10;
       }
       System.out.println("Reverse number is : " +rev);
    }
}
