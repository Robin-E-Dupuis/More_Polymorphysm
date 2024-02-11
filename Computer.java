//author Robin Dupuis
public class Computer {
    
    public void On(){
        System.out.println("computer is turned on");
    }
    public void Off(){
        System.out.println("computer is turned off");
    }
    public static void main(String[] args) {
         Asus asus = new Asus();
    Acer acer = new Acer();
    Msi msi = new Msi();
    Chromebook chromebook = new Chromebook();
    
    asus.setRam(8);
    asus.setStorage(512);
    asus.setUsedStorage(253);
    asus.getAll();
    
    acer.setRam(16);
    acer.setScreenRefreshrate(60);
    acer.setStorage(250);
    acer.setUsedStorage(128);
    acer.getAll();
    
    msi.setRam(16);
    msi.setScreenResolution(120);
    msi.setStorage(1000);
    msi.setUsedStorage(500);
    msi.getAll();
    
    chromebook.setRam(4);
    chromebook.setStorage(100);
    chromebook.setUsedStorage(70);
    chromebook.getAll();
    
      Computer[] computers = {asus,acer,msi,chromebook};
      
        for (Computer x : computers)  {
            x.On();
        }
    }
   
}
