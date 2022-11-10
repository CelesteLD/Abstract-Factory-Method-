package es.ull.patrones.factory;

import es.ull.patrones.product.pipeProduct.Pipe;
import es.ull.patrones.product.pipeProduct.PipeNT;
import es.ull.patrones.product.socketProduct.Socket;
import es.ull.patrones.product.socketProduct.SocketNT;
import es.ull.patrones.product.threadProduct.ThreadI;
import es.ull.patrones.product.threadProduct.ThreadNT;

public class NTFactory implements SystemFactory {
    @Override
    public void getNameOfFactory() {
        System.out.println("NT Factory:");
    }

    @Override
    public Socket createSocket() {
        return new SocketNT();
    }

    @Override
    public Pipe createPipe() {
        return new PipeNT();
    }

    @Override
    public ThreadI createThread() {
        return new ThreadNT();
    }
}
