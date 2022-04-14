package PrototypePattern.framework;

/**
 * @ClassName Product
 * @Author wangfan
 * @Date 2022-04-14
 * @Description 是具有复制功能的接口，继承了java.lang.Cloneable接口
 */
public interface Product extends Cloneable{

    /**
     * 用于使用的方法，具体怎么使用，则被交给子类去实现
     * @param s
     */
    public abstract void use(String s);

    /**
     * 用于复制实例的方法。
     * @return
     */
    public abstract Product createClone();

}
