public class MethodVariableArgument {
    public static void main(String[] args) {

        int[] values = {10,10,90,80};
        sayCongrats("Diaz", values);
        ucapan("Saki", 90,90,90,90);

    }

    //tanpa method variable argument
    static void sayCongrats(String name, int[] values){
        var total = 0;
        for(var value : values){
            total += value;
        }
        var finalValue = total/values.length;
        System.out.println("Total = "+ total);
        System.out.println("finalValuenya = "+ finalValue);
        if (finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda tidak lulus");
        }
    }


    //dengan method variable argument
    static void ucapan(String name, int ... values){
        var total = 0;
        for(var value : values){
            total += value;
        }
        var finalValue = total/values.length;
        System.out.println("Total = "+ total);
        System.out.println("finalValuenya = "+ finalValue);
        if (finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda tidak lulus");
        }
    }



}
