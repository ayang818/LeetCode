import java.util.*;

/**
 * Main
 */
public class Main {
    static int max = 10000 + 5;
    static char[] charlist;
    static int[] next = new int[23];
    static int last, cur, length;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String input = scan.next();
            length = input.length();
            last = cur = 0;
            next[0] = 0;
            charlist = input.toCharArray();

            for (int i = 0; i < length; i++) {
                if (charlist[i] == '[') {
                    cur = 0;
                    System.out.println(cur);
                } else if (charlist[i] == ']') {
                    cur = last;
                    System.out.println(cur);
                } else {
                    System.out.println(cur);
                    System.out.println(last);
                    // 复制0或首部节点
                    next[i] = next[cur];
                    // 链接链表节点
                    next[cur] = i;
                    // 设置尾部为0
                    if (cur == last) {
                        last = i;
                    }
                    // 当前节点数
                    cur = i;
                }
                System.out.println(Arrays.toString(next));
            }
            for (int i = next[0]; i != 0; i = next[i]) {
                System.out.print(charlist[i]);
            }
            System.out.println();
        }
    }
}