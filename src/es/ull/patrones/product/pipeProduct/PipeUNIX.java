package es.ull.patrones.product.pipeProduct;

public class PipeUNIX implements Pipe {
    @Override
    public void getNamePipe() {
        System.out.println("Create pipe UNIX");
    }
}
