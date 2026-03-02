💡 Core Idea (Understand This Properly)

For an n x n grid:

Row i (0-indexed) must have at least (n - i - 1) trailing zeros.

Why?

Because all cells above the main diagonal must be 0.

So:

Row Index (i)	Required trailing zeros
0	n - 1
1	n - 2
2	n - 3
...	...
n - 1	0
🔥 Strategy

Count trailing zeros for every row.

For each row i, find a row below it that satisfies the required zeros.

Bring it upward using adjacent swaps.

Count swaps.

If no such row exists → return -1.

This is basically like bubble sort movement.

🧠 Why Greedy Works?

Because:

We fix rows from top to bottom.

Once fixed, we never touch them again.

We always bring the nearest valid row upward → minimum swaps.

Simple and powerful.