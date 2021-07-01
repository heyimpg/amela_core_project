package java_web.branches_ex;


class CylinderTest {
    public static void main(String[] args) {
        testGetVolume0And0();
        testGetVolume1And2();
    }
    
    static void testGetVolume0And0() {
        int radius = 0;
        int height = 0;
        double expected = 0;

        double result = Cylinder.getVolume(radius, height);
        assertEquals(expected, result);
    }

    private static void assertEquals(double expected, double result) {
        System.out.println("Value volume expected = "+expected+ "\tresult= "+result);
    }


    static void testGetVolume1And2() {
        int radius = 1;
        int height = 2;
        double expected = 18.84955592153876;

        double result = Cylinder.getVolume(radius, height);
        assertEquals(expected, result);
    }
}
