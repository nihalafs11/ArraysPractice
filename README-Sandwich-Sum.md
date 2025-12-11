# Sandwich Sum

## **Objective**
Create functionality in a Java method that finds the sum of all integers strictly between the first occurrence of a "Start" number and the first occurrence of an "End" number in a list.

## **Problem Description**

You have a list of integers. You want to sum all the numbers strictly between the first occurrence of a "Start" number and the first occurrence of an "End" number.

**Example:**
- List: `[10, 5, 2, 8, 5, 9, 10]`
- Start number: `5`
- End number: `9`

**Steps:**
1. Find the index of the first occurrence of `5` - index 1
2. Find the index of the first occurrence of `9` - index 5
3. Sum the integers at indices between them (strictly between, not including start and end)
   - Indices between: 2, 3, 4
   - Values: 2, 8, 5
   - Sum: 2 + 8 + 5 = 15

**Expected result:** `15`

### **Method Signature**
```java
public static int sumBetween(ArrayList<Integer> numbers, int startNum, int endNum)
```

**Important**: Do not change the method signature or class name `SandwichSum` as it will break the autograder!

## **Expected result:**
```
Input:  numbers = [10, 5, 2, 8, 5, 9, 10], startNum = 5, endNum = 9
Output: 15

Explanation: First 5 is at index 1, first 9 is at index 5.
Numbers between (indices 2, 3, 4): 2 + 8 + 5 = 15
```

## **Common Compilation Errors**

If you see compilation errors like these:

```
[ERROR] cannot find symbol
[ERROR]   symbol:   class ArrayList
[ERROR]   location: class SandwichSum
[ERROR] cannot find symbol
[ERROR]   symbol:   variable Arrays
```

**What it means:** Java cannot find the `ArrayList` and `Arrays` classes because you haven't imported them.
