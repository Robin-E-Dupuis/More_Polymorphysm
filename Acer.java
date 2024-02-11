//author Robin Dupuis
public class Acer extends Computer{
    private int ram;
    private int storage;
    private int usedStorage;
    private int screenRefreshrate;

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setUsedStorage(int usedStorage) {
        this.usedStorage = usedStorage;
    }

    public void setScreenRefreshrate(int screenRefreshrate) {
        this.screenRefreshrate = screenRefreshrate;
    }
      @Override
   public void On(){
        System.out.println("This Acer computer is turned on");
   }
    @Override
    public void Off(){
        System.out.println("This Acer computer is turned off");
    }
    public void getAll(){
        System.out.println("This Acer computer has "+ram+"Gb of ram and "+storage+"Gb of storage but "+usedStorage+"Gb is used. The screen refresh rate is "+screenRefreshrate+"Hz.");
        super.Off();
    }
}
