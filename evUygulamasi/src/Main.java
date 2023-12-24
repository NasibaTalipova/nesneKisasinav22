// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Nesneler olusturulup degerler atandi

        Bina bina1 = new Bina("İstanbul",25);
        Daire daire1 = new Daire("Pınar apt",7);
        Daire daire2 = new Daire("Maltepe",15);
        EvSahibi evSahibi1 = new EvSahibi("Yeşim", "Aslan",bina1);
        //Kiraci atandi
        Kiraci kiraci1 = new Kiraci("Nasiba","Talipova",evSahibi1);

        //Evsahibi icin displayInfo() metotu cagrilir ve bilgiler gosterilir
        evSahibi1.displayInfo();

        //Degiskene daireler eklenir
        evSahibi1.daireEkle(daire1);
        evSahibi1.daireEkle(daire2);


        //Evsahibinin daireleri listelenir
        System.out.println("Ev Sahibinin Daireleri:");
        for(Daire daire: evSahibi1.getMevcutDaireler()){
            daire.displayInfo();
        }

        //Kiraci1'in bilgileri yazdirilir
        kiraci1.displayInfo();
        //Kiracnin oturdugu evin bilgileri yazdirilir
        daire1.displayInfo();
        bina1.displayInfo();

        //Degiskene daireler eklenir
        evSahibi1.daireEkle(daire1);
        evSahibi1.daireEkle(daire2);
    }
}