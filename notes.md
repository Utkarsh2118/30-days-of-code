🌳 Sum of Root-to-Leaf Binary Numbers — Java Notes
🧾 Problem Summary

You are given the root of a binary tree where each node contains either 0 or 1.
Each root-to-leaf path represents a binary number (root is the most significant bit).

Your task is to find the sum of all numbers formed by these paths.

💡 Core Concept

Instead of storing the full path and converting later, build the number as you traverse:

current = current * 2 + node.val

Why?

Multiplying by 2 shifts bits left in binary.

Adding node.val appends the current bit.

🛠 Approach (DFS — Depth First Search)

Start traversal from the root with current = 0.

Update the number at each node.

If a leaf node is reached:

Add the number to the total.

Recursively explore left and right.

Return the total sum.