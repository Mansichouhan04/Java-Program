package _concept.Exception_handling;

 class Outer2 {
    private int a=10,b=20;
    class Inner{
        int a=100,b=200;
        void add(int a, int b){
            System.out.println(a+b);
            System.out.println(this.a+this.b);
            System.out.println(Outer2.this.a+Outer2.this.b);
        }
    }
    public static void main(String[] args) {
        Outer2 o=new Outer2();
        Outer2.Inner i=o.new Inner();
        i.add(1000,2000);
        //new Outer2().new Inner().add(1000,2000);
    }
    
}
