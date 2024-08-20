package _concept;
class Student{
    String name;
    int age;
    Student(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void showdata(){
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[]args){
        Student s1=new Student("Mansi", 21);
        Student s2=new Student("Deepu", 23);
        Student s3=new Student("Isha", 25);
        Student s4=new Student("Chinu", 22);
        Student s5=new Student("Yuvika", 21);
        s1.showdata();
        s2.showdata();
        s3.showdata();
        s4.showdata();
        s5.showdata();
    }
}
