package ru.geekbrains.oop.lesson7.observer;

import java.util.Random;

public class Company {
    private Random random = new Random();
    private Publisher jobAgency;
    private String name;
    Vacancy vacancy;
    private int maxSalary;

    public Company(String name, Publisher jobAgency, Vacancy vacancy, int maxSalary) {
        this.jobAgency = jobAgency;
        this.name = name;
        this.vacancy = vacancy;
        this.maxSalary = maxSalary;
    }

    public void needEmployee() {
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, String.valueOf(vacancy), salary);
    }
}
