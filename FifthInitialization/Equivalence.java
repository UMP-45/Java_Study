//:operators/Equivalence.java
// 测试对象的等价性

class Value1{
  int i;
}
public class Equivalence {
  public static void main(String[] args){
    Integer n1 = new Integer(1);
    Integer n2 = new Integer(1);
    System.out.println(n1 == n2);
    System.out.println(n1.equals(n2));

    Value1 v1 = new Value1();
    Value1 v2 = new Value1();
    v1.i = v2.i = 1;
    System.out.println(v1 == v2);
    System.out.println(v1.equals(v2));
  }
}
