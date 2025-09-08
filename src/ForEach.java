public class ForEach {

    public static void main(String[] args) {

        String[] array = {
                "Diaz", "Ardi", "Wilaga",
                "Saki", "Widya", "Putri",
                "Fauzan", "Fajar", "Saputra"
        };

        //mengambil array jika tanpa for each tapi menggunakan perulangan
        for (int i = 0; i < array.length;i++){
            System.out.println(array[i]);
        }

        System.out.println("=======================");

        for(var value : array){
            System.out.println(value);
        }


    }
}
