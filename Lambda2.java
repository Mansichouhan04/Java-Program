package _concept.Mutithreading;
@FunctionalInterface
interface Lambda2 {
    int calculate(int x);    
}
class A{
    public static void main(String[] args) {
        int y=10;
        Lambda2 lm=(int x)->x*x;
        System.out.println(lm.calculate(y));
    }
}