import java.util.Scanner;

public class Main{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
         
       String a = sc.next();
       String[] b = a.split("");
       int n = 1;
       
       for(int i = 0; i < a.length() / 2; i++){
           if(!b[i].equals(b[a.length() - 1 - i])){
               n = 0;
               break;
           }
       }
       System.out.println(n);
       
       sc.close();
    }
}