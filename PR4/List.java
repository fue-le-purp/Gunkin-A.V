import java.util.ArrayList;


public class List {
    public static void main(String[] args) {
        ArrayList<InternetShop> fileOfInternetShop = new ArrayList<>();
        Main shop = new Main(fileOfInternetShop);

        String shop = "magazinElectroniki";
        String tovar = "Tablet";
        String strana = "China";
        String oplata = "Money";
        int summa = 25000;
        String data = "25.07.2022";
        String FIO = "Петров Сергей Витальевич";

        InternetShop ITshop = new InternetShop(shop, tovar, strana, oplata, summa, data, FIO);
        shop.newInternetShop(ITshop);

        String name = "Кровать";
        int price = 120000;
        String type = "Двуспальная";
        String proizvoditel = "ЦДМ";

        MebForGost gost = new MebForGost(shop, tovar, strana, oplata, summa, data, FIO, name, price, type, proizvoditel);
        shop.newInternetShop(gost);

        String Name = "Стол";
        int gprice = 3000;
        int dl = 340;
        int vis = 100;
        int shir = 90;
        String mat = " пластик ";

        MebForKuh kuh = new MebForKuh(shop, tovar, strana, oplata, summa, data, FIO, Name, gprice, dl, vis, shir, mat);
        shop.newInternetShop(kuh);

        String vname = " Ванная";
        int vprice = 6000;

        MebForVan van = new MebForVan(shop, tovar, strana, oplata, summa, data, FIO, vname, vprice);
        shop.newInternetShop(van);


        System.out.println(shop.PrinInternetshop());
    }


}