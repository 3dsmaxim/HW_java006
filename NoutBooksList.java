import java.util.HashSet;
import java.util.Set;

public class NoutBooksList {
    public Set<NoutBook> noutList(){
        Set<NoutBook> NoutBooks = new HashSet<>();
        
        NoutBook n1 = new NoutBook("evga", 24, 1000, "win11", "green");
        NoutBook n2 = new NoutBook("aser", 32, 2000, "win10", "yellow");
        NoutBook n3 = new NoutBook("baykal", 32, 2000, "linux", "white");
        NoutBook n4 = new NoutBook("aser", 24, 1000, "no", "black");
        NoutBooks.add(n1);
        NoutBooks.add(n2);
        NoutBooks.add(n3);
        NoutBooks.add(n4);
        return NoutBooks;
    }
}
