package overriding;

public class BentukBeraksi {
    public static void main(String[] args) {
        Bentuk b = new Bentuk();
        Bentuk bentuk2 = b.new Segitiga();
        Bentuk bentuk3 = b.new Persegi();

        b.gambar();
        bentuk2.gambar();
        bentuk3.gambar();
    }
}