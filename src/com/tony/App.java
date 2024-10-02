package src.com.tony;

public class App implements Runnable{
    public static void main(String[] args) {
        System.out.println("hello");
    }

    @Override
    public void run() {
        System.out.println("hello world");

    }
}
