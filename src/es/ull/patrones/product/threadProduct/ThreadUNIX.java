package es.ull.patrones.product.threadProduct;

public class ThreadUNIX implements ThreadI {
    @Override
    public void getNameThread() {
        System.out.println("Create thread UNIX");
    }
}
