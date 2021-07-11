package ch13;
//13-3
public class ContainerExample2 {
    public static void main(String[] args) {
        Contanier2<String, String> contanier1 = new Contanier2<String, String>();
        contanier1.set("홍길동", "도적");
        String name1 = contanier1.getKey();
        String job = contanier1.getValue();

        Contanier2<String, Integer> contanier2 = new Contanier2<String, Integer>();
        contanier2.set("홍길동", 35);
        String name2 = contanier1.getKey();
        int age = contanier2.getValue();
    }
}
