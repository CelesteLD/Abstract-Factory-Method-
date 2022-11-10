package es.ull.patrones.factory;

import es.ull.patrones.product.pipeProduct.Pipe;
import es.ull.patrones.product.pipeProduct.PipeVMS;
import es.ull.patrones.product.socketProduct.Socket;
import es.ull.patrones.product.socketProduct.SocketVMS;
import es.ull.patrones.product.threadProduct.ThreadI;
import es.ull.patrones.product.threadProduct.ThreadVMS;

public class VMSFactory implements SystemFactory {

    @Override
    public void getNameOfFactory() {
        System.out.println("VMS Factory:");
    }

    @Override
    public Socket createSocket() {
        return new SocketVMS();
    }

    @Override
    public Pipe createPipe() {
        return new PipeVMS();
    }

    @Override
    public ThreadI createThread() {
        return new ThreadVMS();
    }
}
