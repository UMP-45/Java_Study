//:reusing/FianlData.java
// 测试final数据
import java.util.*;
import static SixthAccess.mytool.Print.*;

class Value {
  int i;
  public Value(int i) { this.i = i; }
}

public class FinalData {
  private static Random rand = new Random(47);
  private String id;
  public FinalData(String id) { this.id = id; }
  private final int valueOne = 9;
  private static final int VALUE_TWO = 99;
  public static final int VALUE_THREE = 39;
  private final int i4 = rand.nextInt(20);
  static final int INT_5 = rand.nextInt(20);
  private Value v1 = new Value(11);
  private final Value v2 = new Value(22);
  private static final Value VAL_3 = new Value(33);
  private final int[] a = { 1, 2, 3, 4, 5, 6 };
  public String toString() {
    return id + ": " + "i4 = " + i4 + ", INT_5 = " +INT_5;
  }
  public static void main(String[] args) {
    FinalData fd1 = new FinalData("fd1");
    //! fd1.valueOne++; 错误，不能改变private值
    fd1.v2.i++; //对象不是常量
    fd1.v1 = new Value(9);
    for(int i = 0; i < fd1.a.length; i++)
      fd1.a[i]++;
    //! fd1.v2 = new Value(0); 错误
    //! fd1.VAL_3 = new Value(1); 错误,改变了引用
    //! fd1.a = new int[3]; 错误
    print(fd1);
    print("Creating new FinalData");
    FinalData fd2 = new FinalData("fd2");
    print(fd1);
    print(fd2);
  }
}
