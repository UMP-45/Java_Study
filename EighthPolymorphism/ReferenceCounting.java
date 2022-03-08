//:polymorphism/ReferenceCounting
// 使用引用计数来跟踪访问共享对象的对象数量并清理
import static SixthAccess.mytool.Print.*;

class Shared {
  private int refcount = 0;
  private static long counter = 0;
  private final long id = counter++;
  public Shared() {
    print("Creating" + this);
  }
  public void addRef() { refcount++; }
  protected void dispose() {
    print("refcount: " + refcount);
    if(--refcount==0)
      print("Disposing " + this);
  }
  public String toString() { return "Shared" + id;}
}

class Composing {
  private Shared shared;
  private static long counter = 0;
  private final long id = counter++;
  public Composing(Shared shared) {
    print("Creating " + this);
    this.shared = shared;
    this.shared.addRef();
    print("counter: " + counter);
  }
  protected void dispose() {
    print("disposing " + this);
    shared.dispose();
  }
  public String toString() { return "Composing " + id; }
}

public class ReferenceCounting {
  public static void main(String[] args) {
    Shared shared = new Shared();
    Composing[] composing = {new Composing(shared),
      new Composing(shared), new Composing(shared),
      new Composing(shared), new Composing(shared),};
    for(Composing c : composing)
      c.dispose();
  }
}
