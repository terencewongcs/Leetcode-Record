# leetcode
## Homework
### Homework 2
<ol>
<li><a href="https://leetcode.com/problems/transpose-matrix/" >Transpose Matrix</a> <a href="https://github.com/terencewongcs/Leetcode-Record/blob/main/867.transpose-matrix.java" >[Github Link]</a>ans[j][i] = matrix[i][j]</li>
<li> <a href="https://leetcode.com/problems/shortest-word-distance/" >Shortest Word Distance</a> <a href="https://github.com/terencewongcs/Leetcode-Record/blob/main/243.%20Shortest%20Word%20Distance.java" >[Github Link]</a>find every word, pick the min distance</li>
<li> <a href="https://leetcode.com/problems/move-zeroes/" >Move Zeroes</a> <a href="https://github.com/terencewongcs/Leetcode-Record/blob/main/283.move-zeroes.java" >[Github Link]</a> two pointers, i to find 0, j to find !0</li>
<li> <a href="https://leetcode.com/problems/rotate-image/solution/" >Rotate Image</a> <a href="https://github.com/terencewongcs/Leetcode-Record/blob/main/48.rotate-image.java">[Github Link]</a>n-i-1 n-j-1 swap</li>
<li> <a href="https://leetcode.com/problems/spiral-matrix/" >Spiral Matrix</a> <a href="https://github.com/terencewongcs/Leetcode-Record/blob/main/54.spiral-matrix.java">[Github Link]</a> review</li>
<li><a href="https://leetcode.com/problems/isomorphic-strings/" >Isomorphic Strings</a> <a href="https://github.com/terencewongcs/Leetcode-Record/blob/main/205.isomorphic-strings.java">[Github Link]</a>build two hashmaps</li>
<li> <a href="https://leetcode.com/problems/add-strings/submissions/" >Add Strings</a> <a href="https://github.com/terencewongcs/Leetcode-Record/blob/main/415.add-strings.java">[Github Link]</a>竖式加法，按位加，进位</li>
<li> <a href="https://leetcode.com/problems/valid-palindrome/" >Valid Palindrome</a> <a href="https://github.com/terencewongcs/Leetcode-Record/blob/main/125.valid-palindrome.java">[Github Link]</a>Character.isLetterOrDigit Character.toLowerCase</li>
<li> <a href="https://leetcode.com/problems/reverse-words-in-a-string/" >Reverse words in a String</a> <a href="https://github.com/terencewongcs/Leetcode-Record/blob/main/151.reverse-words-in-a-string.java">[Github Link]</a> trim() split("\\s+")) Collections.reverse(wordList) String.join(" ", wordList)</li>
<li> <a href="https://leetcode.com/problems/string-compression/" >String Compression</a> <a href="https://github.com/terencewongcs/Leetcode-Record/blob/main/443.string-compression.java">[Github Link]</a> </li>
 </ol>

## CodeLab Fall 2021

### Week 1

