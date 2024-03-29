Given an array of integers, calculate the ratios of its elements that are positive,
negative, and zero. Print the decimal value of each fraction on a new line with
6 places after the decimal.

Note:

This challenge introduces precision problems.
The test cases are scaled to six decimal places,
though answers with absolute error of up to 10⁴ are acceptable.

Example:

arr = [1, 1, 0, -1, -1]

There are n = 5 elements, two positive, two negative and one zero. Their ratios are 0.400000, 0.400000 and 0.200000.
Results are printed as: 0.400000, 0.400000, 0.200000.

Function Description: complete the plusMinus function.

plusMinus has the following parameter(s): int arr[n]: an array of integers.

Print the ratios of positive, negative and zero values in the array.
Each value should be printed on a separate line with 6 digits after the decimal.
The function should not return a value.

Input Format: n space-separated integers that describe arr[n].

Constraints:

0 < 1 <= 100

-100 <= arr[i] <= 100

Output Format:

Print the following 3 lines, each to 6 decimals:
proportion of positive values, proportion of negative values, proportion of zeros.

Sample Input: arr = [-4, 3, -9, 0, 4, 1]

Sample Output:

0.500000

0.333333

0.166667

https://www.hackerrank.com/challenges/plus-minus/problem
