package IteratorPattern;

/**
 * @ClassName BookShelfIteratorInReverse
 * @Author wangfan
 * @Date 2022-04-12
 * @Description
 */
public class BookShelfIteratorInReverse implements Iterator{

    private BookShelf bookShelf;

    private final int bookBegin = 0;

    private int index;

    public BookShelfIteratorInReverse(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        this.index = bookShelf.getLength();
    }

    @Override
    public boolean hasNext() {
        return index > bookBegin;
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index - 1);
        index--;
        return book;
    }
}
