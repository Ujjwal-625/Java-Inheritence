package SingleInheritence;

class Book{
    String title;
    int yearOfPublication;

    Book(String title,int yearOfPublication){
        this.title=title;
        this.yearOfPublication=yearOfPublication;
    }
}
class Author extends  Book{
    String name;
    String bio;

    Author(String name,String bio,String title,int yearOfPublication){
        super(title,yearOfPublication);
        this.name=name;
        this.bio=bio;
    }

    void showDetails(){
        System.out.println("Name : "+name);
        System.out.println("bio : "+bio);
        System.out.println("title : "+title);
        System.out.println("Year of Publication : "+yearOfPublication);
    }
}

public class Library {

    public static void main(String[] args) {
        Author a=new Author("dfjklsj","jkdfdsklfjl","dfkldsjfkl",2016);
        a.showDetails();
    }
}
