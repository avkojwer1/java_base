public class Main {

    public static void main(String[] args) {

        Demo d = new Demo();
        d.start();
        Demo d2 = new Demo();
        d2.start();

        for(int i=0;i< 60; i++){
            System.out.println( "main run" + i);
        }
    }

}



