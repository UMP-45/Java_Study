//:access/Print.java
// 使用静态方法打印
package SixthAccess.mytool;
import java.io.*;

public class Print {
  // 打印并起到新的一行
  public static void print(Object obj) {
    System.out.println(obj);
  }
  // 打印新的一行
  public static void print() {
    System.out.println();
  }
  // 打印一行并不跳到新的一行
  public static void printnb(Object obj){
    System.out.print(obj);
  }
  public static PrintStream
  printf(String format, Object... args){
    return System.out.printf(format, args);
  }
}
