package ConstructorPerson;

import java.util.Objects;

public class Pensioner extends Person { // екстенс обозначает расширение класса Персон
    private double pension;


    public Pensioner(String name, int age, double height, double weight, int money, double pension) {
        super(name, age, height, weight, money);// супер -это конструктор Персон
        this.pension = pension;


    }

    public double getPension() {
        return pension;

    }
//    public void setPension(double pension) {
//        this.pension = pension;
//    }


    @Override
    public void die() {
        double calculatedPension = (getAge() - 50) * pension;
        System.out.println("Этот пенсионер умер, он заработал: " + calculatedPension);
    }

    @Override
    public void die(int years) {
        System.out.println("Этот пенсионер умрет через " + years + " лет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pensioner pensioner = (Pensioner) o;
        return Double.compare(pension, pensioner.pension) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pension);
    }

    @Override
    public String toString() {
        return "Pensioner{" +
                "pension=" + pension +
                '}';
    }
}

