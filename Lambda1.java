package _concept.Mutithreading;
@FunctionalInterface
interface MathOperation{
    int operate(int a,int b);
}
class LambdaMath {
    public static int operate(int a, int b,MathOperation operation)
    {
        return operation.operate(a, b);
    }
    public static void main(String[] args) {
        //Lambda expression for addition
        MathOperation add=(a,b)->a+b;
        //Lambda expression for substraction
        MathOperation substraction=(a,b)->a-b;
       //perform  addition 
        System.out.println("5+3="+operate(5,3,add));
        //perform substraction
        System.out.println("5-3="+operate(5, 3, substraction));
    }
}
    
    

