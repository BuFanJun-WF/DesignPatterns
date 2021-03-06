package BuilderPattern;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ClassName HTMLBuilder
 * @Author wangfan
 * @Date 2022-04-14
 * @Description 其功能是使用HTML编写文档，其返回结果是HTML文件的名字
 */
public class HTMLBuilder extends Builder{

    private String fileName;
    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        fileName = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(fileName));
        }catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");
        // 输出标题
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {
        return fileName;
    }
}
