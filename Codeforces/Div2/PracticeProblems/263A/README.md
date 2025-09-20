# Beautiful Matrix

| | |
| :--- | :--- |
| **Contest** | Codeforces Round 161 (Div. 2) |
| **Problem** | A |
| **URL** | [Link to Problem](https://codeforces.com/contest/263/problem/A) |
| **Tags** | `implementation` |

---

## Problem Statement

A. Beautiful Matrix

time limit per test

2 seconds

memory limit per test

256 megabytes

input

stdin

output

stdout

You've got a 5 × 5 matrix, consisting of 24 zeroes and a single number one. Let's index the matrix rows by numbers from 1 to 5 from top to bottom, let's index the matrix columns by numbers from 1 to 5 from left to right. In one move, you are allowed to apply one of the two following transformations to the matrix:

1.  Swap two neighboring matrix rows, that is, rows with indexes _i_ and _i_ + 1 for some integer _i_ (1 ≤ _i_ < 5).
2.  Swap two neighboring matrix columns, that is, columns with indexes _j_ and _j_ + 1 for some integer _j_ (1 ≤ _j_ < 5).

You think that a matrix looks beautiful, if the single number one of the matrix is located in its middle (in the cell that is on the intersection of the third row and the third column). Count the minimum number of moves needed to make the matrix beautiful.

Input

The input consists of five lines, each line contains five integers: the _j_\-th integer in the _i_\-th line of the input represents the element of the matrix that is located on the intersection of the _i_\-th row and the _j_\-th column. It is guaranteed that the matrix consists of 24 zeroes and a single number one.

Output

Print a single integer — the minimum number of moves needed to make the matrix beautiful.

Examples

Input

0 0 0 0 0  
0 0 0 0 1  
0 0 0 0 0  
0 0 0 0 0  
0 0 0 0 0  

Output

3  

Input

0 0 0 0 0  
0 0 0 0 0  
0 1 0 0 0  
0 0 0 0 0  
0 0 0 0 0  

Output

1

---

## Solution

**Language:** Java 21

**Performance:**
- **Time:** 592 ms
- **Memory:** 900 KB

```java
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
```