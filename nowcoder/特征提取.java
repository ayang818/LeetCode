import java.lang.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseNum = scanner.nextInt();
        while (caseNum > 0) {
            int frameNum = scanner.nextInt();
            Set[] frameList = new HashSet[frameNum];
            for (int i =0; i < frameNum; i++) {
                int featureNum = scanner.nextInt();
                Set<Frame> set = new HashSet<>();
                frameList[i]  = set;
                for (int j = 0; j < featureNum; j++) {
                    set.add(new Frame(scanner.nextInt(), scanner.nextInt()));
                }
            }
            int max = 0;
            for (int i = 0; i < frameList.length; i++) {
                while(frameList[i].iterator().hasNext()) {
                    Frame frame = (Frame) frameList[i].iterator().next();
                    max = Math.max(max, dfs(frame, i, frameList));
                }
            }
            System.out.println(max);
            caseNum--;
        }
    }
 
    public static int dfs(Frame frame, int depth, Set[] frameList) {
        if (depth > frameList.length -1) return 0;
        if (frameList[depth].contains(frame)) {
            frameList[depth].remove(frame);
            return 1 + dfs(frame, depth + 1, frameList);
        } else {
            return 0;
        }
    }
}
 
class Frame {
    Integer first;
    Integer second;
 
    public Frame(Integer first, Integer second){
        this.first = first;
        this.second = second;
    }
 
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Frame frame = (Frame) o;
        return Objects.equals(first, frame.first) &&
                Objects.equals(second, frame.second);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}