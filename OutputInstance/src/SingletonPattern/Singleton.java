package SingletonPattern;

/**
 * @ClassName Singleton
 * @Author wangfan
 * @Date 2022-04-14
 * @Description 定义一个生成一个实例的对象
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("生成了一个实例");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
