//author Robin Dupuis
public class Msi extends Computer{
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

    public void setScreenResolution(int screenRefreshrate) {
        this.screenRefreshrate = screenRefreshrate;
    }
      @Override
   public void On(){
        System.out.println("This Msi computer is turned on");
   }
    @Override
    public void Off(){
        System.out.println("This Msi computer is turned off");
    }
    public void getAll(){
        System.out.println("This Msi computer has "+ram+"Gb of ram and "+storage+"Gb of storage but "+usedStorage+"Gb is used. The screen refresh rate is "+screenRefreshrate+"Hz.");
    }
}
