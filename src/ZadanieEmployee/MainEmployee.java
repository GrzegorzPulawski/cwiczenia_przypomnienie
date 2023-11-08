package ZadanieEmployee;


import java.util.Objects;
import java.util.stream.Collectors;


public class MainEmployee {
    public static void main(String[] args) {
        //stworz instance pracownika
        Employee employee1 = new Employee(1,"Grzegorz", 31000.00);
        Employee employee2 = new Employee(2, "Marcin", 9000.00);
        Employee employee3 = new Employee(3, "Radek", 6000.00);
        //dodaj pracownika
        Employee.dodajPracownika(employee1);
        Employee.dodajPracownika(employee2);
        Employee.dodajPracownika(employee3);
        //drukuj liste
        System.out.println(Employee.lista);
        //wyszukaj pracownika z pensja powyzej 30000 lub wyrzuc blad
        Employee employee =  Employee.lista.stream()
                .filter(Objects::nonNull)
                .filter(s -> s.getSalary() > 30000)
                 .findFirst()
                 .orElseThrow(() -> new RuntimeException("Nie znaleziono"));
        //wydrukuj dane znalezionego pracownika
        System.out.println(employee);

    }
}
