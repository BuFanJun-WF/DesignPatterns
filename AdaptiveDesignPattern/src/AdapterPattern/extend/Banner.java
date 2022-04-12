package AdapterPattern.extend;

/**
 * @ClassName Banner
 * @Author wangfan
 * @Date 2022-04-12
 * @Description 表示现实实际拥有的条件情况，类似于100v的交流电
 */
public class Banner {

    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + this.string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + this.string + "*");
    }
}
