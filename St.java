package _concept;
public class St{
    static String institute="Infobeans";
    int id;
    String name;
    St(int id,String name){
        this.id=id;
        this.name=name;
    }
    void show(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(institute);
    }
    public static void main(String[] args) {
        St stud= new St(101, "Mansi");
        St. institute="Foundation";
        stud.show();
    }
}
