package TemplateMethodPattern;

/**
 * @ClassName Main
 * @Author wangfan
 * @Date 2022-04-12
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        AbstractDisplay charDisplay = new CharDisplay('H');
        AbstractDisplay stringDisplay = new StringDisplay("Hello world");
        charDisplay.display();
        stringDisplay.display();
    }
}
