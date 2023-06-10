# LeetCode

1. [1-top-k-freq-els](https://leetcode.com/problems/top-k-frequent-elements/)

Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

2. [2-pow(x,n)](https://leetcode.com/problems/powx-n/)

Implement pow(x, n), which calculates x raised to the power n.

3. [3-longest-substr](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

Given a string s, find the length of the longest substring without repeating characters. 3 solutions produced each with O(N^3), O(2N) AND O(N)

4. [4-kth-largest-el](https://leetcode.com/problems/kth-largest-element-in-a-stream/)

Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order, not the kth distinct element. Incomplete.

5. [5-check-straight-line](https://leetcode.com/problems/check-if-it-is-a-straight-line/)

You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.

6. [6-two-sum](https://leetcode.com/problems/two-sum/)

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. Complete: solution with O(n^2). Incomplete: solution with O(nlogn).

7. [7-can-make-ap](https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/)

Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.

8. [8-valid-parentheses](https://leetcode.com/problems/valid-parentheses/)

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

9. [9-longest-common-prefix](https://leetcode.com/problems/longest-common-prefix/)

Write a function to find the longest common prefix string amongst an array of strings.

10. [10-min-flips](https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/)

Given 3 positives numbers a, b and c. Return the minimum flips required in some bits of a and b to make ( a OR b == c ). (bitwise OR operation).

11. [11-negatives-in-matrix](https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/)

Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid. Did O(nm) and O(n + m)

12. [12-smallest-letter-greater-than-target](https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/)

You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

13. [13-max-value](https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/description/)

You are given three positive integers: n, index, and maxSum. You want to construct an array nums (0-indexed) that satisfies the following conditions:

nums.length == n
nums[i] is a positive integer where 0 <= i < n.
abs(nums[i] - nums[i+1]) <= 1 where 0 <= i < n-1.
The sum of all the elements of nums does not exceed maxSum.
nums[index] is maximized.
Return nums[index] of the constructed array.

Note that abs(x) equals x if x >= 0, and -x otherwise.

