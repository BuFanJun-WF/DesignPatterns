package IteratorPattern;

/**
 * @ClassName Iterator
 * @Author wangfan
 * @Date 2022-04-11
 * @Description
 */
public interface Iterator {

    /**
     * 判断迭代器是否还有下一个
     * @return 返回是否有确认值
     */
    public abstract boolean hasNext();

    /**
     * 获取迭代器中的下一个对象
     * @return 返回迭代器对象
     */
    public abstract Object next();
}
