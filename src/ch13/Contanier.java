package ch13;
//13-2
public class Contanier <T>{
    private T container;

    public T get() {
        return container;
    }

    public void set(T container) {
        this.container = container;
    }
}
