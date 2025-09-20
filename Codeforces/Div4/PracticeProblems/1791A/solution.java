import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        read.nextLine();
        String s = "codeforces";
        while(t-- > 0){
            String a = read.nextLine();
            if(s.contains(a)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            
        }
        
    }
}