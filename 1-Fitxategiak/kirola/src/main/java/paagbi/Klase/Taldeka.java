package paagbi.Klase;

public class Taldeka extends Kirol {
    private String material;
    private int taldekide_kp;

    //eraikitzailea
    public Taldeka() {}

    //setters
    public void setMaterial(String ma) {
        material= ma;
    }
    public void setKop (int kp) {
        taldekide_kp= kp;
    }

    //getters
    public String getMaterial () {
        return material;
    }
    public int getKop() {
        return taldekide_kp;
    }
}