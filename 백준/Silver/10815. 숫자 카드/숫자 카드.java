import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Set<Integer> set = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] num1 = br.readLine().split(" ");
        
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(num1[i]));
        }

        int m = Integer.parseInt(br.readLine());
        String[] num2 = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(num2[i]);
            if (set.contains(num)) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }

        System.out.println(sb);
    }
}