package abstraksi;

public class MainKendaraan {
    public static void main(String[] args) {
        Kendaraan k1 = new Mobil();
        Kendaraan k2 = new Sepeda();
        k1.bergerak();
        k2.bergerak();
    }
}