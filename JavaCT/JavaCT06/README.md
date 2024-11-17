conditional statement--

1. if
2. if else
3. if 
    else if
    else
4. Nested if else
5. Switch (else without if is not a valid sentence)

q1. if 


In Java, conditional statements allow you to execute different sections of code based on whether a condition (an expression) evaluates to true or false. These statements are essential for controlling the flow of a program, enabling it to make decisions and perform different actions depending on various situations.

1. if statement
The if statement is the most basic form of conditional in Java. It evaluates a condition, and if the condition is true, the associated block of code is executed.

Syntax:
java
Copy code
if (condition) {
    // code to be executed if condition is true
}
Condition: The expression inside the parentheses is evaluated. If it evaluates to true, the code inside the block runs; otherwise, it is skipped.
Example:
java
Copy code
int x = 10;

if (x > 5) {
    System.out.println("x is greater than 5");
}
Output:

csharp
Copy code
x is greater than 5
If x were less than or equal to 5, nothing would be printed.

2. if-else statement
The if-else statement provides an alternative path. If the condition is true, one block of code executes; if the condition is false, a different block executes.

Syntax:
java
Copy code
if (condition) {
    // code to be executed if condition is true
} else {
    // code to be executed if condition is false
}
Example:
java
Copy code
int x = 3;

if (x > 5) {
    System.out.println("x is greater than 5");
} else {
    System.out.println("x is not greater than 5");
}
Output:

csharp
Copy code
x is not greater than 5
If x were greater than 5, the message "x is greater than 5" would be printed instead.

3. if-else if-else statement
The if-else if-else statement allows you to check multiple conditions sequentially. If the first condition is false, it checks the second condition, and so on. If none of the conditions is true, the final else block is executed.

Syntax:
java
Copy code
if (condition1) {
    // code if condition1 is true
} else if (condition2) {
    // code if condition2 is true
} else {
    // code if none of the conditions are true
}
Example:
java
Copy code
int x = 10;

if (x < 5) {
    System.out.println("x is less than 5");
} else if (x == 10) {
    System.out.println("x is equal to 10");
} else {
    System.out.println("x is greater than 5 but not equal to 10");
}
Output:

vbnet
Copy code
x is equal to 10
The program first checks if x is less than 5. Since it is not, it moves to the next condition (x == 10), which is true, so the message "x is equal to 10" is printed.

4. switch statement
The switch statement is another way to execute code based on the value of a variable. It's often used when you need to compare the same variable or expression to different constant values.

Syntax:
java
Copy code
switch (expression) {
    case value1:
        // code block if expression equals value1
        break;
    case value2:
        // code block if expression equals value2
        break;
    // ...
    default:
        // code block if none of the cases match
}
Expression: This is the value you're testing.
Case: Each case represents a possible value that expression could equal.
Break: The break statement exits the switch block. If omitted, execution will "fall through" to the next case.
Default: The default case is optional and executes if none of the case values match.
Example:
java
Copy code
int day = 2;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}
Output:

mathematica
Copy code
Tuesday
Here, since day is 2, the second case is executed, printing "Tuesday".

5. Nested Conditional Statements
You can nest conditional statements within each other, meaning one conditional block can contain other conditionals. This is useful when you need to perform more complex decision-making.

Example:
java
Copy code
int x = 10;
int y = 20;

if (x > 5) {
    if (y > 10) {
        System.out.println("x is greater than 5 and y is greater than 10");
    } else {
        System.out.println("x is greater than 5 but y is not greater than 10");
    }
} else {
    System.out.println("x is not greater than 5");
}
Output:

csharp
Copy code
x is greater than 5 and y is greater than 10
Here, the outer if checks if x > 5, and if true, the inner if checks if y > 10.

6. Ternary Operator
Java also has a shorthand for if-else using the ternary operator (? :). This is typically used for simple conditionals that return values.

Syntax:
java
Copy code
result = (condition) ? value_if_true : value_if_false;
Example:
java
Copy code
int x = 5;
String result = (x > 10) ? "Greater" : "Smaller or equal";
System.out.println(result);
Output:

mathematica
Copy code
Smaller or equal
In this example, if x is greater than 10, the string "Greater" would be assigned to result; otherwise, "Smaller or equal" is assigned.

Summary of Conditional Statements:
if: Executes a block of code if the condition is true.
if-else: Executes one block of code if true, another if false.
if-else if-else: Checks multiple conditions sequentially.
switch: Checks a variable against multiple values, and executes a block for the matching value.
Nested conditions: Conditions inside other conditions for more complex decision-making.
Ternary operator: A shorthand for simple if-else expressions.
Best Practices:
Avoid deeply nested conditionals: Deep nesting can make code difficult to read and maintain. Try to refactor complex logic into smaller methods.
Use switch for multiple exact matches: When you have many conditions that check a variable against constant values, switch is often clearer than multiple if-else statements.
Short-circuit logic: Java supports short-circuit evaluation for logical operators (&& and ||). This means that for &&, if the first condition is false, the second is not evaluated. Similarly, for ||, if the first condition is true, the second is not evaluated.
These are the basic conditional statements in Java, and understanding how and when to use them is essential for controlling the flow of your program.