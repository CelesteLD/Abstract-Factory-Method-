package es.ull.patrones.factory;

import es.ull.patrones.product.pipeProduct.Pipe;
import es.ull.patrones.product.pipeProduct.PipeUNIX;
import es.ull.patrones.product.socketProduct.Socket;
import es.ull.patrones.product.socketProduct.SocketUNIX;
import es.ull.patrones.product.threadProduct.ThreadI;
import es.ull.patrones.product.threadProduct.ThreadUNIX;

public class UNIXFactory implements SystemFactory {
    @Override
    public void getNameOfFactory() {
        System.out.println("UNIX Factory:");
    }

    @Override
    public Socket createSocket() {
        return new SocketUNIX();
    }

    @Override
    public Pipe createPipe() {
        return new PipeUNIX();
    }

    @Override
    public ThreadI createThread() {
        return new ThreadUNIX();
    }
}
