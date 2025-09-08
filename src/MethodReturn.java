public class MethodReturn {
    public static void main(String[] args) {

        var result1 = sum(100,100);
        System.out.println(result1);
        System.out.println(sum(200,200));
        System.out.println("============");

    }

    static int sum(int value1, int value2){
        var total = value1 + value2;
        return total;
    }



}
