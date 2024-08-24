package _concept;
abstract class Bike {
    int no_of_types;
    abstract  void start();
}
class Honda extends Bike{
    void start(){
        System.out.println("With key Bike start");
    }
    public static void main(String[]args){
        Honda h=new Honda();
        h.start();
    }
}

    

