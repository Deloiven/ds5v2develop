package philosophers;

public class Main {
    public static void main(String[] args) {
        new Philosophers(new String[]{"Пифагор", "Платон", "Сократ", "Цицерон", "Кант"}, 600, 10, 3).beg();
    }
}