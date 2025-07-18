import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int sum = i;
            String s = Integer.toString(i);
            for (int j = 0; j < s.length(); j++) {
                sum += s.charAt(j) - '0';
            }

            if (sum == n) {
                result = i;
                break;
            }
        }

        System.out.println(result);
        sc.close();
    }
}