import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        read.nextLine();
        while(t-- > 0){
            int a = read.nextInt();
            int b = read.nextInt();
            int c = read.nextInt(); 
            String s = ((a+b)>=10 || (b+c)>=10 || (a+c)>=10) ? "Yes" : "No";
            System.out.println(s);
        }
        
    }
}