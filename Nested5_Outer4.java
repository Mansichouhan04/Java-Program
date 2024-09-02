package _concept.Exception_handling;
 class Outer4 {
    Outer4(){
        System.out.println("Outer class constructor");
    }
    {
        System.out.println("Outer class Instance block");
    }
    static{
        System.out.println("Outer class static block");
    }
    class Inner{
        Inner(){
            System.out.println("Inner class constructor");
        }
        {
            System.out.println("Inner class instance block");
        }
    }
    public static void main(String[] args) {
        new Outer4().new Inner();
    }
}
