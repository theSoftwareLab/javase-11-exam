package eu.thesoftwarelab.cert.datatypes;

/**
 * This class shows various examples related to operator precedence and expression evaluation.
 * @author Manolis Georgopoulos
 */
class TestOperatorPrecedence {

    public static void main(String[] args) {
        TestOperatorPrecedence op = new TestOperatorPrecedence();
        op.testPrecedence();
        op.testPrecedence2();
    }

    private void testPrecedence() {
        int k = 1;
        boolean b = k-- > 0;
        System.out.println(b);
    }

    private void testPrecedence2() {
        int a = 0;
        if (a++ == a++) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
    }

}