<ol>
<li> <a href="https://leetcode.com/problems/multiply-strings/" >Multiply Strings</a> 竖式乘法，结果有i+j-1位</li>
<li> <a href="https://leetcode.com/problems/string-compression/"> String Compression</a>注意有多位数的情况，比如a12</li>
<li><a href="https://leetcode.com/problems/implement-strstr/" title="">Implement strStr()	</a>使用substring()</li>
<li><a href="https://leetcode.com/problems/merge-k-sorted-lists/" title="">Merge k Sorted Lists	</a>加到一个array里Collections.sort 新建linkNode</li>
<li><a href="https://leetcode.com/problems/merge-sorted-array/" title="">Merge Sorted Array	</a>直接把2加到1后面，Array.sort</li>
<li><a href="https://leetcode.com/problems/kth-largest-element-in-an-array/" title="">Kth Largest Element in an Array	</a>Array.sort 输出倒数第k个数</li>
<li><a href="https://leetcode.com/problems/search-in-rotated-sorted-array/" title="">Search in Rotated Sorted Array	</a>binary search 再看一次</li>
<li><a href="https://leetcode.com/problems/spiral-matrix/" title="">Spiral Matrix	</a>四个方向转</li>
<li><a href="https://leetcode.com/problems/merge-intervals/" title="">Merge Intervals	</a>先按interval[0]排序，再合并interval[0] <= tempInterval[1]的intervals</li>
<li><a href="https://leetcode.com/problems/3sum/">3 Sum  </a>two pointers, 2Sum=-a</li>
<li><a href="https://leetcode.com/problems/subdomain-visit-count/" title="">Subdomain Visit Count	</a>split("\\s+") HashMap</li>
<li><a href="https://leetcode.com/problems/reconstruct-original-digits-from-english/" title="">Reconstruct Original Digits from English	 </a></li>
<li><a href="https://leetcode.com/problems/expressive-words/" title="">Expressive Words	</a>判断重复字母</li>
<li><a href="https://leetcode.com/problems/count-binary-substrings/" title="">Count Binary Substrings	</a>存入连续串的长度，0*k+1*l，取k和l中较小的</li>
<li><a href="https://leetcode.com/problems/roman-to-integer/" title="">Roman to Integer	</a>4是1 5</li>
<li><a href="https://leetcode.com/problems/sort-array-by-increasing-frequency/ " title="">Sort Array by Increasing Frequency	</a> PriorityQueue</li>
<li><a href="https://leetcode.com/problems/maximum-product-of-three-numbers/" title="">Maximum Product of Three Numbers </a>sort max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3])</li>
<li><a href="https://leetcode.com/problems/missing-number/" title="">Missing Number	</a>等差数列</li>
<li><a href="https://leetcode.com/problems/contains-duplicate/" title="">Contains Duplicate	</a>sort before search or hashmap</li>
<li><a href="https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/" title="">Capacity To Ship Packages Within D Days	</a>binary search between max and sum</li>
<li><a href="https://leetcode.com/problems/rotate-array/" title="">Rotate Array	</a>new an array a[(i + k) % nums.length] = nums[i];</li>
<li><a href="https://leetcode.com/problems/find-peak-element/" title="">Find Peak Element	</a>if (nums[i] > nums[i + 1]) return i;</li>
<li><a href="https://leetcode.com/problems/move-zeroes/" title="">Move Zeroes	</a></li>
<li><a href="https://leetcode.com/problems/sort-colors/" title="">Sort Colors	</a></li>
<li><a href="https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/" title="">Find All Numbers Disappeared in an Array 	</a></li>
<li><a href="https://leetcode.com/problems/product-of-array-except-self/" title="">Product of Array Except Self	</a></li>
<li><a href="https://leetcode.com/problems/add-strings/" title="">Add Strings	</a></li>
<li><a href="https://leetcode.com/problems/valid-palindrome-ii/" title="">Valid Palindrome II	</a></li>
<li><a href="https://leetcode.com/problems/reorganize-string/" title="">Reorganize String	</a></li>
<li><a href="https://leetcode.com/problems/longest-common-prefix/" title="">Longest Common Prefix	</a></li>
<li><a href="https://leetcode.com/problems/group-anagrams/" title="">Group Anagrams	</a></li>
<li><a href="https://leetcode.com/problems/set-matrix-zeroes/" title="">Set Matrix Zeroes	 \</a></li>
<li><a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/" title="">Longest Substring Without Repeating Characters	</a></li>
<li><a href="https://leetcode.com/problems/increasing-triplet-subsequence/ " title="">Increasing Triplet Subsequence	</a></li>
<li><a href="https://leetcode.com/problems/summary-ranges/" title="">Missing Ranges	 </a></li>
<li><a href="https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/ " title="">Search for a Range	</a></li>
<li><a href="https://leetcode.com/problems/first-bad-version/" title="">First Bad Version	</a></li>
<li><a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/" title="">Best Time to Buy and Sell Stock II	 </a></li>
<li><a href="https://leetcode.com/problems/single-number/" title="">Single Number	 </a></li>
<li><a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/ " title="">Remove Duplicates from Sorted Array	</a></li>

</ol>
