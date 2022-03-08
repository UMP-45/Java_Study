//:operators/BitManipulation.java
// 测试位移操作符
import java.util.*;

public class BitManipulation {
  public static void main(String[] args){
    Random rand = new Random(47); //产生随机数
    int i = rand.nextInt();
    int j = rand.nextInt();
    System.out.println("        -1:" + Integer.toBinaryString(-1));
    System.out.println("        +1:" + Integer.toBinaryString(+1) );
    int maxpox = 2147483647;
    System.out.println("    maxpox:" + Integer.toBinaryString(maxpox));
    int maxneg = -2147483648;
    System.out.println("    maxneg:" + Integer.toBinaryString(maxneg));
    System.out.println("         i:" + Integer.toBinaryString(i));
    System.out.println("        ~i:" + Integer.toBinaryString(~i));
    System.out.println("        -i:" + Integer.toBinaryString(-i));
    System.out.println("         j:" + Integer.toBinaryString(j));
    System.out.println("     i & j:" + Integer.toBinaryString(i & j));
    System.out.println("     i | j:" + Integer.toBinaryString(i | j));
    System.out.println("     i ^ j:" + Integer.toBinaryString(i ^ j));
    System.out.println("    i << 5:" + Integer.toBinaryString(i << 5));
    System.out.println("    i >> 5:" + Integer.toBinaryString(i >> 5));
    System.out.println(" (~i) >> 5:" + Integer.toBinaryString((~i) >> 5));
    System.out.println("   i >>> 5:" + Integer.toBinaryString(i >>> 5));
    System.out.println("(~i) >>> 5:" + Integer.toBinaryString((~i) >>> 5));
  }
}
