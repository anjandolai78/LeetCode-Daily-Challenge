# LeetCode 3886 – Sum of Sortable Integers

**Difficulty:** Hard  
**Language:** Java  
**Topics:** Arrays, Prefix Maximum, Suffix Minimum, Divisors

## Problem Overview

Given an integer array `nums`, determine the sum of all valid block sizes `k` that satisfy the problem's sorting conditions.

For each valid `k`:

- `k` must divide the length of the array.
- Divide the array into consecutive blocks of size `k`.
- Each block can be cyclically rotated independently.
- After rotating the blocks, the entire array must be sorted in non-decreasing order.

Return the sum of all valid values of `k`.

## Approach

The solution uses prefix and suffix arrays to check each possible block size efficiently.

### 1. Prefix Maximum

`prefMax[i]` stores the maximum element among the elements before index `i`.

It helps verify that the elements preceding a block do not exceed the minimum element in the remaining suffix.

### 2. Suffix Minimum

`suffMin[i]` stores the minimum element from index `i` to the end of the array.

It is used with the prefix maximum array to verify the global ordering condition.

### 3. Prefix Descent Count

`prefDrop[i]` stores the number of adjacent descents up to index `i`.

A block can be sorted through cyclic rotation if its circular descent count is at most one.

### 4. Check Valid Block Sizes

Only divisors of `n`, where `n` is the array length, are considered.

For every divisor `k`, check whether all blocks satisfy the rotation and global ordering conditions. If valid, add `k` to the answer.

## Complexity Analysis

- **Time Complexity:** `O(n × τ(n) + √n)`, where `τ(n)` is the number of positive divisors of `n`.
- **Space Complexity:** `O(n)` for the auxiliary arrays.

## Key Concepts Learned

- Prefix maximum and suffix minimum arrays
- Prefix counting techniques
- Divisor enumeration
- Cyclic rotations
- Array partitioning
- Efficient validation using preprocessing

## Language

Java

---

*Solution added as part of my LeetCode problem-solving practice.*
