package day02.JavaClassAndObjectRecap;

public class JavaObject02 {
    public static void main(String[] args) {
        //here refer JavaClass01 as TV
        //e.g., TV sonieTV = new TV();
        JavaClass01 SonieTV = new JavaClass01("SonieTV"); // sonie company creates their TV with class
        JavaClass01 SmSungTV = new JavaClass01("SmSUngTV"); // "" ""
        JavaClass01 em_ITV = new JavaClass01("Emm_ITV"); // "" "


        //now you can use all 3 company TVs.
        System.out.println("\nswitchig to HD mode in sonie");
        SonieTV.switchToHD("FHD","1080*720");

        System.out.println("\nusing gesture mode in smsung");
        SmSungTV.useGestureControl("smSungmotion","smSungIR");

    }
}
