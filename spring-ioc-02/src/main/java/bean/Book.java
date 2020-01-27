package bean;

public class Book {

    /**
     * 自定义初始化方法
     */
    public void init(){
        System.out.println("Book初始化方法。。。");
    }

    /**
     * 自定义销毁方法
     */
    public void destory(){
        System.out.println("Book销毁方法。。。");
    }

    private String bookName;
    private String author;

    public Book() {
        System.out.println("Book 被创建");
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
