package TemplateMethodPattern;

import java.nio.charset.StandardCharsets;

/**
 * @ClassName StringDisplay
 * @Author wangfan
 * @Date 2022-04-12
 * @Description
 */
public class StringDisplay extends AbstractDisplay{

    /**
     * 需要显示的字符串
     */
    private String string;

    /**
     * 以字节为单位计算出的字符串长度
     */
    private int width;

    public StringDisplay(String string){
        this.string = string;
        this.width = string.getBytes().length;
    }


    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
