public class Talkative implements Runnable{
    public static int num;
    public Talkative(int entier){
        Talkative.num = entier;
    }

    @Override
    public void run() {
        for (int i =0;i<100;i++){
            System.out.print(Talkative.num+" ");
        }
        System.out.println("******");
    }

    public static void main(String[] args)  {
         for(int i=0;i<10;i++){
             Talkative obj = new Talkative(i);
             Thread thread= new Thread(obj);
             thread.start();
         }

    }
}
