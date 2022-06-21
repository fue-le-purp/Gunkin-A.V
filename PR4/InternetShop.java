public class InternetShop {shop
    private String shop;
    private String tovar;
    private String strana;
    private String oplata;
    private int summa;
    private String data;
    private String FIO;

    public InternetShop(String shop, String tovar, String strana, String oplata, int summa, String data, String FIO){
        this.shop = shop;
        this.tovar = tovar;
        this.strana = strana;
        this.oplata = oplata;
        this.summa = summa;
        this.data = data;
        this.FIO = FIO;
    }

    public void setshop(String shop) {
        this.shop = shop;
    }

    public String getshop() {
        return shop;
    }

    public void settovar(String tovar) {
        this.tovar = tovar;
    }

    public String gettovar() {
        return tovar;
    }

    public void setstrana(String strana) {
        this.strana = strana;
    }

    public String getstrana() {
        return strana;
    }

    public void setSumma(int summa) {
        this.summa = summa;
    }

    public int getSumma() {
        return summa;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setOplata(String oplata) {
        this.oplata = oplata;
    }

    public String getOplata() {
        return oplata;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getFIO() {
        return FIO;
    }

    public String toString() {
        return
                "Название Магазина: " + shop +
                ", Имя товара: " + tovar +
                ", Страна производитель " + strana +
                ", оплата: " + oplata +
                ", сумма = " + summa +
                ", дата: " + data +
                ", ФИО: " + FIO ;
    }
}