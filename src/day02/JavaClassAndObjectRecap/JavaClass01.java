package day02.JavaClassAndObjectRecap;

// class is blueprint of the objects
//e.g if we say TV, then should have screen,speakers, video,audio playing functionalities.
//here refer JavaClass01 as "TV"

public class JavaClass01 { //public class TV

    //state or properties
    private String brand;
    private String motionCensor;
    private String IRCensor;
    private String wirelessCensor;
    private String speaker;
    private String networkDriver;
    private String screenResolution;
    private String screenType;

    //dynamic params
    public JavaClass01(String brand) {
        this.brand = brand;
        System.out.println(brand + " created");
    }

    //behaviors or members

    public void useGestureControl(String motionCensor,String IRCensor) {
        this.motionCensor = motionCensor;
        this.IRCensor = IRCensor;
        System.out.println("Loading "+ brand +" censors : "+this.motionCensor+" ,"+this.IRCensor+" ...");
        System.out.println("Enabling gesture control...");
        System.out.println("Gesture control activated! ");
    }

    public void useWirelessMode(String wirelessCensor,String networkDriver) {
        this.wirelessCensor = wirelessCensor;
        this.networkDriver = networkDriver;
        System.out.println("Loading "+brand+" censors : "+this.motionCensor+" ,"+this.IRCensor+" ...");
        System.out.println("Enabling wireless mode...");
        System.out.println("wireless mode enabled, waiting for device to connect ...");
    }

    public void switchToHD(String screenType, String screenResolution) {
        this.screenType = screenType;
        this.screenResolution = screenResolution;
        System.out.println("configuring "+brand+" hardware : "+this.screenType+" ,"+this.screenResolution+" ...");
        System.out.println("activating HD...");
        System.out.println("switched to HD...");
    }

}
