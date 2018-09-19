import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void countAllWords(String[] args) {
    String text = WebScraper.urlToString("http://erdani.com/tdpl/hamlet.txt");
    Scanner parser = new Scanner(text).useDelimiter("\\s");
    int count = 0;
    while(parser.hasNext()) {
        String temp = parser.next();
        if(temp.length() > 1) {
            count++;
        }
    }
        System.out.println(count);
    }

    public static void main(String[] args) {
        String text = WebScraper.urlToString("http://erdani.com/tdpl/hamlet.txt");
        String searchWord = "prince";
        Scanner parser = new Scanner(text).useDelimiter("\\s");
        int count = 0;
        while(parser.hasNext()) {
            String temp = parser.next();
            if(temp.toLowerCase().contains(searchWord.toLowerCase())) {
                count++;
            }
        }
        System.out.println(count);
    }

}
