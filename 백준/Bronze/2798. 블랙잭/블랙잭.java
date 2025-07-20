import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        int m = sc.nextInt();
        int answer = 0;
        int sum = 0;
        
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n-2; i++){
            for(int j = i + 1; j < n-1; j++){
                for(int k = j + 1; k < n; k++){
                    sum = a[i] + a[j] + a[k];
                    if(sum <= m && sum > answer){
                        answer = sum;
                    }
                }
            }   
        }
        
        System.out.println(answer);

        sc.close();
    }
}