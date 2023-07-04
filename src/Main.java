public class Main {
    public static void main (String[] ages) {
        Worker.OnTaskDoneListener listener = System.out::println;

        Worker worker = new Worker(listener);
        worker.start();


        Worker.OnTaskErrorListener listener2 = System.out::println;
        Worker work = new Worker(listener2);
        work.stop();
    }
}
