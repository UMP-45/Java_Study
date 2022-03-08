//:access/IceCream.java
// 测试private
import static SixthAccess.mytool.Print.*;
class Sundae {
  private Sundae() { print("YES"); }
  static Sundae makeSundae() {
    return new Sundae();
  }
}

public class IceCream {
  public static void main(String[] args){
    Sundae x = Sundae.makeSundae();
  }
}
