
package computer;


public class Laptop extends Computer{
    
    private String type;
  //  private String brand; remove in LT6
    private double screenSize;
    private int memorySize;
    private Monitor monitor;
    
    public Laptop(String type, String brand, double screenSize ){
        super();
        this.type = type;
        this.screenSize = screenSize;
        memorySize = 8;
        monitor = new Monitor();
        
    }

    public void upgradeMemory(){
        setMemorySize(getMemorySize() + 8);
    }
    public void downgradeMemory(){
        setMemorySize(getMemorySize() - 4);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    
    @Override
        public double calculatePrice(){
        if (quantity <= 10)
        return price * quantity + 2460;
        else if (quantity >  10 && quantity <= 50)
             return price * quantity + 2260;
        else
            return price * quantity + 2160;
    }
}
