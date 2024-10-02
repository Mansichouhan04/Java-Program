 class Animal5{
    void eat(){
        System.out.println("Eating....");
    }
    void sleep()
    {
        System.out.println("Sleeping....");
    }
}
class Cat5 extends Animal5{
    void mehow(){
        System.out.println("cat is mehow");
    }
}
class Dog5 extends Animal5{
    void bark(){
        System.out.println("dog is Barking");
    }
}
class Kitten extends Cat5{
    void cute(){
        System.out.println("Kitten is cute");
    }
}
class BabyDog extends Dog5{
    void weep(){
        System.out.println("Baby dog is weeping");
    }
}
class Main2{
    public static void main(String[] args) {
        Cat5 c=new Cat5();
        Dog5 d=new Dog5();
        Kitten k=new Kitten();
        BabyDog bd=new BabyDog();
        c.eat();
        c.sleep();
        c.mehow();
        d.eat();
        d.sleep();
        d.bark();
        k.eat();
        k.sleep();
        k.cute();
        bd.eat();
        bd.sleep();
        bd.weep();
        bd.eat();
        bd.sleep();
    }
}