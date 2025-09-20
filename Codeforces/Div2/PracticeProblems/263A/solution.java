import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] mat = new int[5][5];
        int a = 0;
        int b = 0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                mat[i][j] = read.nextInt();
                if(mat[i][j] == 1){
                    a = i;
                    b = j;
                    break;
                }
            }
        }
        int pos = Math.abs(2-a) + Math.abs(2-b);
        System.out.println(pos);
        
    }
}