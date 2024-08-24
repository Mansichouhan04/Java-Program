package _concept;
abstract class School {
    public abstract void go();
  //  public void study(){
//System.out.println("Student is study");

//}
}
 class Student5 extends School{
    public void go(){
        System.out.println("Student is going to school");
    }
}
class Demo{
        public static void main(String[] args) {
        Student5 s=new Student5();
        s.go();
        //s.study();
}
 }