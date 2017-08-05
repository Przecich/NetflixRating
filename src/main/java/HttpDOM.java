import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class HttpDOM {
    private Document document;

    public HttpDOM(String url) throws IOException {
        document = Jsoup.connect(url).get();
    }

    public List<String> getTitles() {
        List<String> titles=document.select("table[class=custom-table js-tablesorter")
                .select("tbody")
                .select("tr")
                .stream()
                .map(x->x.child(0).text())
                .collect(Collectors.toList());

        return titles;
    }


}
