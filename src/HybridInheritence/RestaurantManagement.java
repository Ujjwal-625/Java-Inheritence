package HybridInheritence;

class Person {
    private String name;
    private int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getter and Setter methods for name and id
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

 interface Worker {
    void performDuties();  // Abstract method to be implemented by subclasses
}



 class Chef extends Person implements Worker {

    // Constructor
    public Chef(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println(getName() + " is cooking food.");
    }
}

class Waiter extends Person implements Worker {

    // Constructor
    public Waiter(String name, int id) {
        super(name, id);
    }


    public void performDuties() {
        System.out.println(getName() + " is serving food to customers.");
    }
}



public class RestaurantManagement {
    public static void main(String[] args) {
        Chef chef = new Chef("John", 101);
        Waiter waiter = new Waiter("Emily", 102);

        // Display information
        System.out.println(chef); // Calls Person's toString() method
        chef.performDuties(); // Chef performs duties

        System.out.println(waiter); // Calls Person's toString() method
        waiter.performDuties();
    }
}
