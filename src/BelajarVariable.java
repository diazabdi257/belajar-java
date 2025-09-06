public class BelajarVariable {
    public static void main(String[] args) {

        String name;
        name = "Diaz Abdi";

        int age = 30;
        String address = "Bogor";
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        name = "Naruto";

        System.out.println(name);

        //var name; akan error karena var harus langsung menentukan valuenya

        var teman = "Fafa";
        System.out.println(teman);

        final int harga = 50_000;
        final var kategori = "Makanan";
        System.out.println(harga);
        System.out.println(kategori);

    }
}
