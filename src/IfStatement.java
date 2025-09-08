public class IfStatement {

    public static void main(String[] args) {

        var nilai = 100;
        var absen = 95;
        String index;
        int hadiah = 0;


        if (nilai >= 75 && absen >= 75){
            System.out.println("Nilai Anda A");
            index = "A";
        } else if (nilai >= 75 || absen >= 75) {
            System.out.println("Nilai Anda B");
            index = "B";
        } else if (nilai >= 60 || absen >= 60){
            System.out.println("Nilai Anda C");
            index = "C";
        } else if (nilai >= 50 && absen >= 50){
            System.out.println("Nilai Anda D");
            index = "D";
        }
        else{
            System.out.println("Nilai Anda E");
            index = "E";
        }

        switch (index){
            case "A":
                System.out.println("Wow, Selamat Anda Lulus Dengan Baik");
                hadiah = 1;
                break;
            case "B":
            case "C":
                System.out.println("Selamat Anda Lulus");
                hadiah = 2;
                break;
            case "D":
                System.out.println("Selamat Anda Lulus pas pasan");
                hadiah = 3;
                break;
            default:
                System.out.println("Anda Mengulang Matkul Ini");
        }

        //Memakai Switch Lambda (tidak usah lagi memakai kata kunci break
        System.out.println("Anda Mendapatkan Hadiah ke-" + hadiah + " yaitu: ");


        switch (hadiah){
            case 1 -> System.out.println("Cumlaude + 1 juta rupiah");
            case 2,3 -> System.out.println("Mendapatkan 500rb rupiah");
            default -> {
                System.out.println("LU NGULANG KOCAK!!! BAYAR UKT LG WKWKWK");
            }
        }

        //Switch tanpa yield
        String ucapan;
        switch (index){
            case "A" -> ucapan = "Cieeee dapet A";
            case "B","C" -> ucapan = "Cieee dapet B/C";
            case "D" -> ucapan = "cieeeeeee D";
            default -> ucapan = "GA LULUS KOCAK LU!! MAU DIUCAPIN APAAN OKAWOKWAKOAW";
        }
        System.out.println(ucapan);

        //Swtich dengan yield (jadi kyk return gitu gunanya
        String pesan = switch (index){
            case "A": yield "Selamat yaaa kamu sudah melakukan yang terbaik, nilai kamu A";
            case "B", "C" : yield "Finally, u made it.. Congratulation";
            case "D" : yield "congrats, gapapa kok yang penting kan lulus";
            default: yield "Itsss okeee, next time sungguh sungguh !!";
        };
        System.out.println(pesan);
    }
}
