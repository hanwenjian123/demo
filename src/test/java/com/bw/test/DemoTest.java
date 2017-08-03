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
public class DemoTest {

    @Test
    public void TestThread(){

        RunnableDemo r1 = new RunnableDemo("thread-1");
        r1.start();
        RunnableDemo r2 = new RunnableDemo("thread-2");
        r2.start();

    }


}

