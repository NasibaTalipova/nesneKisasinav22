import java.lang.String;
import java.util.ArrayList;
import java.util.List;
// Sınıf tanımlamalar
public  class EvSahibi  {
    //tanımlamalar
    private String ad;
    private String soyAd;
    private Bina bina;
    private List<Daire>mevcutDaireler;


    //Constructor olusturulur
    EvSahibi(String ad, String soyAd, Bina bina){
        this.setAd(ad);
        this.setSoyAd(soyAd);
        this.setBina(bina);
        this.setMevcutDaireler(new ArrayList<>());
    }

    //Ev sahibi aynı binada birden fazla daire sahip olabilir
    public void daireEkle(Daire daire)
    {
        if(daire.compareTo(daire)>=0){
            getMevcutDaireler().add(daire);
            System.out.println("Daire Ev Sahibine eklendi.");

        }
        else {
            System.out.println("Daire bulunamadi!");
        }

    }
    //Fonksiyon
    public void displayInfo(){
        System.out.println(" --------");
        System.out.println("Ev sahibi :"+getAd()+" "+getSoyAd()+"\tBina bilgileri: "+ getBina().adress+" 'de bulunan "+ getBina().getnumberOfFloors()+" katlı bir binadir.");
        System.out.println(" --------");
    }
    // Kapsulleme yapilir
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public Bina getBina() {
        return bina;
    }

    public void setBina(Bina bina) {
        this.bina = bina;
    }

    public List<Daire> getMevcutDaireler() {
        return mevcutDaireler;
    }

    public void setMevcutDaireler(List<Daire> mevcutDaireler) {
        this.mevcutDaireler = mevcutDaireler;
    }
}
