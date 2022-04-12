package FactoryMethodPattern;

import FactoryMethodPattern.framework.Factory;
import FactoryMethodPattern.framework.Product;
import FactoryMethodPattern.idcard.IDCardFactory;

/**
 * @ClassName Main
 * @Author wangfan
 * @Date 2022-04-12
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小刚");
        Product card3 = factory.create("小红");
        card1.use();
        card2.use();
        card3.use();
    }
}
