package _concept.IOASSIGNMENT;

import java.io.Serializable;

class Customer implements Serializable {
     private int id;
     private String name;
     private int age;
    transient private String contact;

    Customer(int id,String name, int age, String contact) {
    this.id=id;
    this.name=name;
    this.age=age;
    this.contact=contact;
    }
    public int getId(){
        return id;
    }
    public String getName()
    {
        return name;
    } 
    public int getage()
    {
        return age;
    }
    public String getcontact()
    {
        return contact;
    }
}


