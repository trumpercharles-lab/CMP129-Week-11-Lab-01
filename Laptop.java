public class Laptop extends Device {

    public Laptop(String screenSize, String storage){
        super(screenSize,storage);
    }
@Override 
    public void TurnOn(){
        System.out.print("Laptop turned on.\n\nScreen Size: "+screenSize+"\nStorage: "+storage+"\n\n");
    }

}
