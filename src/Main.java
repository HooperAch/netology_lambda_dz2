//������� 1. ������ 2. ��������

public class Main {

    public static void main(String[] args) {

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener listenerEr = System.out::println;


        Worker worker = new Worker(listener,listenerEr);
        worker.start();

    }
}