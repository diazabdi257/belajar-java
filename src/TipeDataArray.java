public class TipeDataArray {
    public static void main(String[] args) {
        String[] namaString;
        namaString = new String[2]; //atau bisa juga String[] namaString = new String[2];
        namaString[0] = "Diaz";
        namaString[1] = "Abdi";

        System.out.println(namaString[0] + " " + namaString[1]);
        namaString[1] = "Ardi Wilaga";
        System.out.println(namaString[0] + " " + namaString[1]);

        //bisa di persingkat menjadi

        String[] namaNama = {
                "Diaz", "Abdi"
        };

        int[] arrayInt = new int[] {
                1, 2, 3, 4 ,5 ,6 ,7, 8
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };

        System.out.println(namaNama[0] + namaNama[1]);
        System.out.println(arrayInt[7]);
        System.out.println(arrayLong[2]);

        //operasi di array
        System.out.println(namaNama[0]); //mengambil data di array
        namaNama[0] = "Zaid"; //mengubah data di array
        System.out.println(namaNama[0]); //lalu ini saya mengambilnya kembali
        System.out.println(arrayInt.length); // mengambil panjang array

        //disini saya akan mencoba untuk menghapus (mengisi data kosong) data di array (karena di java tidak bisa menghapus data di array karena fix panjangnya
        namaNama[0] = null;
        System.out.println(namaNama[0]);
        System.out.println(namaNama[0] + " " + namaNama[1]);

        System.out.println("===============Membuat array Dalam Array =============");

        //membuat array dalam array
        String [][] members = {
                {"Diaz", "Abdi"},
                {"Fauzan", "Fajar"},
                {"Saki", "Widya", "Putri"},
        };

        String[] member1 = members[0];
        System.out.println(member1[0]);

        System.out.println(members[1][1]);
        System.out.println(members[2][0]);

        System.out.println
                (member1[0] + members[0][1] + ", " + members[1][0] + ", dan " + members[2][0] + members[2][1] + members[2][2]);
        members[0][1] = "Ardi Wilaga";
        System.out.println
                (member1[0] + members[0][1] + ", " + members[1][0] + ", dan " + members[2][0] + members[2][1] + members[2][2]);
    }
}
