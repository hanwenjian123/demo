package com.bw.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by ${hanwenjian} on 2017/8/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ThreadPoolTest {

    @Test
    public void threadPool(){
        // 创建3个线程的线程池

        ThreadPool t = ThreadPool.getThreadPool(3);
        t.execute(new Runnable[] { new Task(), new Task(), new Task() });
        t.execute(new Runnable[] { new Task(), new Task(), new Task() });
        System.out.println(t);
        t.destroy();// 所有线程都执行完成才destory
        System.out.println(t);
    }

    // 任务类
    static class Task implements Runnable {
        private static volatile int i = 1;

        @Override
        public void run() {// 执行任务
            System.out.println("任务 " + (i++) + " 完成");
        }
    }
}
