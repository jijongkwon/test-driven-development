package study.chap2;

public class WasRun {

    String wasRun;

    WasRun(String text){
        wasRun = null;
    }
    public void testMethod(){
        this.wasRun = "1";
    }
    public void run(){
        this.testMethod();
    }
}
