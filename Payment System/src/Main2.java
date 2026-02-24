public class Main2 {
    public static void main(String[] args) {
        Runnable task = new Thread();
        Thread thread = new Thread(task);
        thread.start();

    }
}
