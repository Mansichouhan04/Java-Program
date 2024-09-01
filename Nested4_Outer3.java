package _concept.Exception_handling;

class Outer3 {
    class Inner{
        //static declaration is not allowed in Inner class.
        //static variable,main method static block not allowed. 
        //Modifier static is only allowed in constant(Fianl) variable declaration.
        final static int a=10;
    }   
}
