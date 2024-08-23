package _concept;
 class Flower{
    String name;
    int price;
    int Nof;
    Flower(String name, int price,int Nof){
        this.name=name;
        this.price=price;
        this.Nof=Nof;
    }
    public void showdata1(){
        System.out.println("NAME:"+name);
        System.out.println("PRICE:"+price);
        System.out.println("NO OF FLOWER:"+Nof);
}
    public static void main(String[]args){
        Flower f1=new Flower("ROSE",10,150);
        Flower f2=new Flower("Lilly",5,100);
        Flower f3=new Flower("CHAMELI",8,50);
        f1.showdata1();
        f2.showdata1();
        f3.showdata1();
     }
}

