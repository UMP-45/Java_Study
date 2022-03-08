//:polymorphism/StaticPolymorphism.java
// 静态方法的行为不具有多态性

class StaticSuper {
  public static String staticGet() {
    return "Base StaticGet()";
  }
  public String dynamicGet() {
    return "Base dynamicGet()";
  }
}

class StaticSub extends StaticSuper {
  public static String staticGet() {
    return "Derived staticGet()";
  }
  public String dynamicGet() {
    return "Derived dynamicGet()";
  }
}
public class StaticPolymorphism {
  public static void main(String[] args) {
    StaticSuper sup = new StaticSub(); // upcast
    System.out.println(sup.staticGet());
    System.out.println(sup.dynamicGet());
  }
}
