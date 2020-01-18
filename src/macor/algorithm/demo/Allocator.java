package macor.algorithm.demo;

import java.util.ArrayList;
import java.util.List;

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
