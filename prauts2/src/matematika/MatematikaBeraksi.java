package matematika;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika m = new Matematika();
        System.out.println("Pertambahan: 20+20 = " + m.pertambahan(20, 20));
        System.out.println("Pengurangan: 10-5 = " + m.pengurangan(10, 5));
        System.out.println("Perkalian: 10x20 = " + m.perkalian(10, 20));
        System.out.println("Pembagian 21/2 = " + m.pembagian(21, 2));
    }
}