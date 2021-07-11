package ch13;
//13-4
public class Util{
    public static <K, V> V getValue(Pair<K, V> p, K k){
        if (p.getValue()==k) {
            return p.getValue();
        } else{
            return null;
        }
    }
}
