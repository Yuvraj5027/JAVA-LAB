class Run extends Thread{ //CHild or thread class
    public void running(){
        int i=1;
        while(i<5){

            System.out.println("Running......"+i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }

    }

}
public class RunningThreads {
    public static void main(String args []){
        Run r=new Run();
        r.start();
        r.running();

    }
}
