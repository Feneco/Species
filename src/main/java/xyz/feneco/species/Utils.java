package xyz.feneco.species;

public class Utils {
    static long strHash(String str){
        long hash = 5381;
        for(char c: str.toCharArray()){
            hash = ((hash << 5) + hash) + c;
        }
        return hash;
    }
}
