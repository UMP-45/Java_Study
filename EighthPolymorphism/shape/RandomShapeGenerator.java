//:polymorphism/Shape/RandomShapeGenerator.java
// 随机产生形状
package EighthPolymorphism.shape;
import java.util.*;

public class RandomShapeGenerator {
  private Random rand = new Random(47);
  public Shape next() {
    switch(rand.nextInt(3)) {
      default:
        case 0: return new Circle();
        case 1: return new Square();
        case 2: return new Triangle();
    }
  }
}
