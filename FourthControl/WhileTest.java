//:control/WhileTest.java
// 测试while循环

public class WhileTest {
  static boolean condition(){
    boolean result = Math.random() < 0.9; //Math.random产生0到1（包括0，不包括1）的double值
    System.out.print(result + ", ");
    return result;
  }
  public static void main(String[] args){
    while(condition())
      System.out.println("Inside 'while'");
    System.out.println("Exited 'while'");
  }
}
