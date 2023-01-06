public class Book {
    private String bookName;
    private int bookPageNumber;
    private String bookWriter;
    private int bookDate;

    public Book(String bookName, int bookPageNumber, String bookWriter, int bookDate) {
        this.bookName = bookName;
        this.bookPageNumber = bookPageNumber;
        this.bookWriter = bookWriter;
        this.bookDate = bookDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPageNumber() {
        return bookPageNumber;
    }

    public void setBookPageNumber(int bookPageNumber) {
        this.bookPageNumber = bookPageNumber;
    }

    public String getBookWriter() {
        return bookWriter;
    }

    public void setBookWriter(String bookWriter) {
        this.bookWriter = bookWriter;
    }

    public int getBookDate() {
        return bookDate;
    }

    public void setBookDate(int bookDate) {
        this.bookDate = bookDate;
    }
}
