package es.ull.patrones;

import es.ull.patrones.factory.SystemFactory;
import es.ull.patrones.product.pipeProduct.Pipe;
import es.ull.patrones.product.socketProduct.Socket;
import es.ull.patrones.product.threadProduct.ThreadI;


public class Paralell {
    SystemFactory factory;

    public Paralell(SystemFactory factory) {
        this.factory = factory;
    }

    public Socket doOneLaneIPC() {
        return factory.createSocket();
    }

    public Pipe doTwoLaneIPC() {
        return factory.createPipe();
    }

    public ThreadI doParallelProcessing() {
        return factory.createThread();
    }

}
