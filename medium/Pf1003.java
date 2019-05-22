import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] list = new int[1000000];
        while(scan.hasNextInt()){
        int num = scan.nextInt();
        if (num == 0) continue;
        for (int i = 0; i < num; i++) {
            list[scan.nextInt()]+=1;
        }
        for (int i = 0; i < list.length; i++) {
            if(list[i] == 1) {
                System.out.println(i);
                break;
            }
        }
        for (int i = 0; i < list.length; i++) {
            list[i] = 0;
        }        
    }
}
}

