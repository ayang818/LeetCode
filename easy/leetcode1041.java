// 在无限的平面上，机器人最初位于 (0, 0) 处，面朝北方。机器人可以接受下列三条指令之一：

// "G"：直走 1 个单位
// "L"：左转 90 度
// "R"：右转 90 度
// 机器人按顺序执行指令 instructions，并一直重复它们。

// 只有在平面中存在环使得机器人永远无法离开时，返回 true。否则，返回 false。

 

// 示例 1：

// 输入："GGLLGG"
// 输出：true
// 解释：
// 机器人从 (0,0) 移动到 (0,2)，转 180 度，然后回到 (0,0)。
// 重复这些指令，机器人将保持在以原点为中心，2 为半径的环中进行移动。
// 示例 2：

// 输入："GG"
// 输出：false
// 解释：
// 机器人无限向北移动
class Solution {
    public boolean isRobotBounded(String instructions) {
        int x=0;
        int y = 0;
        int t = 4;
        int state = 1;
        while (t>0) {
            for (int i = 0; i < instructions.length(); i++) {
                if (instructions.charAt(i) == 'L') {
                    state--;
                }

                if (instructions.charAt(i) == 'R') {
                    state++;
                }
                if (state == 0) state = 4;
                if (state == 5) state = 1;
                if (instructions.charAt(i) == 'G') {
                    switch (state) {
                        case 1:
                            y++;break;
                        case 2:
                            x++;break;
                        case 3:
                            y--;break;
                        case 4:
                            x--;break;
                    }
                }
            }
            t--;
        }
        if(x==0&&y==0){
            return true;
        }else {return false;}
    }
}