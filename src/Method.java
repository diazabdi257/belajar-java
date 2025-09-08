public class Method {
    public static void main(String[] args) {

        sayHelloWorld();
        System.out.println("===========");
        perulangan();
        System.out.println("============");
        nampilinNama("Diaz", "Abdi", 21);
        System.out.println("============");
        var result1 = sum(100,100);
        System.out.println(result1);
        System.out.println(sum(200,200));
        System.out.println("============");


    }

    static void sayHelloWorld(){
        System.out.println("Hello World! blabla bla");
    }

    static void perulangan(){
        for(var nilai = 1;nilai<=10;nilai++){
            System.out.println("Ini perulangan ke- " + nilai);
        }
    }

    //method parameter
    static void nampilinNama(String firstName, String lastName, int umur){
        System.out.println("Nama: " + firstName + " " + lastName + "\nBerumur " + umur + " Tahun");
    }

    static int sum(int value1, int value2){
        var total = value1 + value2;
        return total;
    }

}
