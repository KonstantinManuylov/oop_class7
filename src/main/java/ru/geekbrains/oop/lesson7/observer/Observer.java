package ru.geekbrains.oop.lesson7.observer;

public interface Observer {

    void receiveOffer(String nameCompany, Vacancy position, int salary);
    boolean getVacancy(String position);
}
