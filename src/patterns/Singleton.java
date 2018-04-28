package patterns;
// Пример реализации шаблона Singleton

public class Singleton {

    private static Singleton instance;

    public static Singleton getInstance() { //при использовани в потоке необходимо добавить synchronized
        if (instance != null) {
            instance = new Singleton();
        }
        return instance;
    }

    private Singleton() {
    }

    public void print() {
        System.out.println(this);
    }
}
