package study.chap2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WasRunTest {

    @Test
    public void testMethod(){
        WasRun test = new WasRun("testMethod");
        System.out.println(test.wasRun);
        test.run();
        System.out.println(test.wasRun);
    }

}