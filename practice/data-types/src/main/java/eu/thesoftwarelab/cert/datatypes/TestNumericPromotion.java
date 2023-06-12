package eu.thesoftwarelab.cert.datatypes;

/**
 * This class shows various examples related to numeric promotion.
 * Read <a href="https://docs.oracle.com/javase/specs/jls/se11/html/jls-5.html#jls-5.6">Numeric Contexts</a>
 *
 * @author Emmanouil Georgopoulos
 */
class TestNumericPromotion {

    public static void main(String[] args) {
        TestNumericPromotion numericPromotion = new TestNumericPromotion();
        numericPromotion.testUnaryNumericPromotion();

    }

    private void testUnaryNumericPromotion() {
        byte b = 1;
        byte b1 = ++b;
        int b2 = +b; // promoted to int
        System.out.println("b: "+ b + ", b1: " + b1 + ", b2: " + b2);
    }

}
