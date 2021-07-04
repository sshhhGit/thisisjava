package ch11;
//11-11
public class IntegercompareExample {
    public static void main(String[] args) {
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        System.out.println(obj1 == obj2);  //true
        System.out.println(obj3 == obj4);  //false

        //박싱된 bye, short, int 값은 -128 ~ 127 사이의 값만 == | != 연산자로 바로 비교가능
        //내부 값을 언박싱하거나 equals() 메소드 사용
    }
}

