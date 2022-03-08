//:control/BreakAndContinue.java
// 测试break和continue关键字

/*class Range implements Iterable<Integer>{
  private final int start;
  private final int end;
  private final int step;

  public Range(int end){
    this(0,end,1);
  }
  public Range(int start, int end){
    this(start, end, 1);
  }
  public Range(int start, int end, int step){
    this.start = start;
    this.end = end;
    this.step = step;
  }

  @Override
  public Iterable<Integer> iterator(){
    return new Itr();
  }
  private class Itr implements Iterator<Integer>{
    int current = start;
    @Override
    public boolean hasNext(){
      return step > 0 ? current < end : current > end;
    }
    @Override
    public Integer next(){
      int t = current;
      current += step;
      return t;
    }
  }
}*/
public class BreakAndContinue {
  public  static int[] Range(int start, int end, int step){
    int sz = (end - start)/step; //有些情况需要向上取整
    int[] result = new int[sz];
    for(int i = 0; i < sz; i++)
      result[i] = start + (i * step);
    return result;
  }
  public static void main(String[] args){
    for(int i = 0; i < 100; i++){
      if(i == 74) break;
      if(i % 9 != 0) continue;
      System.out.print(i + " ");
    }
    System.out.println();
    for(int i : Range(0,100,1)){
      if(i == 74) break;
      if(i % 9 != 0) continue;
      System.out.print(i + " ");
    }
    System.out.println();
    int i = 0;
    while (true){
      i++;
      int j = i * 27;
      if(j == 1269) break;
      if(i % 10 != 0) continue;
      System.out.print(i + " ");
    }
  }
}

