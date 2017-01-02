
public class StringUtils {
    
    public static boolean included(String word, String searched){
        
        String cleanWord = word.trim();
        cleanWord = cleanWord.toUpperCase();
        
        String cleanSearch = searched.trim();
        
        if (cleanWord.contains(cleanSearch.toUpperCase())){
        return true;
    }
        
        return false;
    }
    
}
