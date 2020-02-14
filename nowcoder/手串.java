import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int zhuNum = scanner.nextInt();
            int maxDepth = scanner.nextInt();
            int colorNum = scanner.nextInt();
            int[] colorList = new int[colorNum + 1];
            List<Set<Integer>> zhuList = new ArrayList<>(zhuNum + 1);
            for (int i = 0; i < zhuNum; i++) {
                int tmpColorNum = scanner.nextInt();
                Set<Integer> tmpList = new HashSet<>();
                while (tmpColorNum > 0) {
                    tmpList.add(scanner.nextInt());
                    tmpColorNum--;
                }
                zhuList.add(tmpList);
            }
            for (int i = 0; i < zhuList.size(); i++) {
                Set<Integer> set = zhuList.get(i);
                Iterator<Integer> it = set.iterator();
                while (it.hasNext()) {
                    Integer next = it.next();
                    dfs(next, (i + 1) % zhuList.size(), 2, maxDepth, zhuList, colorList);
                }
            }
            int num = 0;
            for (int i = 1; i < colorList.length; i++) {
                if (colorList[i] == 1) {
                    num++;
                }
            }
            System.out.println(num);
        }
    }

    public static void dfs(int targetColor, int zhuNumber, int depth, int maxDepth, List<Set<Integer>> zhuList, int[] colorList) {
        if (depth > maxDepth) {
            return;
        }
        if (colorList[targetColor] == 1) {
            return;
        }
        Set<Integer> set = zhuList.get(zhuNumber);
        if (set.contains(targetColor)) {
            colorList[targetColor] = 1;
            set.remove(targetColor);
            zhuList.set(zhuNumber, set);
            return;
        }
        int tmpDepth = (zhuNumber + 1) % zhuList.size();
        dfs(targetColor, tmpDepth, depth + 1, maxDepth, zhuList, colorList);
    }
}