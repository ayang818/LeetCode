// Problem Description
// 只狼在一系列潜行战斗后，成功救出了主人，不过主人认为不死之力引发的龙咳过于严重，为了帮主人断绝不死，只狼需要找到传说中的武器，不死斩。而不死斩就位于风景优美的金刚山仙峰寺中。不过这毕竟是游戏，就连众多一线游戏厂商尚且Bug频出，F社游戏里出现Bug也不奇怪。而金刚山的地图就出现了Bug，道路产生了一定的错乱。不过对于monitor来说，只要不影响通关，这个Bug就无足轻重。
// Input
// 数据有多组样例，每个样例的第一行有两个整数m,n（20>=m,n>=3），代表金刚山的地图为m行和n列的方阵。接下来有m行数据，每行n个整数，0代表该位置正常通行，1代表该位置无法通行，2代表玩家的初始位置，3代表不死斩所在位置。玩家只能向上下左右四个方向一格一格的移动。
// Output
// 对于每组数组，输出一行字符串，若玩家能从初始位置到达不死斩所在位置，则输出“游戏可以正常进行”，若无法到达，则输出“这破游戏有Bug,宫崎英高跌落神坛了”
// Sample Input
// 3 2
// 1 2
// 0 0
// 3 1
// 3 3
// 1 1 2
// 1 1 1
// 3 0 0
// Sample Output
// 游戏可以正常进行
// 这破游戏有Bug,宫崎英高跌落神坛了


//题解：搜索模板题，反正就这么找，每走一格把走过的格子堵了，过程中使用一个栈辅助实现。
import java.util.Scanner;
import java.util.Stack;

public class Pf1004
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()){
        int x = scan.nextInt();
        int y = scan.nextInt();
        int[][] list = new int[x][y];
        int startx=0;
        int starty=0;
        int flag = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                list[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if(list[i][j] == 2)
                {
                    startx = i;
                    starty = j;
                    break;
                }
            }
        }
        Stack<Integer> xList = new Stack<>();
        xList.push(startx);
        Stack<Integer> yList = new Stack<>();
        yList.push(starty);
        while(!xList.empty() && !yList.empty())
        {
            // System.out.println("1");
            int ax = xList.pop();
            int ay = yList.pop();
            if (list[ax][ay] == 3)
            {
                // System.out.println("name");
                flag = 1;
                break;
            }
            if(ax-1>=0)
            {
                if (list[ax-1][ay] == 0 || list[ax-1][ay] == 3){
                // System.out.println("#1");
                xList.push(ax-1);
                yList.push(ay);
                }
            }
            if(ay+1<y)
            {
                if (list[ax][ay+1] == 0 || list[ax][ay+1] == 3){
                // System.out.println("#4");
                xList.push(ax);
                yList.push(ay+1);
                }
            }
            if(ax+1<x)
            {
                if (list[ax+1][ay] == 0 || list[ax+1][ay] == 3){
                // System.out.println("#2");
                xList.push(ax+1);
                yList.push(ay);
                }
            }
            if(ay-1>=0)
            {
                if(list[ax][ay-1] == 0 || list[ax][ay-1] == 3){
                // System.out.println("#3");
                xList.push(ax);
                yList.push(ay-1);
                }
            }
            list[ax][ay] = 1;
        }
        if (flag == 1){
        System.out.println("游戏可以正常进行");
        }
        else {
        System.out.println("这破游戏有Bug,宫崎英高跌落神坛了");
        }
        }
    }
}