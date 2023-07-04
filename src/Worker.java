public class Worker {
    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }
    private OnTaskDoneListener callback;

    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }
    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i!=33) {
                callback.onDone("Task " + i + " is done");
            }
        }
    }

    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String result);

    }
    private OnTaskErrorListener errorCallback;
    public Worker(OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
    }
    public void stop() {
        for (int i = 33; i < 34; i++) {
            errorCallback.onError("Task " + i + " is error");
        }
    }

}
