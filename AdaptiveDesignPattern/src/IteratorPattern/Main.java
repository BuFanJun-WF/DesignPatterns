package IteratorPattern;

/**
 * @ClassName Main
 * @Author wangfan
 * @Date 2022-04-11
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("十万个为什么"));
        bookShelf.appendBook(new Book("简爱"));
        bookShelf.appendBook(new Book("水浒传"));
        bookShelf.appendBook(new Book("西游记"));

        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }

        System.out.println();
        Iterator reverseIterator = bookShelf.reverseIterator();
        while (reverseIterator.hasNext()){
            Book book = (Book) reverseIterator.next();
            System.out.println(book.getName());
        }
    }
}
