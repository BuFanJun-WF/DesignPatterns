package FactoryMethodPattern.idcard;

import FactoryMethodPattern.framework.Factory;
import FactoryMethodPattern.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

/**
 * @ClassName IDCardFactory
 * @Author wangfan
 * @Date 2022-04-12
 * @Description
 */
public class IDCardFactory extends Factory {

    private List<String> owners = new ArrayList<>();

    // @Override
    // protected Product createProduct(String owner) {
    //     return new IDCard(owner);
    // }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }

    private HashMap database = new HashMap();
    private int serial = 100;
    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    public HashMap getDatabase() {
        return database;

    }
}
