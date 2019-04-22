package objects-classes;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

-classes;

/**
 * Shows the structure of a class
 * @author Andres Ceballos Sanchez - andresrxn10@hotmail.com
 * @version 1.0
 * @since 2019/04/09
 */
//Class declaration must use the keyword class followed by a class name
public class MyClass {

    /* Fields: represents the object state*/
    String color;
    int age;

    /* Constructor class */
    public MyClass() {
        // Its declaration use the same name as the class and it has no return type
    }

    /* Methods: represents the object behavior*/
    public void methodA(){};
    public void methodB(){};
    
    /**
     * Entry point to the application
     */
    public static void main(String[] args) {

        /* Simply declaring a reference variable does not create an object. */
        MyClass declaredVariable;

        /* Ways to create object of a class*/

        //Using new keyword
        MyClass myClassNew = new MyClass();

        //Using Class.forName method
        MyClass myClassInstance = (MyClass) Class.forName("com.test.MyClass").newInstance();

        //Using clone
        MyClass myClassClone = (MyClass) myClassNew.clone();

        //Deserialization
        String filename = "filename";
        FileInputStream file = new FileInputStream(filename);
        ObjectInputStream in = new ObjectInputStream(file);
        MyClass myClassDeserialization = (MyClass) in.readObject();


        /* Multiple objects of the same type*/
        //Not so good
        Cat cat = new Cat();
        Dog dog = new Dog();

        //Better this solution
        Animal animal = new Cat();
        animal = new Dog();

        /* Anonymous object: it has no reference */
        new MyClass().methodA(); //Calling a method through an anonymous object
    }
}

class Animal {}

class Dog extends Animal {}
class Cat extends Animal {}