package PrototypePattern;

import PrototypePattern.ConcreteClass.MessageBox;
import PrototypePattern.ConcreteClass.UnderlinePen;
import PrototypePattern.framework.Manager;
import PrototypePattern.framework.Product;

/**
 * @ClassName Main
 * @Author wangfan
 * @Date 2022-04-14
 * @Description
 */
public class Main {
    public static void main(String[] args) {

        // 准备
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message", underlinePen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        // 生成
        // 克隆出一个实例出来
        Product p1 = manager.create("strong message");
        p1.use("hello, world");
        Product p2 = manager.create("warning box");
        p2.use("hello world");
        Product p3 = manager.create("slash box");
        p3.use("hello world");



    }
}
