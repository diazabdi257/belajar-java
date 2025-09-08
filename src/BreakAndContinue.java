public class BreakAndContinue {
    public static void main(String[] args) {

        //break (perulangan infinity pun akan berhenti jika bertemu break
        var counter =1;
        while (true) {
            System.out.println("Perulangan" + counter);
            counter ++;

            if(counter > 10){
                break;
            }
        }
        System.out.println("=======Perulangan berhenti========");


        //continue
        for(var nilai = 1; nilai <=100; nilai++){

            if(nilai % 2 == 0){
                continue;
            }

            System.out.println("Perulangan Ganjil " + nilai);
        }

    }
}
