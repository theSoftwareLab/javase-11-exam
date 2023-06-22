package eu.thesoftwarelab.cert.datatypes;

/**
 * @author Emmanouil Georgopoulos
 */
class TestIntegers {

    public static void main(String[] args) {
        Integer i1 = new Integer(1_000_000);
        int i2 = 1_000_000;
        System.out.println(i1 == i2);
    }

}
