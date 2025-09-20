import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String s = "codeforces";
        int t= read.nextInt();
        read.nextLine();
        while(t-- > 0){
            String a = read.nextLine();
            int count = 0;
            for(int i=0;i<a.length();i++){
                if(s.charAt(i) != a.charAt(i)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}