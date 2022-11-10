import es.ull.patrones.Paralell;
import es.ull.patrones.factory.*;
import es.ull.patrones.product.pipeProduct.Pipe;
import es.ull.patrones.product.socketProduct.Socket;
import es.ull.patrones.product.threadProduct.ThreadI;


public class Main {
    public static void main(String[] args) {
        SystemFactory vmsFactory = new VMSFactory();

        Paralell paralell = new Paralell(vmsFactory);

        Socket socket = paralell.doOneLaneIPC();
        Pipe pipe = paralell.doTwoLaneIPC();
        ThreadI thread = paralell.doParallelProcessing();

        vmsFactory.getNameOfFactory();
        socket.getNameSocket();
        pipe.getNamePipe();
        thread.getNameThread();
    }
}