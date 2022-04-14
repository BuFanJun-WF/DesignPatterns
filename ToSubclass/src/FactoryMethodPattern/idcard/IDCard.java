package FactoryMethodPattern.idcard;

import FactoryMethodPattern.framework.Product;

/**
 * @ClassName IDCard
 * @Author wangfan
 * @Date 2022-04-12
 * @Description
 */
public class IDCard extends Product {
    private String owner;

    /**
     * 添加IDCard类的卡的编号
     */
    private int serial;

    IDCard(String owner){
        System.out.println("制作" + owner + "的ID卡");
        this.owner = owner;
    }

    IDCard(String owner, int serial){
        System.out.println("制作" + owner + "(" + serial + ")" + "的ID卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡");
        System.out.println("使用" + owner + "(" + serial + ")" + "的ID卡");

    }

    public String getOwner() {
        return owner;
    }

    public int getSerial() {
        return serial;
    }
}
