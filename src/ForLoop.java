public class ForLoop {
    public static void main(String[] args) {

        //for loop
        for(var nilai = 1;nilai<=10;nilai++){
            System.out.println("Ini perulangan ke- " + nilai);
        }

        System.out.println("==================Perulangan for Selesai======================");

        //while loop
        var bilangan = 1;

        while (bilangan<=10){
            System.out.println("Bilangan ke- " + bilangan);

            bilangan++;
        }

        System.out.println("==================Perulangan while Selesai======================");

        //Do while loop
        var nomor = 5;
        do{
            System.out.println("Nomor Ke- " + nomor);

            nomor++;
        }while (nomor <=10);


    }
}
