package _concept.Exception_handling;
class Outer9 {
    void m1(){
        for(int i=0; i<=5; i++){
            class Inner{
                void display(){
                    System.out.println("Hello Infobeans");
                }
            }
            new Inner().display();
        }
    }
    public static void main(String[] args) {
        new Outer9().m1();
    }
}
