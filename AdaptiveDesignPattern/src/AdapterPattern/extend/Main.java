package AdapterPattern.extend;

/**
 * @ClassName Main
 * @Author wangfan
 * @Date 2022-04-12
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        Print print = new PrintBanner("hello");
        print.printStrong();
        print.printWeak();
    }
}
