//:initialization/SimpleEnumUse.java
// 测试枚举类型

public class SimpleEnumUse{
  public static void main(String[] args){
    Spiciness howHot = Spiciness.MEDIUM;
    System.out.println(howHot);
    for(Spiciness s : Spiciness.values())
      System.out.println(s + ", ordinal " + s.ordinal());
  }
}

