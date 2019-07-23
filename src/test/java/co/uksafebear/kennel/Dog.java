package co.uksafebear.kennel;

public class Dog {

    private static int age;
    private String breed;
    private double weight;

    public void setBreed(String newBreed) {
        breed = newBreed;
    }

    public String getBreed(){
        return breed;
    }

    public void bark(){
        System.out.println("bark");

    }

    public static void setAge(int newAge){
        age = newAge;
    }

    public static int getAge(){
        return age;
    }
}
