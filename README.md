<p align="center">
    <h2 align="center">Ayang818`s LeetCode/NowCoder Solutions</h2>
    <p align="center">Keep Updating!<p>
</p>

> 不包括数据库和多线程的一些题目，这些虽然也有做，但是打算以后再整理

|ID|Title(Problem link)|Solution|Type|
|---|---|---|---|
|牛客-字节跳动|[万万没想到之聪明的编辑](https://www.nowcoder.com/questionTerminal/42852fd7045c442192fa89404ab42e92)|[Java](/nowcoder/万万没想到之聪明的编辑.java)|牛客上刷的第一题，首先注意Java中输入是hasNext()；这道题的解法是双指针，当然我是用StringBuilder，但是效果也一样，只要维护StringBuilder中最后三位和最后四位数组满足编辑关系即可|
|牛客-字节跳动|[万万没想到之抓捕孔连顺](https://www.nowcoder.com/questionTerminal/c0803540c94848baac03096745b55b9b)|[Java](/nowcoder/万万没想到之抓捕孔连顺.java)|这道题需要注意的地方其实就是精度，需要提前取模是我这里错的最多的点。然后思路其实就是也是双指针，首先让一个指针跑到第一个满足要求的跨度最大的区间，然后开始移动还在头部的第二个指针。头部每移动一次，先把尾指针往后移动至最大区间，每次移动加上总数Cn-1取2中站法(固定头部，选取尾部)，最后得到总站法|
|牛客-字节跳动|[特征提取](https://www.nowcoder.com/questionTerminal/5afcf93c419a4aa793e9b325d01957e2)|[Java](/nowcoder/特征提取.java)|这道题我的做法有点鬼畜，先把所有的帧读入一个数组，每个帧中使用集合维护，然后从每个帧的特征开始往下一帧做dfs，每找到一帧中有相同的特征，在集合中删除这个特征(剪枝)，最后比较那个连续特征出现最多(效率居然还行，说明数据比较水，这么暴力的剪枝都能过)|
|1|[两数之和](https://leetcode-cn.com/problems/two-sum/)|[Python](/easy/leetcode1.py)|哈希|
|2|[两数相加](https://leetcode-cn.com/problems/add-two-numbers/)|[Java](/medium/leetcode2.java)|2020/2/12优化了下写法，当两个链表不都为空时，相加，补进位。根据相加结果更新进位。遍历完之后，看看最后进位是否为1，若是1再补上一个1节点|
|3|[无重复字符的最大子串](https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/)|[Java](/medium/leetcode3.java)|哈希+滑动窗口(双指针)|
|4|[寻找两个有序数组中的中位数](https://leetcode-cn.com/problems/median-of-two-sorted-arrays/)|[Java](/hard/leetcode4.java)|二分搜索+初等数学|
|5|[最长回文子串](https://leetcode-cn.com/problems/longest-palindromic-substring)|[Java](/medium/leetcode5.java)|动态规划 dp[i][j]|
|6|[Z字形变换](https://leetcode-cn.com/problems/zigzag-conversion)|[Java](/medium/leetcode6.java)|思维题 + 二维数组滑动|
|7|[整数反转](https://leetcode-cn.com/problems/reverse-integer)|[Java](/easy/leetcode7.java)|按位截取就完事儿|
|8|[字符串转换整数 (atoi)](https://leetcode-cn.com/problems/string-to-integer-atoi)|[Java](/medium/leetcode8.java)|挺烦的一题，思路就是一个大模拟|
|9|[回文数](https://leetcode-cn.com/problems/palindrome-number)|[Python](/easy/leetcode9.py)|简单题|
|11|[盛最多水的容器](https://leetcode-cn.com/problems/container-with-most-water)|[Java](/medium/leetcode11.java)|双指针+贪心|
|13|[罗马数字转整数](https://leetcode-cn.com/problems/roman-to-integer)|[Python](/easy/leetcode13.py)|简单思维题|
|14|[最长公共前缀](https://leetcode-cn.com/problems/longest-common-prefix)|[Python](/easy/leetcode14.java)|最快的是字典树，最简单的是每位比较O(n^2)，需要考虑极端情况|
|15|[三数之和](https://leetcode-cn.com/problems/3sum)|[Java](/medium/leetcode15.java)|确定一位，其他两个按照两数之和做,我的做法是剪枝后才过的O(n^2)|
|17|[电话号码的字母组合](https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number)|[Java](/medium/leetcode17.java)||
|19|[删除链表的倒数第N个节点](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list)|[Java](/medium/leetcode19.java)||
|20|[有效的括号](https://leetcode-cn.com/problems/valid-parentheses)|[Python](/easy/leetcode20.py)||
|21|[合并两个有序链表](https://leetcode-cn.com/problems/merge-two-sorted-lists)|[Python](/easy/leetcode21.py)||
|22|[括号生成](https://leetcode-cn.com/problems/generate-parentheses)|[Java](/medium/leetcode22.java)||
|26|[删除排序数组中的重复项](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array)|[Python](/easy/leetcode26.py)||
|27|[移除元素](https://leetcode-cn.com/problems/remove-element)|[Python](/easy/leetcode27.py)||
|28|[实现 strStr()](https://leetcode-cn.com/problems/implement-strstr)|[Python](/easy/leetcode28.py)||
|29|[两数相除](https://leetcode-cn.com/problems/divide-two-integers)|[Java](/medium/leetcode29.java)||
|33|[搜索旋转排序数组](https://leetcode-cn.com/problems/search-in-rotated-sorted-array)|[Java](/medium/leetcode33.java)||
|34|[在排序数组中查找元素的第一个和最后一个位置](https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array)|[Java](/medium/leetcode34.java)||
|35|[搜索插入位置](https://leetcode-cn.com/problems/search-insert-position)|[Java](/easy/leetcode35.py)||
|38|[报数](https://leetcode-cn.com/problems/count-and-say)|[Python](/easy/leetcode38.py)||
|53|[最大子序和](https://leetcode-cn.com/problems/maximum-subarray)|[Python](/easy/leetcode53.py)||
|58|[最后一个单词的长度](https://leetcode-cn.com/problems/length-of-last-word)|[Python](/easy/leetcode58.py)||
|62|[不同路径](https://leetcode-cn.com/problems/unique-paths)|[Java](/medium/leetcode62.java)||
|66|[加一](https://leetcode-cn.com/problems/plus-one)|[Python](/easy/leetcode66.py)||
|67|[二进制求和](https://leetcode-cn.com/problems/add-binary)|[Python](/easy/leetcode67.py)||
|69|[x 的平方根](https://leetcode-cn.com/problems/sqrtx)|[Python](/easy/leetcode69.py)||
|70|[爬楼梯](https://leetcode-cn.com/problems/climbing-stairs)|[Python](/easy/leetcode70.py)||
|72|[编辑距离](https://leetcode-cn.com/problems/edit-distance)|[Java](/hard/leetcode72.java)||
|83|[删除排序链表中的重复元素](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list)|[Python](/easy/leetcode83.py)||
|88|[合并两个有序数组](https://leetcode-cn.com/problems/merge-sorted-array)|[Java](/easy/leetcode88.java)|从两个数组的尾部开始维护一对双指针，从尾部对比着放|
|92|[反转链表 II](https://leetcode-cn.com/problems/reverse-linked-list-ii)|[Java](/medium/leetcode92.java)||
|94|[二叉树的中序遍历](https://leetcode-cn.com/problems/binary-tree-inorder-traversal)|[Java](/medium/leetcode94.py)||
|98|[验证二叉搜索树](https://leetcode-cn.com/problems/validate-binary-search-tree)|[Java](/medium/leetcode98.java)||
|100|[相同的树](https://leetcode-cn.com/problems/same-tree)|[Python](/easy/leetcode100.py)||
|101|[对称二叉树](https://leetcode-cn.com/problems/symmetric-tree)|[Python](/easy/leetcode101.py)||
|102|[二叉树的层次遍历](https://leetcode-cn.com/problems/binary-tree-level-order-traversal)|[Java](/medium/leetcode102.java)||
|104|[二叉树的最大深度](https://leetcode-cn.com/problems/maximum-depth-of-binary-tree)|[Java](/easy/leetcode104(1).java),[Java](/easy/leetcode104(2).java)||
|107|[二叉树的层次遍历 II](https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii)|[Java](/easy/leetcode107.py)||
|108|[将有序数组转换为二叉搜索树](https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree)|[Java](/easy/leetcode108.java)||
|110|[平衡二叉树](https://leetcode-cn.com/problems/balanced-binary-tree)|[Java](/easy/leetcode110.java)||
|111|[二叉树的最小深度](https://leetcode-cn.com/problems/minimum-depth-of-binary-tree)|[Java](/easy/leetcode111.java),[Python](/easy/leetcode111.py)||
|112|[路径总和](https://leetcode-cn.com/problems/path-sum)|[Python](/easy/leetcode112.py)||
|115|[不同的子序列](https://leetcode-cn.com/problems/distinct-subsequences/)|[Java](/hard/leetcode115.java)|字节跳动面试题，动态规划。首先二维数组```dp[i][j]```表示第一个字符串中前i个字符中第二个字符串前j个字符为子序列出现的个数。```dp[i][j]```状态转移可以从```dp[i-1][j]```以及```dp[i-1][j-1]```得到。如果```s1.charAt(i) == s2.charAt(j)```，那么```dp[i][j] = dp[i-1][j-1] + dp[i-1][j]```; 否则```dp[i][j] = dp[i-1][j]```|
|118|[杨辉三角](https://leetcode-cn.com/problems/pascals-triangle/)|[Java](/easy/leetcode118.py)|模拟，注意判断边界即可|
|119|[杨辉三角2](https://leetcode-cn.com/problems/pascals-triangle-ii/)|[Java](/easy/leetcode119.py)|思路和118一样,获取最后一行|
|121|[买卖股票的最佳时机](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock)|[Java](/easy/leetcode121.java)||
|122|[买卖股票的最佳时机 II](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii)|[Java](/easy/leetcode122.java)||
|125|[验证回文串](https://leetcode-cn.com/problems/valid-palindrome/)|[Java](/easy/leetcode125.java)|字符串模拟|
|134|[加油站](https://leetcode-cn.com/problems/gas-station)|[Java](/medium/leetcode134.java)||
|136|[只出现一次的数字](https://leetcode-cn.com/problems/single-number/)|[Java](/easy/leetcode136.java)|异或的性质  ```a^a=0```|
|141|[环形链表](https://leetcode-cn.com/problems/linked-list-cycle/)|[Java](/easy/leetcode141.java)||
|144|[二叉树的前序遍历](https://leetcode-cn.com/problems/binary-tree-preorder-traversal)|[Java](/medium/leetcode144.java)||
|198|[打家劫舍](https://leetcode-cn.com/problems/house-robber/)|[Java](/easy/leetcode198.java)|简单dp，状态转移方程是<br>```dp[i][0]=max(dp[i-1][1], dp[i-1][0])``` <br>```dp[i][1]=dp[i-1][0]+nums[i]```，<br>其中dp\[i]\[0]表示第i家不偷时的获取财物的最大值，dp\[i]\[1]表示第i家偷时获取财物的最大值|
|200|[岛屿数量](https://leetcode-cn.com/problems/number-of-islands)|[Python](/medium/leetcode200.py)||
|206|[反转链表](https://leetcode-cn.com/problems/reverse-linked-list)|[Java](/easy/leetcode206.java)||
|326|[3的幂](https://leetcode-cn.com/problems/power-of-three)|[Java](/easy/leetcode326.java)||
|344|[反转字符串](https://leetcode-cn.com/problems/reverse-string)|[Java](/easy/leetcode344.java)||
|405|[数字转换为十六进制数](https://leetcode-cn.com/problems/convert-a-number-to-hexadecimal/)|[Java](/easy/leetcode405.java)|利用位运算，使用一个掩码```0xf```来每次截取四位，然后每次循环```num >> 4```，直接计算每四位的16进制表示即可 |
|413|[等差数列划分](https://leetcode-cn.com/problems/arithmetic-slices)|[Java](/medium/leetcode413.java)||
|421|[数组中两个数的最大异或值](https://leetcode-cn.com/problems/maximum-xor-of-two-numbers-in-an-array)|[Java](/medium/leetcode421.java)||
|454|[四数相加 II](https://leetcode-cn.com/problems/4sum-ii)|[Java](/medium/leetcode454.java)||
|547|[朋友圈](https://leetcode-cn.com/problems/friend-circles)|[Python](/medium/leetcode547.py)||
|598|[范围求和 II](https://leetcode-cn.com/problems/range-addition-ii)|[Java](/easy/leetcode598.java)||
|684|[冗余连接](https://leetcode-cn.com/problems/redundant-connection)|[Python](/medium/leetcode684.py)||
|704|[二分查找](https://leetcode-cn.com/problems/binary-search)|[Java](/easy/leetcode704.java)||
|721|[账户合并](https://leetcode-cn.com/problems/accounts-merge/)|[Java](/medium/leetcode721.java)|字节跳动面试题，有一说一，我觉得操作很麻烦。做法是使用并查集，来合并相同的邮件，需要注意的是事实上同一用户的用户名都是一样的，所以在合并后不需要做特判就可以放到同一个TreeSet中|
|822|[翻转卡片游戏](https://leetcode-cn.com/problems/card-flipping-game/)|[Java](/medium/leetcode822.java)|中等中的简单题，只要得出当正面和反面相同的就不可能是我们需要的数这个结论就可以了，使用一个Set或者数组维护不可能的数的集合，时间复杂度O(n)，空间复杂度O(n)|
|829|[连续整数求和](https://leetcode-cn.com/problems/consecutive-numbers-sum/)|[Java](/hard/leetcode829.java)|数学性质+动态规划。1个数时，必然有一个数可构成N，2个数若要构成N，第2个数与第1个数差为1，N减掉这个1能整除2则能由商与商+1构成N。3个数若要构成N，第2个数与第1个数差为1，第3个数与第1个数的差为2，N减掉1再减掉2能整除3则能由商、商+1与商+2构成N|
|830|[较大分组的位置](https://leetcode-cn.com/problems/positions-of-large-groups/)|[Java](/easy/leetcode830.java)|双指针模拟就完事了|
|832|[翻转图像](https://leetcode-cn.com/problems/flipping-an-image)|[Java](/easy/leetcode832.java)|数据量比较小，直接对于列反向取反模拟即可|
|872|[叶子相似的树](https://leetcode-cn.com/problems/leaf-similar-trees)|[Java](/easy/leetcode872.java)||
|875|[爱吃香蕉的珂珂](https://leetcode-cn.com/problems/koko-eating-bananas)|[Java](/medium/leetcode875.java)||
|912|[数组排序](https://leetcode-cn.com/problems/sort-an-array/)|[Java](/medium/leetcode912.java)||
|932|[漂亮数组](https://leetcode-cn.com/problems/beautiful-array)|[Java](/medium/leetcode932.java)||
|944|[删列造序](https://leetcode-cn.com/problems/delete-columns-to-make-sorted/)|[Java](/easy/leetcode944.java)|令人自闭的题目描述，其实很简单，删除所有的非严格升序列(原题为降序列)，但是我A了之后还是没搞清楚降序列是什么意思，样例中有一句话，"那么 A 的列 ["b","a","h"] 就不是非降序排列了"，也就是说的\[b,a,h]是降序排列，可是看着显然不是啊|
|1018|[可被 5 整除的二进制前缀](https://leetcode-cn.com/problems/binary-prefix-divisible-by-5)|[Java](/easy/leetcode1018.py)||
|1019|[链表中的下一个更大节点](https://leetcode-cn.com/problems/next-greater-node-in-linked-list)|[Java](/medium/leetcode1019.java)||
|1020|[飞地的数量](https://leetcode-cn.com/problems/number-of-enclaves)|[Java](/medium/leetcode1020.java)||
|1037|[有效的回旋镖](https://leetcode-cn.com/problems/valid-boomerang)|[Python](/easy/leetcode1037.py)||
|1038|[从二叉搜索树到更大和树](https://leetcode-cn.com/problems/binary-search-tree-to-greater-sum-tree)|[Java](/easy/leetcode1038.py)||
|1041|[困于环中的机器人](https://leetcode-cn.com/problems/robot-bounded-in-circle)|[Java](/easy/leetcode1041.java)||
|1122|[数组的相对排序](https://leetcode-cn.com/problems/relative-sort-array)|[Python](/easy/leetcode1122.py)，[Java](/easy/leetcode1122.java)|2020/2/13补，在不开额外空间的情况下，使用双指针维护。|
|1123|[最深叶节点的最近公共祖先](https://leetcode-cn.com/problems/lowest-common-ancestor-of-deepest-leaves)|[Java](/medium/leetcode1123.java)||
|1162|[地图分析](https://leetcode-cn.com/problems/as-far-from-land-as-possible)|[Java](/medium/leetcode1162.java)||
|1186|[删除一次得到子数组最大和](https://leetcode-cn.com/problems/maximum-subarray-sum-with-one-deletion/)|[Java](/medium/leetcode1186.java)|这题属于中等中的较难题,有dp数组dp，```dp[i][j]```表示从以第i位为结尾的字数组删除j个元素的最大值，当```dp[i][0]```时，做法类似于[最大子序和](https://leetcode-cn.com/problems/maximum-subarray/)，当```dp[i][1]```时，有如下状态转移方程```dp[i][1] = max(dp[i][0], dp[i][1]+arr[i])```，时间复杂度O(n)，空间复杂度O(n)|
|1217|[玩筹码](https://leetcode-cn.com/problems/play-with-chips)|[Java](/easy/leetcode1217.java)||
|1252|[奇数值单元格的数目](https://leetcode-cn.com/problems/cells-with-odd-values-in-a-matrix/)|[Java](/easy/leetcode1252.java)|模拟即可|
|1281|[整数的各位积和之差](https://leetcode-cn.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer)|[Java](/easy/leetcode1281.java)||
|1282|[用户分组](https://leetcode-cn.com/problems/group-the-people-given-the-group-size-they-belong-to)|[Java](/medium/leetcode1282.java)||
|1283|[使结果不超过阈值的最小除数](https://leetcode-cn.com/problems/find-the-smallest-divisor-given-a-threshold)|[Java](/medium/leetcode1283.java)||
|1290|[二进制链表转整数](https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer)|[Java](/easy/leetcode1290.java)||
|1291|[顺次数](https://leetcode-cn.com/problems/sequential-digits)|[Java](/medium/leetcode1291.java)||
|1292|[元素和小于等于阈值的正方形的最大边长](https://leetcode-cn.com/problems/maximum-side-length-of-a-square-with-sum-less-than-or-equal-to-threshold)|[Java](/medium/leetcode1292.java)||
|1302|[层数最深叶子节点的和](https://leetcode-cn.com/problems/deepest-leaves-sum/)|[Java](/medium/leetcode1302.java)|bfs模板题|
|1304|[和为零的N个唯一整数](https://leetcode-cn.com/problems/find-n-unique-integers-sum-up-to-zero/)|[Java](/easy/leetcode1304.java)|构造正负数|
|1305|[两棵二叉搜索树中的所有元素](https://leetcode-cn.com/problems/all-elements-in-two-binary-search-trees/)|[Java](/medium/leetcode1305.java)|二叉树遍历|
|1306|[跳跃游戏 III](https://leetcode-cn.com/problems/jump-game-iii/)|[Java](/medium/leetcode1306.java)|记忆化+递归搜索|
|1308|[解码字母到整数映射](https://leetcode-cn.com/problems/decrypt-string-from-alphabet-to-integer-mapping)|[Java](/easy/leetcode1308.java)|栈 + ascii转换|
|1309|[子数组异或查询](https://leetcode-cn.com/problems/xor-queries-of-a-subarray)|[Java](/medium/leetcode1309.java)|dp + 数学 (异或性质</br>```arr[l]^..arr[r] = (arr[0]^..arr[r]) ^ (arr[0] ^.. arr[l-1])```)|
||[解压缩编码列表](https://leetcode-cn.com/problems/decompress-run-length-encoded-list/)|[Java](/easy/leetcode_解压缩编码列表.java)|双周赛，水题，但是题目一开始没看懂|
||[矩阵区域和](https://leetcode-cn.com/problems/matrix-block-sum/)|[Java](/medium/leetcode_矩阵区域和.java)|暴力矩阵求和就能过，注意判断边界即可|
||[祖父节点值为偶数的节点和](https://leetcode-cn.com/problems/sum-of-nodes-with-even-valued-grandparent/)|[Java](/medium/leetcode_祖父节点值是偶数的节点和.java)|dfs+深度判断，递归即可|
||[将整数转换为两个无零整数的和](https://leetcode-cn.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/)|[Java](/easy/leetcode_将整数转换为两个无零整数的和.java)|数字转化为字符串，模拟|
||[或运算的最小翻转次数](https://leetcode-cn.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/)|[Java](/medium/leetcode_或运算的最小翻转次数.java)|位运算，对于三个数按1为mask做位截取，根据策略判断，策略总共有2^3种，按照类别分类然后操作即可|
||[连通网络的操作次数](https://leetcode-cn.com/problems/number-of-operations-to-make-network-connected/)|[Java](/medium/leetcode_连通网络的操作次数.java)|并查集，首先判断边的数量够不够构造一个联通集，<code>机器数量-1 > 边的数量</code>则不能构成，然后使用并查集判断总共有几个集合，如果只有一个集合，不做操作；如果超过一个集合，那个就要做<code>集合数-1</code>次操作(同样使用dfs也可以判断连通块的个数，方法类似)|
||[删除回文子序列](https://leetcode-cn.com/problems/remove-palindromic-subsequences/)|[Java](/easy/leetcode_将整数转换为两个无零整数的和.java)|重点在于字序列和子串的区别，对于最多的删除次数就是先删全部a，再删全部b|
||[餐厅过滤器](https://leetcode-cn.com/problems/filter-restaurants-by-vegan-friendly-price-and-distance/)|[Java](/medium/leetcode_餐厅过滤器.java)|小模拟，注意比较顺序，以及veganFriendly的选择策略|
||[leetcode_方阵中战斗力最弱的 K 行](https://leetcode-cn.com/problems/the-k-weakest-rows-in-a-matrix/)|[Java](/easy/leetcode_方阵中战斗力最弱的K行.java)|模拟+自定义比较规则(自己设置Comparable)|
||[数组大小减半](https://leetcode-cn.com/problems/reduce-array-size-to-the-half/)|[Java](/medium/leetcode_数组大小减半.java)|使用一个Map记录数组中各项的数量，对Map按照value排序后，遍历累加直到删除的数超过原数组一半|
||[分裂二叉树的最大乘积](https://leetcode-cn.com/problems/maximum-product-of-splitted-binary-tree/)|[Java](/medium/leetcode_分裂二叉树的最大乘积.java)|对二叉树做dfs，并且在一个数组中记录每个节点为根节点的子树和。设总树和为total，某个子树和为x，主要找到最小的```delta_min = Math.abs(x-(total-x))```，那么最佳分裂方案的其中一个子树和就是```x = (total-delta_min)/2```，分裂二叉树的最大乘积就是```x*(total-x)%(1e9+7)```，注意中间过程最好使用long作为临时变量|
||[将数字变成 0 的操作次数](https://leetcode-cn.com/problems/number-of-steps-to-reduce-a-number-to-zero/)|[Java](/easy/leetcode_将数字变成0的操作次数.java)|小学题|
||[大小为 K 且平均值大于等于阈值的子数组数目]()|[Java](/medium/leetcode_大小为K且平均值大于等于阈值的子数组数目.java)|前缀和，要计算一组数的和，只需要计算<br>```prefix[i] = prefix[i-1] - arr[i-1] + arr[i+k-1]```即可|
||[时钟指针的夹角]()|[Java](/medium/leetcode_时钟指针的夹角.java)|简单的模拟，分针的度数很好算，时针的度数等于分针的度数加上分针对应比例的度数|
||[跳跃游戏 IV]()|[Java](/hard/leetcode_跳跃游戏IV.java)|记忆化搜索；剪枝的策略是每当跳到某一点的次数大于曾跳到过这点的最小次数那么则舍弃这次递归(然而剪枝后还是被最后一组数据卡了时间)|
||[检查整数及其两倍数是否存在](https://leetcode-cn.com/problems/check-if-n-and-its-double-exist/)|[Java](/easy/leetcode_检查整数及其两倍数是否存在.java)|维护一个集合，枚举每个数的两倍和一半是否在集合中|
||[制造字母异位词的最小步骤数](https://leetcode-cn.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/)|[Java](/medium/leetcode_制造字母异位词的最小步骤数.java)|贪心(应该属于贪心策略吧)，维护两个数组，分别记录两串字符串中每个字母的出现次数。将他们的对应字母的出现次数相减的绝对值相加除2。|
||[参加考试的最大学生数](https://leetcode-cn.com/problems/maximum-students-taking-exam/)|[Java](/hard/leetcode_参加考试的最大学生数.java)|状压dp，状态转移方程比较简单```dp[i][state] = max(dp[cur][state1], dp[cur-1][state2] + count(cur))```，dp\[i]\[state1]表示第i行state1状态下的最大答案，state是一组n位(取决于每行学生的数量)二进制数(0表示不坐人，1表示坐人)，每个state表示1种状态，总共有(1 << n)-1种状态。中间按照题目给出的策略来判断能否转移状态即可|