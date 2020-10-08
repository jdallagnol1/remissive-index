import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Book {
    Page[] pages;
    int countPages;
    //int countLines;
    

    public Book(){
        pages = new Page[10000];
        countPages = 1;
        //countLines = 0;
    }

    public int getNumberOfPages(){
        return countPages;
    }

    public void loadBook(){
        

        Path path1 = Paths.get("teste.txt");// java.txt

        try (BufferedReader reader = Files.newBufferedReader(path1, Charset.defaultCharset())) {
            Page p = new Page();
            pages[countPages] = p; 
            String line = null;
            while ((line = reader.readLine()) != null) {
                p.addLine(line);
                System.out.println(line.toString());
                if (p.getSize() == 40) {
                    p = new Page();
                    ++countPages; 
                    pages[countPages] = p;
                }
            }
        } catch (IOException e) {
            System.err.format("Erro na leitura do arquivo: ", e);
        }
    }
}
    
