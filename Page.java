import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class Page{
    String[] lines;
    int countLines;
    int pageNumber;

    public Page(){
        lines = new String[40];
        countLines = 1;
    }
    

    public void addLine(String l){
        lines[countLines] = l;
        ++countLines;

    }
    
    public int getSize(){
        return lines.length;
    }


    public String toString(int i){
        return lines[i];
    }
}