package AdapterPattern.extend;

/**
 * @ClassName PrintBanner
 * @Author wangfan
 * @Date 2022-04-12
 * @Description
 */
public class PrintBanner extends Banner implements Print{

    public PrintBanner(String string){
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
