//:control/VowelsAndConsonants.java
// 随机生成字母，并判断是元音还是辅音字母
import java.util.*;

public class VowelsAndConsonants {
  public static void main(String[] args){
    Random rand = new Random(47);
    for(int i = 0; i < 10; i++){
      int c = rand.nextInt(26) + 'a';
      System.out.print((char)c + ", " + c + ": ");
      switch (c){
          case 'a':
          case 'e':
          case 'i':
          case 'o':
          case 'u':System.out.println("vowel");
                   break;
          case 'y':
          case 'w':System.out.println("Sometimes a vowel");
                   break;
          default:System.out.println("consonant");
      }
    }
  }
}
