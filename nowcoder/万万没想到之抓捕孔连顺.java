import java.lang.*;
import java.util.*;
  
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int total = scanner.nextInt();
            int dist = scanner.nextInt();
            int[] list = new int[total];
            long num = 0;
            for (int i = 0; i < total; i++) {
                list[i] = scanner.nextInt();
            }
            int end = 0;
            for (int i = 0; i < total; i++) {
                for (int j = end; j < total; j++) {
                    if (list[j] - list[i] <= dist) {
                        end = j;
                    } else {
                        break;
                    }
                }
                if (end - i >= 2) {
                    long tmp = end - i;
                    long tmpLong = ((tmp % 99997867) * ((tmp-1) % 99997867)) / 2 % 99997867;
                    num += tmpLong ;
                }
            }
            System.out.println(num % 99997867);
        }
    }
}