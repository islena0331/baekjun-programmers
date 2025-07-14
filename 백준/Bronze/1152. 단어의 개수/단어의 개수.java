import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine().trim();
        
        if (a.isEmpty()) {
            System.out.println(0);
        } else {
            String[] word = a.split(" ");
            System.out.println(word.length);
        }
        sc.close();
    }
}