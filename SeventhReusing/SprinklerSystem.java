//:reusing/SprinklerSystem.java
// 组合语法
import static SixthAccess.mytool.Print.*;

class WaterSource {
  private String s;
  WaterSource() {
    print("WaterSource()");
    s = "Constructed";
  }
  public String toString() { return s; }
}

public class SprinklerSystem {
  private String value1, value2, value3, value4;
  private WaterSource source = new WaterSource();
  private int i;
  private float f;
  public String toString(){
    return
      "value1 = " + value1 + " " +
      "value2 = " + value2 + " " +
      "value3 = " + value3 + " " +
      "value4 = " + value4 + "\n" +
      "i = " + i + " " + "f = " + f + " " +
      "source = " + source;
  }
  public static void main(String[] args){
    SprinklerSystem sprinklers = new SprinklerSystem();
    print(sprinklers);
  }
}
