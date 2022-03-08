//:polymorphism/FieldAccess.java
// 在编译期访问某个域

class Super {
  public int field = 0;
  public int getField() { return field; }
}

class Sub extends Super {
  public int field = 1;
  public int getField() { return field; }
  public int getSuperField() { return super.field; }
}

public class FieldAccess {
  public static void main(String[] args) {
    Super sup = new Sub(); // 向上转型
    System.out.println("sub.field = " + sup.field + ", sup.getField() = " + sup.getField());
    Sub sub = new Sub();
    System.out.println("sub.field = " + sub.field + ", sub.getField() = " + sup.getField() +
      ", sub.getSuperField() = " + sub.getSuperField());
  }
}
