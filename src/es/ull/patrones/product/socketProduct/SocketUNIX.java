package es.ull.patrones.product.socketProduct;

public class SocketUNIX implements Socket {
    @Override
    public void getNameSocket() {
        System.out.println("Create socket UNIX");
    }
}
