public class Smartphone extends Device {
    
    public Smartphone(String screenSize, String storage){
        super(screenSize,storage);
    }
@Override 
    public void TurnOn(){
        System.out.print("Smartphone now on.\n\nScreen Size: "+screenSize+"\nStorage: "+storage+"\n\n");
    }

}
