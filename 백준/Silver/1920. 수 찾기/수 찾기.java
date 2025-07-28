import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        String[] arry1 = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(arry1[i]);
        }

        Arrays.sort(a); 

        int m = Integer.parseInt(br.readLine());
        String[] arry2 = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(arry2[i]);

            
            int left = 0;
            int right = n - 1;
            boolean found = false;

            while (left <= right) {
                int mid = (left + right) / 2;

                if (a[mid] == target) {
                    found = true;
                    break;
                } else if (a[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            if (found) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }

        System.out.print(sb);
    }
}