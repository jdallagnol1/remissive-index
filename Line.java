


public class Line{
    DoubleLinkedList words;

    public Line(){
        words = new DoubleLinkedList();
    }

    public int getSize(){
        return words.size();
    }

    public int getOccurrences(String word){
        
        return -1;
    }

    public void addWords(String l){

    }

    @Override
    public String toString(){
        String line ="";
        for(int i = 0; i<words.size(); ++i){
            line+= words.get(i);
        }
        return line;
    }

    public String toString(int i){
        return words.get(i);
    }

    
}