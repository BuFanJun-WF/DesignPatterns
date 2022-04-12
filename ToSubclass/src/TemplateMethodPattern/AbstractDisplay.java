package TemplateMethodPattern;

/**
 * @ClassName AbstractDisplay
 * @Author wangfan
 * @Date 2022-04-12
 * @Description 定义展示的抽象类，设置展示的流程框架
 */
public abstract class AbstractDisplay {

    /**
     * 打开数组循环
     */
    public abstract void open();

    /**
     * 进行数据打印
     */
    public abstract void print();

    /**
     * 方法关闭
     */
    public abstract void close();

    /**
     * 定义展示的流程框架
     */
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

}
