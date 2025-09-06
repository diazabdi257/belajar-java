public class OperasiBoolean {
    public static void main(String[] args) {

        var absen = 70;
        var nilaiAkhir = 80;

        var lulusAbsen = absen >= 75;
        var lulusNilaiAkhir = nilaiAkhir >= 75;

        var lulusDan = lulusAbsen && lulusNilaiAkhir; //dia 2 kondisi harus terpenuhi baru true
        var lulusatau = lulusAbsen || lulusNilaiAkhir; //sedangkan kalau atau dia salah satu saja berarti true

        System.out.println("ini lulus && : " + lulusDan);
        System.out.println("Ini lulus || : " + lulusatau);
    }

}
