//1 уровень сложности: 1)Создать класс Person.

//2) В нем добавить такие поля:

//    а) Имя человека (выбрать самостоятельно тип данных)
//    б) Возраст человека (выбрать самостоятельно тип данных)
//    в) Рост (выбрать самостоятельно тип данных)
//    г) Вес (выбрать самостоятельно тип данных)данных

//3) Добавить конструктор. Можно конструктор сгенерировать, но лучше написать самому

//4) Добавить методы:
//    a) Инфо о человеке. Печатает информацию о человеке - сколько лет, его имя рост и все.
//    б) Идти на работу. Если возраст меньше 18 или больше 70, то пишет "отдыхаю дома", иначе "работаю"

//            5) Создать несколько объектов и заполнить их

//    Доп. задание:

//            6) Добавить поле "money" и создать метод getMoney, который делает return money (То есть просто возвращает количество денег у человека). Мы это тему еще не проходили, поэтому подсказки в личные сообщения просите спокойно.
//            7) перед int money переменной поставить ключевое слово private. Описать, чт
package ConstructorPerson;


import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private double height;
    private double weight;
    private int money;
    private int years;
    private Gender gender;


    public Person(String name, int age, double height, double weight, int money) {
        //конструктор класса Персон
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.money = money;

    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " age");
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Money: " + money + " euro");
    }

    public void goToWork() {
        if (age < 18 || age > 70) {
            System.out.println("Relaxing home");

        } else System.out.println("Working");


    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;

    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;

    }

    public void setWeight(int weight) {
        this.weight = weight;

    }

    public int getMoney() {
        return money;

    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    //        @Override

    public abstract void die(int years);

    public void die() {
        System.out.println("Человек погиб");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(height, person.height) == 0 && Double.compare(weight, person.weight) == 0 && money == person.money && years == person.years && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height, weight, money, years);
    }

    @Override
    public String toString() {
        return "Person{" +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", money=" + money +
                ", gender=" + gender +
                "}";
    }
}












/*
1 уровень сложности: 1)Создать класс Person.

2) В нем добавить такие поля:


а) Имя человека (выбрать самостоятельно тип данных)
б) Возраст человека (выбрать самостоятельно тип данных)
в) Рост (выбрать самостоятельно тип данных)
г) Вес (выбрать самостоятельно тип данных)


3) Добавить конструктор. Можно конструктор сгенерировать, но лучше написать самому


4) Добавить методы:
a) Инфо о человеке. Печатает информацию о человеке - сколько лет, его имя рост и все.
б) Идти на работу. Если возраст меньше 18 или больше 70, то пишет "отдыхаю дома", иначе "работаю"


5) Создать несколько объектов и заполнить их


Доп. задание:


6) Добавить поле "money" и создать метод getMoney, который делает return money (То есть просто возвращает количество денег у человека). Мы это тему еще не проходили, поэтому подсказки в личные сообщения просите спокойно.


7) перед int money переменной поставить ключевое слово private. Описать, что произойдет в программе.


1) Создать классы Pensioner и Worker. Унаследовать их от класса Person.
В класс Pensioner добавить дробное поле pension (пенсия),
в класс Worker добавить два поля minSalary и maxSalary (минимальная и максимальная зарплата).


2) В класс Person добавляем метод die(), который ничего не возвращает, но пишет "Человек погиб".


3) В классе Worker переопределеяем этот метод (override) таким образом: пишем на экран сообщение "Этот человек не дожил до пенсии"


4) В классе Pensioner переопределяем так: пишем на экран "Этот пенсионер умер, он заработал: x".
Где вместо x нужно рассчитать значение по формуле "(age-50)*pension"



1 уровень сложности: 1) Создайте метод public void die(int years) в классе Person,
сделайте его абстрактным. Этот метод будет отличаться от обычного die() тем,
что человек будет умирать не сразу, а через некоторое количество лет (которые и будут передаваться в параметре метода).
Реализуйте этот метод для  Pensioner и Worker таким образом:

а) для Worker просто вывести на экран "Этот человек не доживет до пенсии и умрет через " + years + "лет"
б) Для Pensioner пишем на экран "Этот пенсионер умрет через" + years + "лет"


2) Все классы, которые созданы, снабжаем собственными реализациями методов equals, hashCode и toString


3) Добавить для класса Worker несколько конструкторов (перегрузка)


2 уровень сложности:


 1 уровень сложности: 1) Создайте класс-утилиту CalculatorUtils, в котором будет два статических метода с перегрузкой (overloading)

1) calculateAverage(int first, int second)
2) calculateAverage(int first, int second, int third)


Эти два метода должны считать среднее значение для двух и для трех введенных чисел соответственно.


2) Создайте интерфейс AbleToCalculatePension c единственным методом - расчетом пенсии double calculatePension(), реализуйте этот интерфейс в классе Worker.


Реализация в классе Worker:


У каждого Worker'а есть две переменных - максимальная и минимальная зарплата. Используйте метод из утилиты CalculatorUtils, чтобы найти среднее значение этих двух чисел.
После этого возьмите 25% от получившегося значения - это и будет полученная пенсия.


2 уровень сложности:

 */
