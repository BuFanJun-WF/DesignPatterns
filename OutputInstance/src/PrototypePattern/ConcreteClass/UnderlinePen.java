package PrototypePattern.ConcreteClass;

import PrototypePattern.framework.Product;

/**
 * @ClassName MessageBox
 * @Author wangfan
 * @Date 2022-04-14
 * @Description
 */
public class UnderlinePen implements Product {

    private char ulchar;

    public UnderlinePen(char ulchar){
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;

        System.out.println("\"" + s + "\"");
        for (int i = 0; i < length; i++) {
            System.out.print(ulchar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            System.out.println("进行了克隆的方法");
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
