// Problem Description
// 经历了一系列苦难与磨练，只狼终于走到了最后。挡在御子断绝不死的最后的敌人，则是苇名城传说中的剑圣，苇名一心。身为剑圣，他的十字枪耍地是出神入化，腰间别着的左轮一旦出手更是弹无虚发。
// 除此之外，只狼如果不能【连续】正确应对一心的招式，一心便会在下一个瞬间将状态恢复至满。
// 经过几次简单的尝试之后，monitor终于研究出了一心的出招规律，并将它以数组的形式展现，数组中的数字代表一心的招式编号，一心将按照数组的排列顺序使出对应的招式。
// 由于monitor玩游戏的时间有限，他只能通过练习正确应对其中【任意两种】招式。
// Input
// 数据有多组样例，对于每个样例，第一行给出一个正整数n，代表苇名一心的出招次数（如果只狼未能在n次招式中打败一心，一心将掏出左轮直接将只狼击败），第二行给出n个正整数，代表一心的出招顺序。第三行给出一个整数k，代表要击败一心，需要连续正确应对招式的次数。
// Output
// 对于每个样例，输出一行，如果能做到的连续正确应对的最大次数大于等于所需次数，请输出一个整数a，代表能连续应对的最大次数，否则，请输出“犹豫,就会败北”
// Sample Input
// 6
// 1 3 2 3 5 3
// 3
// 7
// 5 3 5 2 5 1 5
// 4
// Sample Output
// 3
// 犹豫,就会败北


//题解：使用一个队列加上一个集合瞎搞搞出来的
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class Pf1006
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt())
        {
            int allNum = scan.nextInt();
            int[] list = new int[allNum];
            int flag = 0;
            int ans = 0;
            for (int i = 0; i < allNum; i++) {
                list[i] = scan.nextInt();
            }
            int need = scan.nextInt();
            Set<Integer> set = new HashSet<>();
            ArrayList<Integer> queue = new ArrayList<>();
            for (int i = 0; i < allNum; i++) {
                queue.add(list[i]);
                set.add(list[i]);
                // System.out.println(queue);
                // System.out.println(set);
                if(set.size() > 2)
                {
                    queue.remove(0);
                    set.clear();
                    set.addAll(queue);
                }
                if(queue.size() >=need && set.size() <= 2)
                {
                    if(queue.size() > ans){
                        flag = 1;
                        ans = queue.size();
                    }
                }
                // System.out.println(ans);
            }
            Set<Integer> tempSet = new HashSet<>();
            while(!queue.isEmpty()){
                queue.remove(0);
                tempSet.clear();
                tempSet.addAll(queue);
                if(queue.size() >= need && tempSet.size() <= 2){
                    if(queue.size() > ans){
                        flag = 1;
                        ans = queue.size();
                    }
                }                
            }
            if (flag == 1)
            {
                System.out.println(ans);
            }
            else{
                System.out.println("犹豫，就会败北");
            }
        }
    }
    
}