package ru.geekbrains.oop.lesson7.singleton;

public class Program {

    public static void main(String[] args) {

        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();
        Settings settings3 = Settings.getInstance();

        // Settings settings4 = new Settings();

    }

}
