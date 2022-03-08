//:reusing/FinaOverridingIllusion.java
import static SixthAccess.mytool.Print.*;

class WithFinals {
  private final void f() { print("WithFinals.f()"); }
  private void g() { print("WithFinals.g()"); }
}

class OverridingPrivate extends WithFinals {
  private final void f() { print("OverridingPrivate.f()"); }
  private void g() { print("OverridingPrivate.g()"); }
}

class OverridingPrivate2 extends OverridingPrivate {
  public final void f() { print("OverridingPrivate2.f()"); }
  public void g() { print("OverridingPrivate2.g()"); }
}

public class FinalOverridingIllusion {
  public static void main(String[] args) {
    OverridingPrivate2 op2 = new OverridingPrivate2();
    op2.f();
    op2.g();
    // upcast，向上转型
    OverridingPrivate op = op2;
    //! op.f(); op.g(); 错误，不能使用
    WithFinals wf = op2;
    //! wf.f(); wf.g();
  }
}
