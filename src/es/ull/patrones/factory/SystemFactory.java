package es.ull.patrones.factory;

import es.ull.patrones.product.pipeProduct.Pipe;
import es.ull.patrones.product.socketProduct.*;
import es.ull.patrones.product.threadProduct.ThreadI;

public interface SystemFactory {
    public void getNameOfFactory();
    public Socket createSocket();
    public Pipe createPipe();
    public ThreadI createThread();
}
