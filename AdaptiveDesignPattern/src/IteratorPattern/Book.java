package IteratorPattern;

/**
 * @ClassName Book
 * @Author wangfan
 * @Date 2022-04-11
 * @Description 作为一个实体类与集合进行聚合
 */
public class Book {

    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
