# Inventory Purge 

## **Objective**
Create functionality in a Java method that removes all recalled items from a store inventory shelf. This problem demonstrates a common pitfall when removing elements from an ArrayList during iteration.

## **Problem Description**

You are managing a store inventory. You have a master list of items currently on the shelf. You receive a second list of "Recalled Items." You must remove every item from the shelf that appears on the recalled list.

**Items on the shelf:**
- apple, banana, orange, grape, kiwi, mango
- Dax's Hockey Stick
- Adam's Squid Games Bread
- Broken Polytrack Wheel
- watermelon, pineapple

**Items to remove (recalled items):**
- Dax's Hockey Stick
- Adam's Squid Games Bread
- Broken Polytrack Wheel

After removing these 3 items, the shelf should contain 8 items: apple, banana, orange, grape, kiwi, mango, watermelon, pineapple.

### **Method Signature**
```java
public static void purgeInventory(ArrayList<String> shelf, ArrayList<String> recalled)
```

**Important**: Do not change the method signature or class name `InventoryPurge` as it will break the autograder!

Your solution will be tested with various scenarios:
- Basic removal of multiple items
- No recalled items (nothing should be removed)
- Consecutive recalled items (tests the index skip trap!)
- Multiple recalled items
- Removal from beginning of list
- Removal from end of list

## **Expected result:**
```
shelf = ["apple", "banana", "orange", "grape", "kiwi", "mango", "watermelon", "pineapple"]
```

## **Common Compilation Errors**

If you see compilation errors like these:

```
[ERROR] cannot find symbol
[ERROR]   symbol:   class ArrayList
[ERROR]   location: class InventoryPurge
[ERROR] cannot find symbol
[ERROR]   symbol:   variable Arrays
```

**What it means:** Java cannot find the `ArrayList` and `Arrays` classes because you haven't imported them.


