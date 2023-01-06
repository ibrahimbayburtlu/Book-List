import java.util.*;

public class BookList {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Map<String,String> map = new HashMap<>();
        Scanner input = new Scanner(System.in);
        /*
        for (int i = 0; i < 10; i++){

            System.out.println("Book name:");
            String bookName = input.nextLine();

            System.out.println("Book page:");
            int bookPageNumber = input.nextInt();

            System.out.println("Book writer:");
            String bookWriter = input.nextLine();

            System.out.println("Book Date:");
            int bookDate = input.nextInt();

            Book book = new Book(bookName,bookPageNumber,bookWriter,bookDate);
        }
        */
        books.add(new Book("Fahrenheit", 99, "Ray", 1956));
        books.add(new Book("Suc ve Ceza", 612, "Dostoyevski", 1925));
        books.add(new Book("Savaş ve Baris", 800, "Tolstoy", 1915));
        books.add(new Book("Denizler altinda yirmi bin fersah", 55, "Jules Verne", 1925));
        books.add(new Book("Tutunamayanlar", 550, "Oğuz Atay", 1950));
        books.add(new Book("Kuyucakli Yusuf", 145, "Sabahattin Ali", 1965));
        books.add(new Book("Metro 2023", 650, "Dmitry Glukhovsky", 2006));
        books.add(new Book("Momo", 69, "Ende", 1980));
        books.add(new Book("Hobbit", 565, "J.R.R Tolkien", 1940));
        books.add(new Book("Pamuk prenses", 45, "Bilinmiyor", 0));
        books.stream().forEach(book -> map.put(book.getBookName(),book.getBookWriter()));
        for (String s:map.keySet()){
            System.out.println("Book name:"+s+" Author Name: "+map.get(s));
        }
        List<Book> list = books.stream().filter(book -> book.getBookPageNumber() > 100).toList();
        list.stream().forEach(book -> System.out.println("book name: "+book.getBookName()+"  "+"Book Page number: "+book.getBookPageNumber()+"  "+"Author: "+book.getBookPageNumber()+"  "+book.getBookDate()));

    }
}
