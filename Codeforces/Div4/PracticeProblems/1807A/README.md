# Plus or Minus

| | |
| :--- | :--- |
| **Contest** | Codeforces Round 859 (Div. 4) |
| **Problem** | A |
| **URL** | [Link to Problem](https://codeforces.com/contest/1807/problem/A) |
| **Tags** | `implementation` |

---

## Problem Statement

A. Plus or Minus

time limit per test

1 second

memory limit per test

256 megabytes

input

standard input

output

standard output

You are given three integers $$$a$$$, $$$b$$$, and $$$c$$$ such that exactly one of these two equations is true:

*   $$$a+b=c$$$
*   $$$a-b=c$$$

Output + if the first equation is true, and \- otherwise.

Input

The first line contains a single integer $$$t$$$ ($$$1 \\leq t \\leq 162$$$) — the number of test cases.

The description of each test case consists of three integers $$$a$$$, $$$b$$$, $$$c$$$ ($$$1 \\leq a, b \\leq 9$$$, $$$-8 \\leq c \\leq 18$$$). The additional constraint on the input: it will be generated so that exactly one of the two equations will be true.

Output

For each test case, output either + or \- on a new line, representing the correct equation.

Example

Input

11

1 2 3

3 2 1

2 9 -7

3 4 7

1 1 2

1 1 0

3 3 6

9 9 18

9 9 0

1 9 -8

1 9 10

Output

+
-
-
+
+
-
+
+
-
-
+

Note

In the first test case, $$$1+2=3$$$.

In the second test case, $$$3-2=1$$$.

In the third test case, $$$2-9=-7$$$. Note that $$$c$$$ can be negative.

---

## Solution

**Language:** Java 21

**Performance:**
- **Time:** 281 ms
- **Memory:** 800 KB

```java
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
            String s = (a+b)==c ? "+" :"-";
            System.out.println(s);
        }
        
    }
}
```