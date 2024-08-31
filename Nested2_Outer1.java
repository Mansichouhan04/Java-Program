package _concept.Exception_handling;

 class Outer1 {
    private int a=10, b=20;
    class Inner{
        int x=100,y=200;
        void add(int i, int j){
            System.out.println(i+j);
            System.out.println(x+y);
            System.out.println(a+b);
        }
    }
    public static void main(String[]args){
        //Outer1 o=new Outer1();
       // Outer1.Inner i=o.new Inner();
       // i.add(1000,300);
       new Outer1().new Inner().add(1000,2000);
    }
}
