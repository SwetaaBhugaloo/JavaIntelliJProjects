public class Demo extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hey i am sending email");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
