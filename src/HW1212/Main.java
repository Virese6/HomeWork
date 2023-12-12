package HW1212;

public class Main {
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass("John");
        parentClass.myName();
        SonClass sonClass = new SonClass("Bill",21);
        DaughterClass daughterClass = new DaughterClass("Kate",15,"Pupil");

    }


}
