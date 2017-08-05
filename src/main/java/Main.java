import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) throws IOException{

        Supplier supplier=()->2+2;
        HttpDOM dom=new HttpDOM("https://www.finder.com/pl/netflix-movies");

        List<String> movies=dom.getTitles();
    }
}
