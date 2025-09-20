# Odd One Out

| | |
| :--- | :--- |
| **Contest** | Codeforces Round 918 (Div. 4) |
| **Problem** | A |
| **URL** | [Link to Problem](https://codeforces.com/contest/1915/problem/A) |
| **Tags** | `bitmasks`, `implementation` |

---

## Problem Statement

A. Odd One Out

time limit per test

1 second

memory limit per test

256 megabytes

input

standard input

output

standard output

You are given three digits $$$a$$$, $$$b$$$, $$$c$$$. Two of them are equal, but the third one is different from the other two.

Find the value that occurs exactly once.

Input

The first line contains a single integer $$$t$$$ ($$$1 \\leq t \\leq 270$$$) — the number of test cases.

The only line of each test case contains three digits $$$a$$$, $$$b$$$, $$$c$$$ ($$$0 \\leq a$$$, $$$b$$$, $$$c \\leq 9$$$). Two of the digits are equal, but the third one is different from the other two.

Output

For each test case, output the value that occurs exactly once.

Example

Input

10

1 2 2

4 3 4

5 5 6

7 8 8

9 0 9

3 6 3

2 8 2

5 7 7

7 7 5

5 7 5

Output

1
3
6
7
0
6
8
5
5
7

---

## Solution

**Language:** Java 21

**Performance:**
- **Time:** 281 ms
- **Memory:** 900 KB

```java
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
            if((a!=b) && (a!=c)){
                System.out.println(a);
            }
            else if((b!=a) && (b!=c)){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }
        
    }
}
```