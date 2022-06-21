public class MebForVan extends InternetShop{
    private String vname;
    private int vprice;

    public MebForVan(String shop, String tovar, String strana, String oplata, int summa, String data, String FIO,
                     String vname, int vprice) {
        super(shop, tovar, strana, oplata, summa, data, FIO);
        this.vname = vname;
        this.vprice = vprice;

    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getVname() {
        return vname;
    }

    public void setVprice(int vprice) {
        this.vprice = vprice;
    }

    public int getVprice() {
        return vprice;
    }

    public String toString() {
        return "Мебель для ванны:" +
                "Название товара: " + vname +
                "цена: " + vprice;
    }
}