//:polymorphism/music/Music.java
// 继承和向上转型
package EighthPolymorphism.music;

public class Music {
  public static void tune(Instrument i) {
    i.play(Note.MIDDLE_C);
  }
  public static void main(String[] args) {
    Wind flute = new Wind();
    tune(flute);
  }
}
