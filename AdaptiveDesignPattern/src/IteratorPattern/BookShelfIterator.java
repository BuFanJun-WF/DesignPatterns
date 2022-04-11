package IteratorPattern;

/**
 * @ClassName BookShelfIterator
 * @Author wangfan
 * @Date 2022-04-11
 * @Description
 */
public class BookShelfIterator implements Iterator{

    private BookShelf bookShelf;

    private int index;

    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    /**
     * 确定接下来是否可以调用next方法
     * @return
     */
    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()){
            return true;
        } else {
            return false;
        }
    }

    /**
     * 返回当前元素，并指向下一个元素
     * @return
     */
    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
