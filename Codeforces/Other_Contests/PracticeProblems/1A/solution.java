import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double n = read.nextInt();
        double m = read.nextInt();
        double a = read.nextInt();
        long p =(long)Math.ceil(n / a);
        long o =(long)Math.ceil(m / a);
        System.out.println(p*o);
    }
}