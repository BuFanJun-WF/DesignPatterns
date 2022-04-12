package AdapterPattern.extend;

/**
 * @ClassName Print
 * @Author wangfan
 * @Date 2022-04-12
 * @Description "需求的接口"，也就是要实现的12v的直流电
 */
public interface Print {

    /**
     * 添加一个括号的方法
     */
    public abstract void printWeak();

    /**
     * 添加一个加星号的方法
     */
    public abstract void printStrong();
}
