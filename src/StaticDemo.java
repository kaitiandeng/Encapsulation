/**
 * Created by Administrator on 2016/10/20.
 */
import java.util.Scanner;
public class StaticDemo {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入任意数字：");
        int a = s.nextInt();
        System.out.println("请输入阶乘结果想要取得的数的起始点：");
        int b = s.nextInt();
        System.out.println("请输入阶乘结果想要取得的数的结束点：");
        int c = s.nextInt();
        System.out.println("输出结果：");
        Enc.factorial( a, b,c);
    }
}
