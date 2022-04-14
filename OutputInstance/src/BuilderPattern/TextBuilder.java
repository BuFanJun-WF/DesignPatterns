package BuilderPattern;

/**
 * @ClassName TextBuilder
 * @Author wangfan
 * @Date 2022-04-14
 * @Description 使用纯文本编写文档，并以String返回结果
 */
public class TextBuilder extends Builder{

    /**
     * 文档内容保存在该字段中
     */
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("==============================\n");
        buffer.append("[" + title + "]\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append('■' + str + "\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append("   ." + items[i] + "\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("==============================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
