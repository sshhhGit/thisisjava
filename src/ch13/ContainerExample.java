package ch13;
//13-2
public class ContainerExample {
    public static void main(String[] args) {
        Contanier<String> contanier1 =new Contanier<String>();
        contanier1.set("홍길동");
        String str = contanier1.get();

        Contanier<Integer> contanier2 = new Contanier<Integer>();
        contanier2.set(6);
        int value = contanier2.get();
    }
}
