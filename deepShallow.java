import java.util.ArrayList;

public class deepShallow {
    public static void main(String[] args) 
    {
        ArrayList<Integer>l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.println("original list="+l1);
        //deep copy
        ArrayList l2=new ArrayList(l1);
        l2.add(41);
        System.out.println("deep copy="+l2);
        //shallow copy
        ArrayList l3=(ArrayList) l1;
        l3.add(51);
        l3.add(61);
        System.out.println("Shallow copy="+l3);
        System.out.println("Original copy="+l1);
    }
}
