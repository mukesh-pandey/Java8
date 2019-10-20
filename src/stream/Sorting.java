package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    public  static  void main (String args[]) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Ram",3));
        employeeList.add(new Employee("Ram2",0));
        employeeList.add(new Employee("Ram1",0));

        Comparator<Employee> compareByName = Comparator.comparing(x->x.getName());

        Comparator<Employee> compareByAge = Comparator.comparing(x->x.getAge());

        Comparator<Employee> compareByAgeAndName = compareByAge.thenComparing(compareByName);

        employeeList = employeeList.stream().sorted(compareByAgeAndName).collect(Collectors.toList());
        System.out.println(employeeList);
    }

}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
