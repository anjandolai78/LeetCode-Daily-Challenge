Problem

Find the indices of the target element after sorting the array in non-decreasing order.

Approach

Sort the array using Arrays.sort().

Create an empty ArrayList to store the indices.

Traverse the sorted array.

If the current element equals the target, add its index to the list.

Return the list.

Complexity Analysis

Time Complexity: O(n log n), because sorting takes O(n log n) time.

Space Complexity: O(n) for the result list in the worst case, excluding sorting space.
