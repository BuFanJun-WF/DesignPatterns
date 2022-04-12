package AdapterPattern.entrust;

/**
 * @ClassName Print
 * @Author wangfan
 * @Date 2022-04-12
 * @Description 定义了一个抽象类，这个抽象类现实的需求
 */
public abstract class Print {

    /**
     * 在抽象类中的括号方法
     */
    public abstract void printWeak();

    /**
     * 定义的抽象加强字符串的方法
     */
    public abstract void printStrong();

}
