# Codeforces Checking

| | |
| :--- | :--- |
| **Contest** | Codeforces Round 849 (Div. 4) |
| **Problem** | A |
| **URL** | [Link to Problem](https://codeforces.com/contest/1791/problem/A) |
| **Tags** | `implementation`, `strings` |

---

## Problem Statement

A. Codeforces Checking

time limit per test

1 second

memory limit per test

256 megabytes

input

standard input

output

standard output

Given a lowercase Latin character (letter), check if it appears in the string $$$\\texttt{codeforces}$$$.

Input

The first line of the input contains an integer $$$t$$$ ($$$1 \\leq t \\leq 26$$$) — the number of test cases.

The only line of each test case contains a character $$$c$$$ — a single lowercase Latin character (letter).

Output

For each test case, output "YES" (without quotes) if $$$c$$$ satisfies the condition, and "NO" (without quotes) otherwise.

You can output the answer in any case (for example, the strings "yEs", "yes", "Yes" and "YES" will be recognized as a positive answer).

Example

Input

10

a

b

c

d

e

f

g

h

i

j

Output

NO
NO
YES
YES
YES
YES
NO
NO
NO
NO

---

## Solution

**Language:** Java 21

**Performance:**
- **Time:** 296 ms
- **Memory:** 300 KB

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        read.nextLine();
        String s = "codeforces";
        while(t-- > 0){
            String a = read.nextLine();
            if(s.contains(a)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            
        }
        
    }
}
```