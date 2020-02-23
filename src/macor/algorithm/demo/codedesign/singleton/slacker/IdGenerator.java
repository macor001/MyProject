package macor.algorithm.demo.codedesign.singleton.slacker;

import java.util.concurrent.atomic.AtomicLong;

public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private static IdGenerator instance;
    private IdGenerator(){}

    private static synchronized IdGenerator getInstance(){
        if(null == instance){
            instance = new IdGenerator();
        }
        return instance;
    }

    public long getId(){
        return id.incrementAndGet();
    }
}
