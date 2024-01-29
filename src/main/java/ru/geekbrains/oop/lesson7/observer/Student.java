package ru.geekbrains.oop.lesson7.observer;

public class Student implements Observer {
    private String name;
    private int salary;
    Vacancy vacancy;

    public Student(String name, Vacancy vacancy) {
        this.name = name;
        this.vacancy = vacancy;
        this.salary = 5000;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy position, int salary) {
        if (position.equals(vacancy)){
            System.out.println("Эта позиция в пределах моих скиллов!");
            if (this.salary <= salary) {
                System.out.printf("Студент %s: Мне нужна эта работа! Компания: %s; заработная плата: %d\n",
                        name, nameCompany, salary);
                this.salary = salary;
                System.out.println("=".repeat(60));
            } else {
                System.out.printf("Студент %s: Я найду работу плоучше! Компания %s; заработная плата %d\n",
                        name, nameCompany, salary);
                System.out.println("=".repeat(60));
            }
        }
    }

    public boolean getVacancy(String position) {
        return true;
    }
}
