package _concept.IQ;
class House{
    public void color()
    {
        System.out.println("House color is pitch");
    }
    public void shape()
    {
        System.out.println("the house shape is square");
    }
}
class Rooms extends House{
   public void details(){
    System.out.println("there are 20 rooms");
   }
}
class Furniture extends Rooms{
    public void wood()
    {
        System.out.println("the wood is pure");
    }
}
class Main4{
    public static void main(String[] args) {
        Furniture f=new Furniture();
        f.color();
        f.details();
        f.shape();
        f.wood();
    }
}