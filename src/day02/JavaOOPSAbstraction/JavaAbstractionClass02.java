package day02.JavaOOPSAbstraction;

// here we will implement complex abstraction
// parent abstract ---extends---> child01 (abstract) ---- extends ---> child02
// we can declare class as abstract without abstract methods
// but when we use abstract methods , then the class should be abstract

abstract class HeadQuarters {
    private String hqName;

    public HeadQuarters(String name){
        this.hqName=name;
    }

    abstract void checkingAccess();

    public void getSecurityStatus() {
        System.out.println(hqName+" is fully protected and doors are sealed");
    }
}

abstract class subQuarters extends HeadQuarters {

    private String sqName;
    public subQuarters(String hQName,String sqName){
        super(hQName);
        this.sqName=sqName;
    }

    public void getSQStatus() {
        System.out.println(sqName+" is fully defensive");
    }

}

class AI extends subQuarters {
    private String agentName;
    public AI(String hQName,String sqName,String agentName){
        super(hQName,sqName);
        this.agentName=agentName;
    }
    public void getStatus() {
        System.out.println("Details Reported by "+agentName);
    }

    @Override
    void checkingAccess() {
        System.out.println("Checking Access...");
    }
}

public class JavaAbstractionClass02 {
    public static void main(String[] args) {
        AI EDITH = new AI("S.H.I.E.L.D","A.V.E.N.G.E.R.S","SUNGWOO");
        EDITH.checkingAccess();
        EDITH.getSecurityStatus();
        EDITH.getSQStatus();
        EDITH.getStatus();
    }
}
