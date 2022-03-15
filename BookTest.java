import java.util.*;
public class BookTest {
    public static void main(String[] args) {
        String name,author,publisher;
        int ISBN_number;
        Scanner in = new Scanner(System.in);
        Book[] test = new Book[30];
        System.out.print("Enter the books data\nType -1 to break\n");
        for(int i=0;i<30;i++)
        {
            System.out.printf("Book %d\n",(i+1));
            System.out.println("Enter the book name");
            name=in.next();
            System.out.println("Enter the ISBN number");
            ISBN_number = in.nextInt();
            System.out.println("Enter the book author");
            author=in.next();
            System.out.println("Enter the publisher");
            publisher=in.next();
            test[i] = new Book(name,ISBN_number,author,publisher);
        }
        for(int i=0;i<30;i++)
        {
            System.out.printf("Book %d",(i+1));
            System.out.printf("%s\n",test[i].getBookInfo());
        }
    }
}