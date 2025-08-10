package Day30.a01multithreadingdemo01.a03calldemo03;

import java.util.concurrent.Callable;

public class MyCallDemo01 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        // 求100之间的和
        int sun = 0;
        for (int i = 1; i <= 100; i++) {
            sun = sun + i;
        }
        return sun;
    }

}
