package ZadanieEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {
    //Utwórz klasę
    //Employee z polami id, name oraz salary . Utwórz niezbędne metody i
    //konstruktor. Utwórz 3 instancje klasy Employee i dodaj je do listy. Korzystając ze
    //strumieni, znajdź pierwszego pracownika, który nie jest null i ma pensję co najmniej
    //30000. Jeśli nie zostanie znaleziony, rzuć wyjątek.
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static List<Employee> lista = new ArrayList<>();

    public static void dodajPracownika(Employee employee) {

        lista.add(employee);
        System.out.println(employee);
    }
}

