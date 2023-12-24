//Daire sinifi Konut sinifina extend edilir
//Comparable arayuzu implemente edilir
public class Daire extends Konut implements Comparable<Daire>{
    private int apartmentNum;
    //Daire constractor olusturulur
    Daire(String adress,int apartmentNum) {
        super(adress);
        this.setApartmentNum(apartmentNum);

    }
    //override edilir
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Daire adresi: " +adress +"\tDaire Numarasi: " +getApartmentNum());
    }
    //Compareböle arayuzundeki compareTo fonksiyonu override edilir
    @Override
    public int compareTo(Daire other) {
        return this.apartmentNum -other.apartmentNum;
    }
    public int getApartmentNum() {
        return apartmentNum;
    }

    public void setApartmentNum(int apartmentNum) {
        this.apartmentNum = apartmentNum;
    }
}
