# Sum

| | |
| :--- | :--- |
| **Contest** | Codeforces Round 827 (Div. 4) |
| **Problem** | A |
| **URL** | [Link to Problem](https://codeforces.com/contest/1742/problem/A) |
| **Tags** | `implementation` |

---

## Problem Statement

A. Sum

time limit per test

1 second

memory limit per test

256 megabytes

input

standard input

output

standard output

You are given three integers $$$a$$$, $$$b$$$, and $$$c$$$. Determine if one of them is the sum of the other two.

Input

The first line contains a single integer $$$t$$$ ($$$1 \\leq t \\leq 9261$$$) — the number of test cases.

The description of each test case consists of three integers $$$a$$$, $$$b$$$, $$$c$$$ ($$$0 \\leq a, b, c \\leq 20$$$).

Output

For each test case, output "YES" if one of the numbers is the sum of the other two, and "NO" otherwise.

You can output the answer in any case (for example, the strings "yEs", "yes", "Yes" and "YES" will be recognized as a positive answer).

Example

Input

7

1 4 3

2 5 8

9 11 20

0 0 0

20 20 20

4 12 3

15 7 8

Output

YES
NO
YES
YES
NO
NO
YES

Note

In the first test case, $$$1 + 3 = 4$$$.

In the second test case, none of the numbers is the sum of the other two.

In the third test case, $$$9 + 11 = 20$$$.

---

## Solution

**Language:** Java 21

**Performance:**
- **Time:** 437 ms
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
            if((a+b)==c || (b+c) == a || (c+a) == b){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        
    }
}
```