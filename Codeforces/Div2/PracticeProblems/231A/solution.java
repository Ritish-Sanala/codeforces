import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        int count = 0;
        while(t-- > 0){
            int a = read.nextInt();
            int b = read.nextInt();
            int c = read.nextInt();
            if((a+b+c) >= 2){
                count++;
            }
        }
        System.out.println(count);
        
    }
}