//:operators/Assignment.java
// 对象赋值

class Tank{
    int level;
}
public class Assignment {
    public static void main(String[] args){
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        Tank t3 = new Tank();
        t1.level = 0;
        t2.level = 1;
        t3.level = 3;
        System.out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1 = t2; // t1被覆盖，t1,t2包含了相同的引用，指向相同的对象
        //t1.level = t2.level;
        System.out.println("2: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1.level = 2;
        System.out.println("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
        t1.level = t3.level;
        System.out.println("4: t1.level: " + t1.level + ", t2.level: " + t2.level + ", t3.level: " + t3.level);
    }
}
