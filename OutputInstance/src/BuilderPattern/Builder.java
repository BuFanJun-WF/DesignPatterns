package BuilderPattern;

/**
 * @ClassName Builder
 * @Author wangfan
 * @Date 2022-04-14
 * @Description 声明了编写文档的方法的抽象类，其中有编写标题、字符串、条目的方法
 *                  close方法是完成文档编写的方法
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
