package testpackage;

public class Test {

    @org.junit.Test
    public synchronized void doTest(){
        try {
            wait(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ended");
    }
}
