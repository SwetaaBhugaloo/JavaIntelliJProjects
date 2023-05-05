public class DemoMain {
    public static void main(String[] args) {

        Demo d = new Demo();
        Thread t1 = new Thread();

        t1.run();
        for (int i = 0; i < 100; i++) {
            System.out.println("Regular execution");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
