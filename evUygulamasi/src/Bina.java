//Bina sinifi Konut sinifin aextend edilir
public class Bina extends Konut{
    //tanımlamalar
    private int numberOfFloors;
    //Bina constructor tanimlanir
    Bina(String adress,int numberOfFloors) {
        super(adress);
        this.setnumberOfFloors(numberOfFloors);
    }
    //Fonksiyon
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bina adresi : " + adress + "\tKat Numarasi: "+getnumberOfFloors());
    }
    //Sarmalama ilkesi kullanilir
    public int getnumberOfFloors() {
        return numberOfFloors;
    }

    public void setnumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
