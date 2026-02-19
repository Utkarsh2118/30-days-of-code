Given a binary string s (containing only 0 and 1), return the number of non-empty substrings that:

✅ Have equal number of 0s and 1s
✅ All 0s are grouped together and all 1s are grouped together
✅ Count duplicates separately

📌 Example

Input:

s = "00110011"


Output:

6


Why?

Valid substrings:

0011
01
1100
10
0011
01


Total = 6

💡 Key Idea (Important Insight)

Valid substrings always look like:

000111
0011
01
1100


Meaning:

👉 A block of same digits followed by another block
👉 Both blocks have equal length

So instead of checking all substrings, we:

1️⃣ Count consecutive groups
2️⃣ Compare adjacent groups
3️⃣ Add the minimum length