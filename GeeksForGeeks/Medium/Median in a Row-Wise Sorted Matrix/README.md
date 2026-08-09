# Median in a Row-Wise Sorted Matrix

## Difficulty: Medium

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1)

## Solved On
10 Aug 2026 at 12:53 am

<h2><a href="https://www.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1">Median in a Row-Wise Sorted Matrix</a></h2><h3>Difficulty Level: Medium</h3><hr><p><span style="font-size: 14pt;">Given a row-wise sorted matrix&nbsp;</span><strong style="font-size: 18.6667px;">mat[][]</strong><span style="font-size: 14pt;"> of size&nbsp;<strong>n x m</strong>, where the number of rows and columns is always </span><strong style="font-size: 14pt;">odd</strong><span style="font-size: 14pt;">.&nbsp;Return the <strong>median</strong> of the matrix.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input</strong>: mat[][] = [[1, 3, 5], [2, 6, 9], [3, 6, 9]]
<strong>Output:</strong>&nbsp;5
<strong>Explanation</strong>: Sorting matrix elements gives us [1, 2, 3, 3, 5, 6, 6, 9, 9]. Hence, 5 is median.
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>mat[][] = [[2, 4, 9], [3, 6, 7], [4, 7, 10]]
<strong>Output: </strong>6
<strong>Explanation</strong>: Sorting matrix elements gives us [2, 3, 4, 4, 6, 7, 7, 9, 10]. Hence, 6 is median.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>mat = [[3], [4], [8]]
<strong>Output: </strong>4
<strong>Explanation</strong>: Sorting matrix elements gives us [3, 4, 8]. Hence, 4 is median.<br></span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ n, m ≤ 400<br>1 ≤ mat[i][j] ≤ 2000</span></p>