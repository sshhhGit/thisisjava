package ch14;
//14-4
import java.util.function.IntSupplier;

public class LambdaExample {
    public static int method(int x, int y){
        IntSupplier supplier = () -> {
            //x *= 10;                      //final 특성때문에 수정 불가
            int result= x + y;
            return result;
        };
        int result = supplier.getAsInt();
        return result;
    }

    public static void main(String[] args) {
        System.out.println(method(3,5));
    }
}
