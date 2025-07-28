import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if(n==0)
            System.out.println("0");
        else if(n==1)
            System.out.println("1");
        else{
            int n1 = 0;
            int n2 = 1;
            for(int i = 2; i <= n; i ++){
                int n3 = n2;
                n2 = n1 + n2;
                n1 = n3;
            }
            System.out.println(n2);
        }
    }
}