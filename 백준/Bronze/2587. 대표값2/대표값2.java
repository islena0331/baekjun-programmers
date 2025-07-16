import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }

        Arrays.sort(a);
        
        System.out.println(sum / a.length);        
        System.out.println(a[a.length / 2]);       

        sc.close();
    }
}