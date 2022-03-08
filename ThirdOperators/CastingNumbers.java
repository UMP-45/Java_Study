//:operators/CastingNumbers.java
// 在执行窄化转换时，注意结尾和舍入

public class CastingNumbers {
  public static void main(String[] args){
    double above = 0.7, below = 0.4;
    float fabove = 0.7f, fbelow = 0.4f;
    System.out.println("(int)above: " + (int)above); //截尾
    System.out.println("(int)below: " + (int)below);
    System.out.println("(int)fabove: " + (int)fabove);
    System.out.println("(int)fbelow: " + (int)fbelow);

    System.out.println("Math.round(above): " + Math.round(above)); //舍入
    System.out.println("Math.round(below): " + Math.round(below));
    System.out.println("Math.round(fabove): " + Math.round(fabove));
    System.out.println("Math.round(fbelow): " + Math.round(fbelow));
  }
}
