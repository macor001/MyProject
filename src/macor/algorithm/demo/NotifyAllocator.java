package macor.algorithm.demo;

import java.util.List;

/**
 * 此转账适合并发冲突量大的场合，因为在大数据量环境下，通过等待-通知机制可以提高性能
 */
public class NotifyAllocator {
    private List<Object> als;

    synchronized void apply(Object from, Object to){
        while (als.contains(from) || als.contains(to)){
            try{
                wait();
            }
            catch (Exception e){

            }
            als.add(from);
            als.add(to);
        }
    }

    synchronized void free(Object from, Object to){
        als.remove(from);
        als.remove(to);
        notifyAll();
    }

}
