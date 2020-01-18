package macor.algorithm.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 此转账适合并发冲突量不大时的场合，因为在大数据量环境下，循环等待这种方案就不适用了，性能太差
 */
public class Allocator {
    private List<Object> als = new ArrayList<>();

    synchronized boolean apply(Object from, Object to){
        //一次性申请所有资源
        if(als.contains(from) || als.contains(to)){
            return false;
        }
        else {
            als.add(from);
            als.add(to);
        }
        return true;
    }

    //归还资源
    synchronized void free(Object from, Object to){
        als.remove(from);
        als.remove(to);
    }
}
