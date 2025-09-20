import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        read.nextLine();
        while(t-- > 0){
            String s = read.nextLine();
            s = s.toLowerCase();
            if(s.equals("abc") || s.equals("acb") || s.equals("bac") || s.equals("cba")){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        
    }
}