public class Laptop implements Device {

    //public Laptop(String screenSize, String storage){
        //super(screenSize,storage);
    //}
@Override 
    public void TurnOn(){
        System.out.print("Laptop turned on.\n\nScreen Size: "+"14x17in"+"\nStorage: "+"1TB"+"\n\n");
    }

}
