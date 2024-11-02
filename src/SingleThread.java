public class SingleThread {

    public static void main(String[] args) {

        Thread thread = Thread.currentThread();
        thread.setName("my thread");
        thread.setPriority(5);

        System.out.println(thread + ". Name: " + thread.getName() + ". Priority: " + thread.getPriority());

    }
}
