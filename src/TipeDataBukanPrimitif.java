public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInterger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        //mengubah primitif menjadi bukanprimitif
        int iniIntprimitif = 100;

        Integer iniIntegerBukanPrimitif = iniIntprimitif;

        System.out.println(iniIntegerBukanPrimitif);

        //konversi dari tipe primitif

        int age = 30;
        Integer ageObject = age;
        int ageAgain = ageObject;

        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();
        float floatAge = ageObject.floatValue();
    }
}
