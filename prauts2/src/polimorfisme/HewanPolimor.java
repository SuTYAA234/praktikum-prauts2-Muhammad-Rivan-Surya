package polimorfisme;

public class HewanPolimor {
    public static void main(String[] args) {

        Hewan h = new Hewan();

        Hewan hewan2 = h.new Herbivora();
        Hewan hewan3 = h.new Karnivora();
        Hewan hewan4 = h.new Kelinci();
        h.suara();
        hewan2.suara();
        hewan3.suara();
        hewan4.suara();

    }
}