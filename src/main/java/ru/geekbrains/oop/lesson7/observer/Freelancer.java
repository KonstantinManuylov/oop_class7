package ru.geekbrains.oop.lesson7.observer;

public class Freelancer implements Observer {
    private String name;
    Vacancy vacancy;
    private int salary;

    public Freelancer(String name, Vacancy vacancy) {
        this.name = name;
        this.vacancy = vacancy;
        this.salary = 4000;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy position, int salary) {
        if (vacancy.equals(position)){
            System.out.println("Эта позиция в пределах моих скиллов!");
            if (this.salary <= salary) {
                System.out.printf("Фрилансер %s: Мне нужна эта работа! Компания: %s; заработная плата: %d\n",
                        name, nameCompany, salary);
                this.salary = salary;
                System.out.println("=".repeat(60));
            } else {
                System.out.printf("Фрилансер %s: Я найду работу плоучше! Компания %s; заработная плата %d\n",
                        name, nameCompany, salary);
                System.out.println("=".repeat(60));
            }
        }
    }

    @Override
    public boolean getVacancy(String position) {
        return true;
    }
}
