package HW1212;

public class ParentClass {
    String name;

    ParentClass(String name){
        this.name = name;
        System.out.println("This is a " + name);
    }
    public void myName(){
        System.out.println("I'm a parent of this kids");
    }

}
