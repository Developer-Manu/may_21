import java.math.BigInteger;
import java.util.Scanner;

public class WhileClass {
    public void method2(){
        System.out.println("Enter any integer number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        BigInteger fact = new BigInteger("1");
        System.out.println("The factorial of "+a+" is: ");
        while(a>0){
            fact=fact.multiply(BigInteger.valueOf(a));
            a--;
        }
        System.out.println(fact);

    }
}
