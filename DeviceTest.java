public class DeviceTest {
    
    public static void main(String args[]){
        Device newPhone=new Smartphone("6x7in","375GB");
        Device newLaptop=new Laptop("14x17in","1TB");

        newPhone.TurnOn();
        newLaptop.TurnOn();
    }

}
