package _concept.Exception_handling;
class Outer8 {
    void m1(){
         class Inner1{
            void software(){
                System.out.println("Software class");
            }
            }
            class  Inner2 extends Inner1{
                void programming(){
                    System.out.println("Java Programming");
                }
            }
            Inner2 i=new Inner2();
                i.programming();
                i.software();
        }
        
        public static void main(String[]args)
        {
            Outer8 obj=new Outer8();
            obj.m1();
        }
}
