import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        
        Set<String> set = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        
         for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");
            
            switch(command[1]){
                
                case "enter":
                    set.add(command[0]);
                    break;
                    
                case "leave":
                    set.remove(command[0]);
            }  
         }
        
        List<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());
        
        for(String a : list) 
            System.out.println(a);
     }
}