package SingletonPattern;

/**
 * @ClassName Main
 * @Author wangfan
 * @Date 2022-04-14
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Start.........");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        if (instance1.equals(instance2)) {
            System.out.println("instance1与instance2是相同的实例");
        } else {
            System.out.println("instance1与instance2不是相同的实例");
        }
        System.out.println("End...........");
    }
}
