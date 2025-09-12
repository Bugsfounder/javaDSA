package basicPograms.AccessModifiers;

public class Employee {
    int salary ;
    String name;

    int getSalary(){
        return salary;
    }

    String getName(){
        return name;
    }

    void setName(String name){
        this.name = name;
    }

    void setSalary(int salary){
        this.salary = salary;
    }

    public static void main(String[] args){
        Employee manisha = new Employee();
        manisha.setName("Manisha Kumar");
        manisha.setSalary(10);
        System.out.println(manisha.getName());
        System.out.println(manisha.getSalary());

    }
}
