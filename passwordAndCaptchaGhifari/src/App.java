
public class App {
    public static void main(String[] args) throws Exception {

        dataPembelian gipa = new faktur(); // polymorphisme

        gipa.login();
        gipa.isidata();
        gipa.cetakFaktur();

    }
}
