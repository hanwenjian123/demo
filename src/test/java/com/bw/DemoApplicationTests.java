package com.bw;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		List<String> a = new ArrayList<String>();
		a.add("1");
		a.add("2");
		/*for (String temp : a) {
			if("2".equals(temp)){
				a.remove(temp);
			}
		}*/
        Iterator<String> iterator = a.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            if("1".equals(s)){
                iterator.remove();
            }
        }
        for (String s : a) {
			System.out.println(s);
		}
	}

}
