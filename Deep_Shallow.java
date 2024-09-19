public class Deep_Shallow {
    public static void main(String[] args) {
      A a1=new A(100,50);
      A a2=a1;  
    }
    
}
class A{
    int i;
    int j;
    A(int i,int j)
    {
    this.i=i;
    this.j=j;
    }
}
