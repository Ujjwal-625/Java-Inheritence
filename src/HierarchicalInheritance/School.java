package HierarchicalInheritance;

class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void displayRole(){
        System.out.println(this.getClass().getSimpleName());
    }
}

class Teacher extends Person{
    String subject;
    Teacher(String name,int age,String subject){
        super(name,age);
        this.subject=subject;
    }
}

class Student extends Person{
    char grade;
    Student(String name,int age,char grade){
        super(name,age);
        this.grade=grade;
    }
}

class Staff extends Person{
    int salary ,floor;
    Staff(String name,int age,int salary,int floor){
        super(name,age);
        this.floor=floor;
        this.salary=salary;
    }
}

public class School {
    public static void main(String[] args) {
        Teacher t=new Teacher("abc",45,"English");
        Student s=new Student("AbC",15,'A');
        Staff s1=new Staff("klfdsj",30,19900,2);
        t.displayRole();
        s.displayRole();
        s1.displayRole();
    }
}
