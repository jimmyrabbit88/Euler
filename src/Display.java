import javax.swing.*;
import java.awt.*;

public class Display {
    public static void main(String[] args) {
        //findSomeOfDivisibleByTwo(1000, 3,5);
        //sumOfEvenFibbNumbersUnderN(4000000);
        largestPrimeFactor(13195);
    }

    //find the sum of all oaitive integers below n that are evenly devisible by a and b
    //findSumOfDivisibleByTwo();
    public static void findSomeOfDivisibleByTwo(int n, int a, int b){
        int ans = 0;
        for (int i=1; i<n; i++) {
            if(i%a==0 || i%b==0){
                ans = ans + i;
            }

        }
        System.out.println(ans);
    }

    public static void sumOfEvenFibbNumbersUnderN(long n){
        long ans = 0;
        long fib = 1;
        long fibB = 1;
        long temp = 0;
        System.out.println(n);
        while(fibB < n){
            if(fibB % 2 == 0){
                ans += fibB;
            }
            temp = fib;
            fib = fibB;
            fibB = fib + temp;
            System.out.println(fibB);
        }
        System.out.println(ans);
    }

    public static void largestPrimeFactor(long n){
        double sqr = Math.sqrt(n);
        for(int i=3; i <= sqr; i++){
            if(n%i ==0 ){
                if (isPrime(n/i) == true){
                    System.out.println(n/i);
                    return ;
                }

            }
        }
    }

    public static boolean i
    sPrime(double x){
        for(int i=1; i<= Math.sqrt(x); i++){
            if (x%i == 0){
                return false;
            }
            else{
                return true;
            }
        }
        System.out.println("problem");
        return false;
    }
}
