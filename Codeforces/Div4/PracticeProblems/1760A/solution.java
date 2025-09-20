import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while(t-- > 0){
            int[] arr = new int[3];
            for(int i=0;i<3;i++){
                arr[i] = read.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[1]);
            
            
        }
        
    }
}