package paagbi.Klase;

public class Banaka extends Kirol {
    private String instalazio;
    private String emaitza_mota;

    //Eraikitzailea
    public Banaka () {}

    //Setters
    public void setInstalazio(String in) {
        instalazio= in;
    }
    public void setEmaitz(String em) {
        emaitza_mota= em;
    }

    //getters
    public String getInstalazio () {
        return instalazio;
    }
    public String getEmaitz () {
        return emaitza_mota;
    }
}
