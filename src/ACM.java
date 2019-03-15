import java.util.Scanner;

public class ACM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();

        int[] numbers = new int[num];
        String[] splitted = str.split(" ");
        for (int i=0; i< numbers.length; i++){
            numbers[i] = Integer.parseInt(splitted[i]);
        }
        int high;
        int highindex;
        //boolean flaglow = true;
        for(int i=0; i<numbers.length; i++){
            high = numbers[i];
            for (int j=i; j<numbers.length; j++){
                //if()
            }
        }

        System.out.println(str);
    }
}
