# Task Prioritizer

## **Objective**
Create functionality in a Java method that moves all "Later" tasks to the end of a task list, keeping "Urgent" tasks at the front. This problem demonstrates a common pitfall when modifying lists during iteration.

## **Problem Description**

You have a list of tasks. Some are marked as "Urgent" and some are "Later". You want to move all tasks labeled "Later" to the absolute end of the list, keeping the "Urgent" tasks at the front, but maintaining the relative order of the "Later" tasks among themselves.

**Tasks in the list:**
- Urgent
- Later
- Urgent
- Later
- Urgent

**Expected result after prioritizing:**
- Urgent
- Urgent
- Urgent
- Later
- Later

All "Urgent" tasks should be at the front, followed by all "Later" tasks at the end, maintaining their relative order.

### **Method Signature**
```java
public static void prioritize(ArrayList<String> tasks)
```

**Important**: Do not change the method signature or class name `TaskPrioritizer` as it will break the autograder!

## **Expected result:**
```
Input:  ["Urgent", "Later", "Urgent", "Later", "Urgent"]
Output: ["Urgent", "Urgent", "Urgent", "Later", "Later"]
```

## **Common Compilation Errors**

If you see compilation errors like these:

```
[ERROR] cannot find symbol
[ERROR]   symbol:   class ArrayList
[ERROR]   location: class TaskPrioritizer
[ERROR] cannot find symbol
[ERROR]   symbol:   variable Arrays
```

**What it means:** Java cannot find the `ArrayList` and `Arrays` classes because you haven't imported them.
