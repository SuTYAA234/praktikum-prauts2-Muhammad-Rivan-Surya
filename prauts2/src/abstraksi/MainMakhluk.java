package abstraksi;

public class MainMakhluk {
    public static void main(String[] args) {
        MakhlukHidup m1 = new Manusia();
        MakhlukHidup m2 = new Hewan();
        m1.bernapas();
        m2.bernapas();
    }
}