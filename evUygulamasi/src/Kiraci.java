//Kiraci class'i olusturuldu
public class Kiraci {
    //tanımlamalar
    private String adi;
    private String soyadi;
    private EvSahibi evSahibi;
    //Yapic metot kullanildi
    Kiraci(String adi, String soyadi, EvSahibi evSahibi) {
        this.setAdi(adi);
        this.setSoyadi(soyadi);
        this.setEvSahibi(evSahibi);
    }
    // Fonsiyon islem
    public void displayInfo(){
        System.out.println("Kiraci adi: "+adi+" "+soyadi+"\tEv Sahibi: "+evSahibi.getAd()+" "+evSahibi.getSoyAd());
    }
    //Kapsulleme islemi
    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public EvSahibi getEvSahibi() {
        return evSahibi;
    }

    public void setEvSahibi(EvSahibi evSahibi) {
        this.evSahibi = evSahibi;
    }
}
