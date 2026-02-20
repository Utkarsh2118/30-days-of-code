🔹 Definition

A special binary string is a binary string that satisfies:

The number of 1s is equal to the number of 0s.

For every prefix of the string, the number of 1s is greater than or equal to the number of 0s.

This is similar to a balanced parentheses sequence, where:

1 represents an opening bracket.

0 represents a closing bracket.

🔹 Problem Objective

Given a special binary string s, we can perform moves where we swap two consecutive non-empty special substrings.

The goal is to obtain the lexicographically largest string possible after any number of such swaps.

🔹 Key Observations

A special string can be decomposed into smaller special substrings.

Since swapping adjacent special substrings is allowed, their order can be rearranged.

To maximize lexicographic order, substrings with larger values (more leading 1s) should appear earlier.

Special substrings can be nested, so we must also optimize their internal structure.

🔹 Approach (Conceptual Steps)

Traverse the string and use a counter:

Increment for 1.

Decrement for 0.

Whenever the counter becomes zero, a valid special substring is identified.

Recursively process the inner part of each substring to make it lexicographically largest.

Wrap the processed inner string with outer 1 and 0.

Collect all such substrings and sort them in descending lexicographic order.

Concatenate the sorted substrings to form the final result.

🔹 Why Sorting Works

Because allowed swaps effectively let us reorder adjacent special substrings, arranging them in descending order ensures the overall string is maximized lexicographically.

🔹 Complexity

Time Complexity: O(n²) due to recursion and sorting.

Space Complexity: O(n) for recursion and substring storage.

🔹 Intuition Summary

Break the string into balanced blocks, optimize each block recursively, then arrange blocks from largest to smallest to push more 1s toward the front.