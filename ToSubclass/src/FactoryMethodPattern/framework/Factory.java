package FactoryMethodPattern.framework;

/**
 * @ClassName Factory
 * @Author wangfan
 * @Date 2022-04-12
 * @Description
 */
public abstract class Factory {
    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }

    /**
     * 用于生成工厂中的抽象产品，protected表明这个方法只能是该类的子类的才能进行调用
     * @param owner
     * @return
     */
    protected abstract Product createProduct(String owner);

    /**
     * 用于注册工厂中的抽象产品
     * @param product
     */
    protected abstract void registerProduct(Product product);

}
