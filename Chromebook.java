//author Robin Dupuis
public class Chromebook extends Computer {
    private int ram;
    private int storage;
    private int usedStorage;

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setUsedStorage(int usedStorage) {
        this.usedStorage = usedStorage;
    }
     @Override
   public void On(){
        System.out.println("This Chromebook computer is turned on");
   }
    @Override
    public void Off(){
        System.out.println("This Chromebook computer is turned off");
    }
    
    public void getAll(){
        int storageLeft = storage-usedStorage;
        System.out.println("This chromebook has "+ram+"Gb of ram "+"it also has "+storage+"Gb of storage but "+usedStorage+"Gb is used meaning only "+ storageLeft +"Gb is available.");
        super.On();
    }
}
