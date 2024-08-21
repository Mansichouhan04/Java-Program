package _concept.Mutithreading;
/**
 * Functional_interface1
 */
@FunctionalInterface
public interface Functional_interface1 {
   public void showdata();
}
class Functional_interface2 implements Functional_interface1{
    public void showdata(){
        System.out.println("This is a functional interface");
    }
}
class Main{
    public static void main(String[] args) {
        Functional_interface1 f2=new Functional_interface2();
        f2.showdata();
      
    }
}
