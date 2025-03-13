public class Animal {
    String name;
    int age;

    Animal(String name,int age){
        this.name=name;
        this.age=age;
    }

    void makeSound(){

    }

    public static void main(String[] args) {
        Cat c=new Cat("kitten",12);
        Dog d=new Dog("pluto",10);
        Bird b=new Bird("lily",2);

        c.makeSound();
        d.makeSound();
        b.makeSound();
    }
}

class Cat extends Animal{

    Cat(String name,int age){
        super(name,age);
    }
    void makeSound(){
        System.out.println("meow");
    }
}

class Dog extends Animal{

    Dog(String name,int age){
        super(name,age);
    }
    void makeSound(){
        System.out.println("bark");
    }
}class Bird extends Animal{

    Bird(String name,int age){
        super(name,age);
    }
    void makeSound(){
        System.out.println("chirp");
    }
}
