import java.lang.*;
import java.util.*;
  
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (num > 0) {
            String str = scanner.next();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                sb.append(str.charAt(i));
                int len = sb.length() - 1;
                if (len >= 2 && sb.charAt(len-2) == sb.charAt(len) && sb.charAt(len-2) == sb.charAt(len-1)) {
                    sb.deleteCharAt(len);
                    len--;
                }
                if (len >= 3 && sb.charAt(len) == sb.charAt(len-1) && sb.charAt(len-2) == sb.charAt(len-3)) {
                    sb.deleteCharAt(len);
                }
            }
            System.out.println(sb.toString());
            num--;
        }
    }
}