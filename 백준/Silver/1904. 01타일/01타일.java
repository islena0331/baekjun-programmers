import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if(n==1)
            System.out.println("1");
        else if(n==2)
            System.out.println("2");
        else{
            int n1 = 1;
            int n2 = 2;
            int temp = 0;
            for(int i = 2; i < n; i ++){
                temp = (n1 + n2) % 15746;
                n1 = n2;
                n2 = temp;
            }
            System.out.println(temp);
        }
    }
}