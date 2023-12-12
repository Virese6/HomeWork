package HW1212;

public class DaughterClass extends ParentClass {
    int age;
    String profession;

    public DaughterClass(String name, int age, String profession){
        super(name);
        this.age = age;
        this.profession = profession;
        System.out.println(name + " is " + age + " years old.");
        System.out.println(name + " is a " + profession);
    }
}
