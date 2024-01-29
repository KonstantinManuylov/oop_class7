package ru.geekbrains.oop.lesson7.observer;

public interface Publisher {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    void sendOffer(String companyName, String position, int salary);
}
