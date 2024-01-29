package ru.geekbrains.oop.lesson7.observer;

public class Master implements Observer {
    private String name;
    Vacancy vacancy;
    private int salary;

    public Master(String name, Vacancy vacancy) {
        this.name = name;
        this.vacancy = vacancy;
        this.salary = 80000;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy position, int salary) {
        if (vacancy.equals(position)){
            System.out.println("Эта позиция в пределах моих скиллов!");
            if (this.salary <= salary) {
                System.out.printf("Мастер %s: Мне нужна эта работа! Компания: %s; заработная плата: %d\n",
                        name, nameCompany, salary);
                System.out.println("=".repeat(60));
                this.salary = salary;
            } else {
                System.out.printf("Мастер %s: Я найду работу плоучше! Компания %s; заработная плата %d\n",
                        name, nameCompany, salary);
                System.out.println("=".repeat(60));
            }
        }
    }

    public boolean getVacancy(String position) {
        return true;
    }
}
