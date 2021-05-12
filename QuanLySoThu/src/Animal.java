
import java.util.Scanner;

public abstract class Animal {
    private String name;
    private int age;
    private String description;

    public Animal() {
    }

    public Animal(String name, int age, String description) {
        this.name = name;
        this.age = age;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void display() {
        System.out.println("name : " + name
                + "age : " + age + "description : " + description);
    }
    public void input(){

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter animal name : ");
        name = sc.nextLine();
        System.out.println("Enter animal age : ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter animal description : ");
        description = sc.nextLine();

    }
     public abstract void showSound();
}
