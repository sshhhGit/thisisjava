package ch12;
//12-2
public class MovieThread2 extends Thread {

    @Override
    public void run() {

        while (true) {
            System.out.println("동영상을 재생합니다.");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}



