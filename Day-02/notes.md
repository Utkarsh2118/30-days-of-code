👇

🧩 Problem — Alternating Bits

Given a positive integer n, check whether its binary representation has alternating bits, meaning every pair of adjacent bits must be different (0 followed by 1 or 1 followed by 0).

If any two neighboring bits are the same, return false. Otherwise, return true.

🎯 Goal

Determine whether the binary form of the number follows a pattern like:

✅ Valid: 101010, 0101

❌ Invalid: 111, 1001, 110

🧠 Approach

Extract the last bit using bitwise AND (n & 1).

Shift the number right (n >> 1) to check the next bit.

Compare current bit with previous bit.

If they are equal → not alternating → return false.

Continue until all bits are checked.

If no violation found → return true.

⏱ Complexity

Time: O(log n) → we check each bit once.

Space: O(1) → no extra memory used.