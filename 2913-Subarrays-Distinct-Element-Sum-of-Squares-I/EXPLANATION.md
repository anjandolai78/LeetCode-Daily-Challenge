# LeetCode 2913 - Subarrays Distinct Element Sum of Squares I

**Difficulty:** Easy

**Language:** Java

**Problem Link:** https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-i/

## Problem Explanation

In this problem, we are given an integer array. We need to find all possible non-empty contiguous subarrays.

For each subarray, we count how many distinct elements it contains, square that count, and add the result to the final sum.

## Example

Input: nums = [1, 2, 1]

Output: 15

## Step-by-Step Explanation

Step 1: Start with the first element.

The subarray is [1]. It contains one distinct element.

Count = 1

Square = 1 × 1 = 1

Step 2: Extend the subarray by adding the next element.

The subarray becomes [1, 2]. It contains two distinct elements: 1 and 2.

Count = 2

Square = 2 × 2 = 4

Step 3: Add the next element.

The subarray becomes [1, 2, 1]. Although the element 1 appears twice, we count it only once because we need distinct elements.

Distinct elements = 1, 2

Count = 2

Square = 2 × 2 = 4

Step 4: Start from the second element.

The subarray is [2]. It contains one distinct element.

Square = 1

Step 5: Extend the subarray.

The subarray becomes [2, 1]. It contains two distinct elements.

Square = 2 × 2 = 4

Step 6: Start from the third element.

The subarray is [1]. It contains one distinct element.

Square = 1

## Final Answer

Add the results of all the subarrays:

1 + 4 + 4 + 1 + 4 + 1 = 15

Therefore, the answer is 15.

## Approach

I used two nested loops to generate all possible contiguous subarrays.

The outer loop selects the starting index, and the inner loop extends the subarray one element at a time.

I used a HashSet to store distinct elements because it automatically ignores duplicate values.

After adding each element, I calculated the square of the HashSet size and added it to the total sum.

Finally, I returned the total sum.

## Complexity Analysis

Time Complexity: O(n²), because we generate all possible subarrays using nested loops.

Space Complexity: O(n), because the HashSet can store up to n distinct elements.

## Key Learning

This problem helped me understand how to generate subarrays using nested loops and how to use a HashSet to count distinct elements efficiently.
