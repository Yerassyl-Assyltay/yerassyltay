public class ex30_11 {
    String s = "string 1";
    String s1 = "string 2";

    Thread th = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("Start of thread 1");

            synchronized (s) {
                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {
                }
            }
            System.out.println("End of thread 1");
        }
    });

    Thread th1 = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("Start of thread 2");
            synchronized (s1) {
                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {
                }
            }
            System.out.println("End of thread 2");
        }
    });

    public static void main(String[] args) {
        ex30_11 ex = new ex30_11();
        ex.th.start();
        ex.th1.start();
    }
}
