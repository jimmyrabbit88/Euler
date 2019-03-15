import javax.swing.*;
import java.awt.*;

public class Display {
    public static void main(String[] args) {

        final long startTime = System.nanoTime();
        //findSomeOfDivisibleByTwo(1000, 3,5);
        //sumOfEvenFibbNumbersUnderN(4000000);
        //largestPrimeFactor(600851475143L);
        //LPN();
        //smallestMultiple();
        //differenceBetweenSumofSqrsAndSqrsOfSum(100);
        //theNthPrime(10001);
        String num = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
        findHighestNAdjDigitsProduct(13, num);
        final long duration = System.nanoTime() - startTime;
        System.out.println("Time = " + (duration/1000000));


    }

    //Project Euler problem 8: The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.
    //
    //73167176531330624919225119674426574742355349194934
    //96983520312774506326239578318016984801869478851843
    //85861560789112949495459501737958331952853208805511
    //12540698747158523863050715693290963295227443043557
    //66896648950445244523161731856403098711121722383113
    //62229893423380308135336276614282806444486645238749
    //30358907296290491560440772390713810515859307960866
    //70172427121883998797908792274921901699720888093776
    //65727333001053367881220235421809751254540594752243
    //52584907711670556013604839586446706324415722155397
    //53697817977846174064955149290862569321978468622482
    //83972241375657056057490261407972968652414535100474
    //82166370484403199890008895243450658541227588666881
    //16427171479924442928230863465674813919123162824586
    //17866458359124566529476545682848912883142607690042
    //24219022671055626321111109370544217506941658960408
    //07198403850962455444362981230987879927244284909188
    //84580156166097919133875499200524063689912560717606
    //05886116467109405077541002256983155200055935729725
    //71636269561882670428252483600823257530420752963450
    //
    //Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?

    public static void findHighestNAdjDigitsProduct(int n, String str){
        String sub ="";
        long highest = 1L;
        String hsub = "";
        long product;
        for (int i = 0; i < (str.length()-n +1); i++) {
            sub = str.substring(i, (i + n));
            product = getProduct(sub);
            if(highest < product){
                highest = product;
                hsub = sub;
            }

        }
        System.out.println(highest);
        System.out.println(hsub);
    }

    public static long getProduct(String str){
        long total = 1L;
        for (int i = 0; i < str.length(); i++) {
            total = total*Character.getNumericValue(str.charAt(i));
        }
        return total;
    }


    //Project Euler problem 7 : By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
    //
    //What is the 10 001st prime number?

    public static void theNthPrime(int n){
        int primeCounter = 1;
        double i = 1;
        while (primeCounter < n){
            i += 2;
            if(isPrime(i)){
                primeCounter++;
            }

        }
        System.out.println(i);
    }









    //Project Euler problem 6 :The sum of the squares of the first ten natural numbers is,
    //
    //1^2 + 2^2 + ... + 10^2 = 385
    //The square of the sum of the first ten natural numbers is,
    //
    //(1 + 2 + ... + 10)^2 = 55^2 = 3025
    //Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
    //
    //Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

    public static void differenceBetweenSumofSqrsAndSqrsOfSum(int num){
        int diff = (sqrOfSums(num) - sumOfSqrs(num));
        System.out.println(diff);

    }

    public static int sqrOfSums(int num){
        int total = 0;
        for (int i = 1; i <= num; i++) {
            total += i;
        }
        return (total*total);
    }

    public static int sumOfSqrs(int num){
        int total = 0;
        for (int i = 1; i <= num; i++) {
            total += (i*i);

        }
        return total;
    }


















    //Project Euler problem 5: 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
    //
    //What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
    public static void smallestMultiple(){
        //System.out.println(40%3);
        boolean found = false;
        int x = 40;
        boolean test = true;
        while(found == false){
            for(int i=3; i < 20; i++){
                if (x%i != 0){
                    //System.out.println(x%i);
                    test = false;
                    break;
                }
            }
            if(test){
                found = true;
            }
            else{
                test = true;
                x += 20;
            }
        }
        System.out.println(x);

    }

    //find the sum of all posaitive integers below n that are evenly devisible by a and b
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
        int sqf =(int)Math.sqrt(n);

        for(int i=3; i <= sqf; i++){
            if(n%i ==0 ){
                if (isPrime(n/i) == true){
                    System.out.println(n/i);
                    return;
                }
            }
        }
        for(int i=sqf; i>1; i--){
            if(n%i ==0){
                if(isPrime(i)){
                    System.out.println(i);
                    return;
                }
            }
        }
    }

    public static boolean isPrime(double x){
        Boolean prime = true;
        for(int i=2; i<= Math.sqrt(x); i++) {
            if (x%i == 0) {
                prime = false;
            }
        }
        return prime;
    }

    public static void LPN(){
        int highest = 0;
        int ha = 0;
        int hb = 0;
        for(int i = 999; i>0; i--){
            for(int j = i; j>0; j--){
                int mul = i*j;
                if (mul > highest) {
                    if (isPalin("" + mul)) {
                        highest = mul;
                        ha = i;
                        hb = j;
                    }
                }
            }
        }
        System.out.println(highest);
        System.out.println(ha + "X" + hb);
    }

    public static Boolean isPalin(String str){
        //int lastIndex = str.length()-1;
        //boolean palin = true;
        //for(int i=0; i<str.length()/2; i++){
        //    if(str.charAt(i) != str.charAt(lastIndex - i)){
        //        palin = false;
        //    }
        //}
        //System.out.println(palin);
        //return palin;

        //using a recursive method to test if is a palindrome
        //UNTESTED
        if(str.length()<=1){
            return true;
        }
        else{
            if (str.charAt(0) == str.charAt(str.length()-1)){
                if (isPalin(str.substring(1,str.length()))){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }




    }
}
