import java.util.Scanner;

public class ForClass {
        public void method1(){
            System.out.println("Enter a positive integer:");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            System.out.println("The factorial of "+a+" is:");
            int fact = 1;
            for(int i=1;i<=a;i++){
                fact = fact*i;
            }
            System.out.println(fact);
        }
    }

