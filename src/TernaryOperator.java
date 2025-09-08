public class TernaryOperator {
    public static void main(String[] args) {

        var nilai = 75;

        //jika memakai if else =
        String ucapan1;

        if(nilai >= 75){
            ucapan1 = "Selamat Anda lulus (if else)";
        } else {
            ucapan1 = "Silahkan Coba lagi (if else)";
        }

        System.out.println(ucapan1);

        //Menggunakan Ternary operator
        String ucapan2 = nilai >= 75 ? "Selamat Anda lulus (Ternary)" : "Silahkan Coba lagi (Ternary)";

        System.out.println(ucapan2);
    }
}
