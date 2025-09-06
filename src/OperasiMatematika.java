public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);


        System.out.println("=======Augmented Assignments========");
        //Augmented Assignment

        int c = 100;
        c += 10;
        System.out.println(c);
        c -= 10;
        System.out.println(c);
        c *= 2;
        System.out.println(c);

        System.out.println("=======Unary Operator========");
        //Unary Operator
        int d = 1;
        d++;
        System.out.println(d);
        d--;
        System.out.println(d);
    }
}
