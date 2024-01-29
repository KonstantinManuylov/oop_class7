package ru.geekbrains.oop.lesson7.observer;

/**
 *  TODO: Доработать приложение, которое разрабатывалось на семинаре,
 *  поработать с шаблоном проектирования Observer,
 *  добавить новый тип соискателя.
 *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
 *  Только после этого вы можете усложнить ваше приложение (при желании), например,
 *  добавить тип вакансии (enum),
 *  учитывать тип вакансии при отправке предложения соискателю.
 * @param args
 */


public class Program {
    public static void main(String[] args) {

        Publisher publisher = new JobAgency();
        Company google = new Company("Google", publisher, Vacancy.java_developer, 120000);
        Company yandex = new Company("Yandex", publisher, Vacancy.cSharp_developer, 95000);
        Company geekBrains = new Company("GeekBrains", publisher, Vacancy.plumber, 50000);
        Company krasnayaPolyana = new Company("Krasnaya Polyana", publisher, Vacancy.designer, 10000);

        Student student1 = new Student("Студент 1", Vacancy.java_developer);
        Master master1 = new Master("Master 1", Vacancy.teacher);
        Master master2 = new Master("Master 2", Vacancy.plumber);
        Freelancer freelancer1 = new Freelancer("Freelancer 1", Vacancy.designer);

        publisher.registerObserver(student1);
        publisher.registerObserver(master1);
        publisher.registerObserver(master2);
        publisher.registerObserver(freelancer1);

        for (int i = 0; i < 4; i++) {
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
            krasnayaPolyana.needEmployee();
        }

    }

}
