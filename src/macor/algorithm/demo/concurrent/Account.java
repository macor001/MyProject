package macor.algorithm.demo.concurrent;

public class Account {
    //allocator 应该为单例
    private Allocator allocator;
    private int balance;
    //转账
    void transfer(Account target, int amt){
        while (!allocator.apply(this,target));
        try{
            //锁定转出账户
            synchronized (this){
                //锁定转入账户
                synchronized (target){
                    if(this.balance > amt){
                        this.balance -= amt;
                        target.balance += amt;
                    }
                }
            }
        }
        finally {
            allocator.free(this,target);
        }
    }
}
