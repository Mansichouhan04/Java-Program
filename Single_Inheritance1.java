package _concept.IQ;

 class Appliance {
    String brand;
    String model;
    Appliance(String brand,String model)
    {
        this.brand=brand;
        this.model=model;
    }
    void turnOn()
        {
            System.out.println("Appliance is turning on.");
        }
    void turnOff()
    {
        System.out.println("Appliance is turning off.");
    }
}
class Refrigerator extends Appliance{
    int temprature;
    Refrigerator(String brand,String model,int temprature)
    {
        super(brand,model);
        this.temprature=temprature;
    }
    void setTemparature(int temprature)
    {
        this.temprature=temprature;
        System.out.println("Refrigerator is cooling to" +temprature);
    }
}
class Main{
    public static void main(String[] args) {
        Appliance app=new Appliance("BrandX","ModelY");
        Refrigerator rf=new Refrigerator("BrandA", "ModelB", 4);
        app.turnOn();
        app.turnOff();

        rf.turnOn();
        rf.setTemparature(3);
        rf.turnOff();
    }
}