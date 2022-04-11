package IteratorPattern;

/**
 * @ClassName Aggregate
 * @Author wangfan
 * @Date 2022-04-11
 * @Description 添加一个集合的接口,集合中要有一个可以遍历的迭代器
 */
public interface Aggregate {

    /**
     * 生成一个用于遍历集合的迭代器
     * @return 返回一个迭代器
     */
    public abstract Iterator iterator();
}
