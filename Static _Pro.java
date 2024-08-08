class Student10{
    static String institute="Infobeans";
    int id;
    String name;
    Student10(int id,String name){
        this.id=id;
        this.name=name;
    }
    void show(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(institute);
    }
    public static void main(String[] args) {
        Student10 stud= new Student10(101, "Mansi");
        Student10. institute="Foundation";
        stud.show();
    }
}