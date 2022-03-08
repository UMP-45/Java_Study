//:reusing/Detergent.java
// 继承语法
import static SixthAccess.mytool.Print.*;

class Cleanser {
  private String s = "Cleanser";
  public void append(String a) { s += a; }
  public void dilute() { append(" dilute()"); }
  public void apply() { append(" apply()"); }
  public void scrub() { append(" scrub()"); }
  public String toString() { return s; }
  public static void main(String[] args) {
    Cleanser x = new Cleanser();
    x.dilute(); x.apply(); x.scrub();
    print(x);
  }
}
public class Detergent extends Cleanser {
  // 改变函数
  public void scrub() {
    append(" Detergent.scrub()");
    super.scrub(); // 超类继承，super.scrub()将调用基类版本的scrub()方法
  }
  // 添加新函数
  public void foam() { append(" foam()"); }
  // 测试新的类
  public static void main(String[] args) {
    Detergent x = new Detergent();
    x.dilute();
    x.apply();
    x.scrub();
    x.foam();
    print(x);
    print("Testing base class:");
    Cleanser.main(args);
  }
}
