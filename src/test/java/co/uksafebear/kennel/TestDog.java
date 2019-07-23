package co.uksafebear.kennel;

import org.junit.Test;

public class TestDog {

    @Test
    public void testDogs() {

        Dog pippin = new Dog();
        Dog fido = new Dog();
        Dog rex = new Dog();
        Dog max = new Dog();

        pippin.setBreed("border collie");
        fido.setBreed("pug");
        rex.setBreed("rottweiller");
        max.setBreed("golden retriever");

        Dog.setAge(5);

        System.out.println("Pippin's breed is " + pippin.getBreed());
        System.out.println("Fido's breed is " + fido.getBreed());
        System.out.println("Pippin is " + Dog.getAge() + " years old");

        pippin.bark();
    }
}
