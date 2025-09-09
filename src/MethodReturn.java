public class MethodReturn {
    public static void main(String[] args) {

        var result1 = sum(100,100);
        System.out.println(result1);
        System.out.println(sum(200,200));
        System.out.println("============");
        System.out.println(hitung(20,"+",30));
        System.out.println(hitung(50,"-",10));
        System.out.println(hitung(50,"dibagi",10));

    }

    static int sum(int value1, int value2){
        var total = value1 + value2;
        return total;
    }

    static int hitung(int angka1, String operasi, int angka2){
        switch (operasi){
            case "+" : return angka1 + angka2;
            case "-" : return angka1 - angka2;
            default : return 0;
        }
    }


}
