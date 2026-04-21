package overloading;

public class HitungBeraksi{
    public static void main(String[] args) {
        Hitung h = new Hitung();
        System.out.println("Pertamnahan 2 angka (int): " + h.tambah(5, 3));
        System.out.println("Pertamnahan 3 angka (int): " + h.tambah(1, 2, 3));
        System.out.println("Pertamnahan 2 angka (double): " + h.tambah(5.5, 3.3));
    }
}