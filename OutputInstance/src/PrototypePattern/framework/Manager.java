package PrototypePattern.framework;

import java.util.HashMap;

/**
 * @ClassName Manager
 * @Author wangfan
 * @Date 2022-04-14
 * @Description 使用Product接口来复制实例
 */
public class Manager {

    /**
     * 保存实例的名字和实例之间的对应关系
     */
    private HashMap showcase = new HashMap();

    /**
     * 接受到1组”名字“和”Product接口“注册到showcase中,现在没有办法知道proto是哪个类，但是可以确定是其是实现了Product接口类的实例。
     * @param name
     * @param proto
     */
    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    /**
     * 通过注册的实例类型，生成该产品的实例
     * @param protoname
     * @return
     */
    public Product create(String protoname) {
        Product p = (Product) showcase.get(protoname);
        return p.createClone();
    }
}
