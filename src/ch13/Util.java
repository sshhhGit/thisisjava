package ch13;
//13-4
public class Util{
    //방법1
    public static <K, V> V getValue(Pair<K, V> p, K k){
        if (p.getKey()==k) {
            return p.getValue();
        } else{
            return null;
        }

      //방법2
//    public static <P extends Pair<K,V>, K , V> V getValue(P p, K k) {
//        if (p.getKey() == k) {
//            return p.getValue();
//        } else {
//            return null;
//        }
    }
}
