# Love Story

| | |
| :--- | :--- |
| **Contest** | Codeforces Round 871 (Div. 4) |
| **Problem** | A |
| **URL** | [Link to Problem](https://codeforces.com/contest/1829/problem/A) |
| **Tags** | `implementation`, `strings` |

---

## Problem Statement

A. Love Story

time limit per test

1 second

memory limit per test

256 megabytes

input

standard input

output

standard output

Timur loves codeforces. That's why he has a string $$$s$$$ having length $$$10$$$ made containing only lowercase Latin letters. Timur wants to know how many indices string $$$s$$$ differs from the string "codeforces".

For example string $$$s =$$$ "coolforsez" differs from "codeforces" in $$$4$$$ indices, shown in bold.

Help Timur by finding the number of indices where string $$$s$$$ differs from "codeforces".

Note that you can't reorder the characters in the string $$$s$$$.

Input

The first line contains a single integer $$$t$$$ ($$$1 \\leq t \\leq 1000$$$) — the number of test cases.

Each test case is one line and contains the string $$$s$$$, consisting of exactly $$$10$$$ lowercase Latin characters.

Output

For each test case, output a single integer — the number of indices where string $$$s$$$ differs.

Example

Input

5

coolforsez

cadafurcie

codeforces

paiuforces

forcescode

Output

4
5
0
4
9

---

## Solution

**Language:** Java 21

**Performance:**
- **Time:** 296 ms
- **Memory:** 1100 KB

```java
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
```