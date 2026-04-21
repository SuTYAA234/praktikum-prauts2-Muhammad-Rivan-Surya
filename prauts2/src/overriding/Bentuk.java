package overriding;

public class Bentuk {
    void gambar() {
        System.out.println("Menggambar bentuk");
    }

    class Segitiga extends Bentuk {
        @Override
        void gambar() {
            System.out.println("Mengambar Segitiga");
        }
    }

    class Persegi extends Bentuk {
        @Override
        void gambar() {
            System.out.println("Mengambar persegi");
        }
    }
}
