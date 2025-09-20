import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while(t-- > 0){
            int a = read.nextInt();
            int b = read.nextInt();
            int c = read.nextInt();
            if((a+b)==c || (b+c) == a || (c+a) == b){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        
    }
}