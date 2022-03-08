//:initialization/AutoboxingVarargs.java
// 可变参数列表与自动包装机制

public class AutoboxingVarargs {
  public static void f(Integer ... args){
    for(Integer i :args) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
  public static void main(String[] args){
    f(new Integer(1), new Integer(2));
    f(4, 5, 6, 7, 8 ,9);
    f(10, new Integer(11), 12);
  }
}
