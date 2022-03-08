//:object/ShowProperties.java
// 获取所有环境信息
public class ShowProperties {
  public static void main(String[] args){
    System.getProperties().list(System.out);
    System.out.println(System.getProperty("user.name"));
    System.out.println(
      System.getProperty("java.library.path"));
  }
}
