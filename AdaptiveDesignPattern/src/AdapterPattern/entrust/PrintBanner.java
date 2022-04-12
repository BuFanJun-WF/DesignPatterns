package AdapterPattern.entrust;

import AdapterPattern.extend.Banner;

/**
 * @ClassName PrintBanner
 * @Author wangfan
 * @Date 2022-04-12
 * @Description 实现的对象适配器，
 */
public class PrintBanner extends Print{

    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
