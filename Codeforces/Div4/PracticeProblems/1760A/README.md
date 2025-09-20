# Medium Number

| | |
| :--- | :--- |
| **Contest** | Codeforces Round 835 (Div. 4) |
| **Problem** | A |
| **URL** | [Link to Problem](https://codeforces.com/contest/1760/problem/A) |
| **Tags** | `implementation`, `sortings` |

---

## Problem Statement

A. Medium Number

time limit per test

1 second

memory limit per test

256 megabytes

input

standard input

output

standard output

Given three distinct integers $$$a$$$, $$$b$$$, and $$$c$$$, find the medium number between all of them.

The medium number is the number that is neither the minimum nor the maximum of the given three numbers.

For example, the median of $$$5,2,6$$$ is $$$5$$$, since the minimum is $$$2$$$ and the maximum is $$$6$$$.

Input

The first line contains a single integer $$$t$$$ ($$$1 \\leq t \\leq 6840$$$) — the number of test cases.

The description of each test case consists of three distinct integers $$$a$$$, $$$b$$$, $$$c$$$ ($$$1 \\leq a, b, c \\leq 20$$$).

Output

For each test case, output a single integer — the medium number of the three numbers.

Example

Input

9

5 2 6

14 3 4

20 2 1

1 2 3

11 19 12

10 8 20

6 20 3

4 1 3

19 8 4

Output

5
4
2
2
12
10
6
3
8

---

## Solution

**Language:** Java 21

**Performance:**
- **Time:** 312 ms
- **Memory:** 900 KB

```java
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
```