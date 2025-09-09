public class RecursiveMethod {
    public static void main(String[] args) {

        System.out.println(factorial(3));
        System.out.println(factorialRecursive(3));

    }

    //factorial loop
    static int factorial (int value){
        var result = 1;
        for (int i = 1; i <= value; i++){
            result *= i;
        }
        return result;
    }

    static int factorialRecursive (int value){
        if(value == 1){
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }


}
