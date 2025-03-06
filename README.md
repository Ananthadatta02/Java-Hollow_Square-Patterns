# Hollow Square Star Pattern - Java Program

This Java program generates a **hollow square pattern** made of stars (`*`). The user specifies the size of the square, and the program prints a square where only the boundary is filled with stars, while the inside is left empty (hollow).

## 📂 Package Declaration

```java
package star_patterns;
```

The program is part of the `star_patterns` package. This helps in organizing multiple pattern programs into a single directory or package.

---

## 📥 Import Statement

```java
import java.util.Scanner;
```

The program imports the `Scanner` class from `java.util` package to read input from the user (size of the square).

---

## 📝 Class Declaration

```java
public class HollwSquare
```

The program defines a public class named `HollwSquare`. This class contains the main logic to print the hollow square.

---

## 🏁 Main Method

```java
public static void main(String[] args)
```

This is the entry point of the program. Execution starts from here.

---

## 📥 Reading User Input

```java
Scanner s = new Scanner(System.in);
System.out.println("Enter Size");
int size = s.nextInt();
```

- A `Scanner` object is created to read input from the console.
- The program prompts the user to enter the size of the square.
- The entered size is stored in the `size` variable.

---

## 🔄 Outer Loop (Rows)

```java
for (int i = 1; i <= size; i++)
```

- This loop runs from `i = 1` to `i = size`.
- Each iteration prints one row of the square.

---

## 🔄 Inner Loop (Columns)

```java
for (int j = 1; j <= size; j++)
```

- This loop runs from `j = 1` to `j = size`.
- Each iteration prints one column in the current row.

---

## ✅ Condition to Print Stars

```java
if (size % 2 == 0)
{
    if (i == 1 || i == size || j == 1 || j == size)
    {
        System.out.print("* ");
    }
    else
    {
        System.out.print("  ");
    }
}
```

- The outer `if` checks if the size is even. This condition restricts the hollow square logic to even sizes only (this is a current limitation in the code).
- The inner `if` checks if the current cell belongs to the border (first row, last row, first column, last column). Border cells are printed as stars (`*`).
- All non-border cells are printed as spaces (`  `), creating the hollow effect.

---

## 📤 Moving to Next Line

```java
System.out.println();
```

At the end of each row, this prints a newline to move to the next row.

---

## 🏁 Complete Code

```java
package star_patterns;

import java.util.Scanner;

public class HollwSquare
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = s.nextInt();

        for (int i = 1; i <= size; i++)
        {
            for (int j = 1; j <= size; j++)
            {
                if (size % 2 == 0)
                {
                    if (i == 1 || i == size || j == 1 || j == size)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
```

## ✅ Example Output

```
Enter Size
4
* * * *
*     *
*     *
* * * *
```

---

## 📚 Summary Table

| Variable | Purpose |
|---|---|
| `s` | Scanner object for input |
| `size` | Holds the square size entered by user |
| `i` | Controls row iteration |
| `j` | Controls column iteration |

---

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Hollow_Square-Patterns.git
```
