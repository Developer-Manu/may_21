import java.math.BigInteger;
import java.util.Scanner;

public class Recursive {
    public void method3(){
        System.out.println("Enter an integer:");
        Scanner n = new Scanner(System.in);

        int n1 = n.nextInt();
        if(n1==0)
        {
            System.out.println(1);
        }
        else if(n1<0)
        {
            System.out.println("factorial not defined for negetive numbers");
        }
        else {
            System.out.println("The factorial of "+n1+" is:");
            System.out.println(recursive(n1));
        }

    }

    public BigInteger recursive(int a){
        BigInteger f = new BigInteger("1");
        for(int i=a;i>1;i--)
        {
            f = f.multiply(new BigInteger(""+i));
        }
        return f;
    }
}
