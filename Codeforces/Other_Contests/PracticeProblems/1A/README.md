# Theatre Square

| | |
| :--- | :--- |
| **Contest** | Codeforces Beta Round 1 |
| **Problem** | A |
| **URL** | [Link to Problem](https://codeforces.com/contest/1/problem/A) |
| **Tags** | `math` |

---

## Problem Statement

A. Theatre Square

time limit per test

1 second

memory limit per test

256 megabytes

input

stdin

output

stdout

Theatre Square in the capital city of Berland has a rectangular shape with the size _n_ × _m_ meters. On the occasion of the city's anniversary, a decision was taken to pave the Square with square granite flagstones. Each flagstone is of the size _a_ × _a_.

What is the least number of flagstones needed to pave the Square? It's allowed to cover the surface larger than the Theatre Square, but the Square has to be covered. It's not allowed to break the flagstones. The sides of flagstones should be parallel to the sides of the Square.

Input

The input contains three positive integer numbers in the first line: _n_,  _m_ and _a_ (1 ≤  _n_, _m_, _a_ ≤ 109).

Output

Write the needed number of flagstones.

Examples

Input

6 6 4  

Output

4

---

## Solution

**Language:** Java 21

**Performance:**
- **Time:** 280 ms
- **Memory:** 900 KB

```java
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
```