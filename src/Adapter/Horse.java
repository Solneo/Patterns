package Adapter;

public class Horse implements Animal {

    @Override
    public void move() {
        System.out.println("Лошадь скачет");
    }
}
