/**
 * Created by Administrator on 2016/10/20.
 */
import java.math.BigInteger;
import java.lang.String;
 class Enc {
     private static  int input ;
     private static  int start ;
     private static  int end ;
     static int a;
     static int b;
     static int c;
     public static void setStringResult(int input){
         input = a;
     }
     public static void setStringSubResult(int input,int start,int end){
         input = a;
         start = b;
         end   = c;
     }

     public static void factorial(int input,int start,int end){
         BigInteger sum = new BigInteger("1");
         for (int i = 1 ; i <= input ; i++) {
             sum = sum.multiply(BigInteger.valueOf(i));
         }
         System.out.println(sum.toString().substring(start,end));

     }
}
