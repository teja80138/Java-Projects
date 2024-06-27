package CodeGen;

import java.util.Hashtable;

public class Dict {
    private static Hashtable<String, String> dict = new Hashtable<String,String>();
    
    
    public static Hashtable getDict(){
        dict.put("1","a");
        return dict;
    }
}
