public class ClassB extends ClassA {
    public ClassB() {
        System.out.println("ClassB constructor");
    }

    public ClassB(String word) { System.out.println("ClassB word constructor"); }
    public String getName(){
        return "Class B";
    }
}
// Instance variables and other methods not shown}