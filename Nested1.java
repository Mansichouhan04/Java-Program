package _concept.Exception_handling;

 class Outer {
    int a=100;
    int b=200;
    void m1(){
        System.out.println("Outer class here");
    }
class Inner{
    int x=140;
    int y=200;
    void m2(){
        System.out.println("Inner class here");
    }
}    
}
class Test{
    public static void main(String[] args) {
        Outer o=new Outer();
        Outer. Inner i=o.new Inner();
        o.m1();
        i.m2();
    
    }
}
