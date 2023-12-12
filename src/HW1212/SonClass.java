package HW1212;

public class SonClass extends ParentClass{
    int age = 12;

    public SonClass(String name, int age){
        super(name);
        this.age = age;
        System.out.println(name + " is " + age + " years old.");

    }
}
