public class Worker {


    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public Worker(OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 3) {
                errorCallback.onError("ERORR! Task " + i);
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }

    }
}
