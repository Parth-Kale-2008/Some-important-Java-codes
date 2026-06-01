import java.util.*;

public class Library {

    String name;
    String author;
    int price;

    Library(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {

        HashMap<String, Library> books = new HashMap<>();

        books.put(
            "The Diary of a Wimpy Kid",
            new Library("The Diary of a Wimpy Kid", "Jeff Kinney", 200)
        );

        books.put("organic chem",
            new Library("organic chem","M.S chauhan",750) 
        );

        books.put("Cengage",
            new Library("Cengage","G tiwani",1000) 
        );

        books.put("Inorganic chem",
            new Library("Inorganic chem","vk jaiswal",750) 
        );

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the book:");
        String bookName = sc.nextLine();
        
        if(books.containsKey(bookName)){
            Library book = books.get(bookName);

            System.out.println("Name   : " + book.name);
            System.out.println("Author : " + book.author);
            System.out.println("Price  : " + book.price);
        }else{
            System.out.println("\nbook not found");
        }

        
    }
}
