import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Testgen0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test01");
        com.gen gen0 = new com.gen();
        int[] intArray7 = new int[] { (short) 100, (byte) 0, 0, 100 };
        gen0.test(0, 'a', intArray7, "", (long) (short) 100);
        java.lang.Class<?> wildcardClass11 = intArray7.getClass();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test03");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr((int) (short) -1);
        char char4 = testgen0.generateChar((int) (short) 0);
        java.lang.Class<?> wildcardClass5 = testgen0.getClass();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test04");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        int int4 = testgen0.generateInt((int) (byte) -1);
        char char6 = testgen0.generateChar((int) '#');
        java.lang.Class<?> wildcardClass7 = testgen0.getClass();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test05");
        com.gen gen0 = new com.gen();
        testgen testgen3 = new testgen();
        java.lang.String str5 = testgen3.generateStr((int) (short) -1);
        char char7 = testgen3.generateChar((int) (short) 0);
        char char9 = testgen3.generateChar(1);
        int[] intArray11 = testgen3.generateArr((int) '#');
        int[] intArray13 = testgen3.generateArr(1);
        gen0.test(100, '3', intArray13, "", (long) 1);
        testgen testgen19 = new testgen();
        java.lang.String str21 = testgen19.generateStr((int) (short) -1);
        char char23 = testgen19.generateChar((int) (short) 0);
        char char25 = testgen19.generateChar(1);
        int[] intArray27 = testgen19.generateArr((int) '#');
        gen0.test((-1), 'Q', intArray27, "hi!", (long) (short) 10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test06");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr((int) (short) 10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test07");
        testgen testgen0 = new testgen();
        long long2 = testgen0.generateLong(100);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test08");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        int int4 = testgen0.generateInt((int) (byte) -1);
        char char6 = testgen0.generateChar((int) '#');
        java.lang.String str8 = testgen0.generateStr(1);
        java.lang.String str10 = testgen0.generateStr((int) 'a');
        int[] intArray12 = testgen0.generateArr((int) '4');
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test09");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        int int4 = testgen0.generateInt((int) (byte) -1);
        char char6 = testgen0.generateChar((int) '#');
        java.lang.String str8 = testgen0.generateStr(1);
        java.lang.String str10 = testgen0.generateStr((int) 'a');
        java.lang.String str12 = testgen0.generateStr((int) (short) 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test10");
        com.gen gen0 = new com.gen();
        int[] intArray7 = new int[] { (short) 100, (byte) 0, 0, 100 };
        gen0.test(0, 'a', intArray7, "", (long) (short) 100);
        com.gen gen13 = new com.gen();
        int[] intArray20 = new int[] { (short) 100, (byte) 0, 0, 100 };
        gen13.test(0, 'a', intArray20, "", (long) (short) 100);
        gen0.test((int) (byte) 10, '3', intArray20, "lqjWnEZKiWOVr1Ro", (long) 0);
        int[] intArray29 = null;
        // The following exception was thrown during execution in test generation
        try {
            gen0.test(0, 'Q', intArray29, "54wydBzYkv3u", 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test11");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        long long4 = testgen0.generateLong(100);
        int int6 = testgen0.generateInt((int) 'Q');
        java.lang.String str8 = testgen0.generateStr((int) 'Q');
        long long10 = testgen0.generateLong(0);
        java.lang.Class<?> wildcardClass11 = testgen0.getClass();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test12");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr((int) (short) -1);
        char char4 = testgen0.generateChar((int) (short) 0);
        char char6 = testgen0.generateChar(1);
        java.lang.String str8 = testgen0.generateStr(1383);
        java.lang.String str10 = testgen0.generateStr(1);
        java.lang.String str12 = testgen0.generateStr((int) (short) 10);
        int int14 = testgen0.generateInt((int) (short) 10);
        int int16 = testgen0.generateInt((int) 'l');
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test13");
        testgen testgen0 = new testgen();
        long long2 = testgen0.generateLong(0);
        char char4 = testgen0.generateChar(2699);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test14");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr((int) (short) -1);
        char char4 = testgen0.generateChar((int) (short) 0);
        char char6 = testgen0.generateChar(1);
        char char8 = testgen0.generateChar((int) (byte) 0);
        java.lang.String str10 = testgen0.generateStr((int) (byte) 10);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test15");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr((int) (short) -1);
        int[] intArray4 = testgen0.generateArr((-5525));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test16");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr((int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = testgen0.getClass();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test17");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        long long4 = testgen0.generateLong(100);
        int int6 = testgen0.generateInt((int) 'Q');
        java.lang.String str8 = testgen0.generateStr((int) 'Q');
        java.lang.String str10 = testgen0.generateStr((int) 'a');
        java.lang.String str12 = testgen0.generateStr((-354));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test18");
        com.gen gen0 = new com.gen();
        int[] intArray7 = new int[] { (short) 100, (byte) 0, 0, 100 };
        gen0.test(0, 'a', intArray7, "", (long) (short) 100);
        testgen testgen13 = new testgen();
        java.lang.String str15 = testgen13.generateStr((int) (short) -1);
        char char17 = testgen13.generateChar((int) (short) 0);
        char char19 = testgen13.generateChar(1);
        int[] intArray21 = testgen13.generateArr((int) '#');
        int[] intArray23 = testgen13.generateArr(1);
        gen0.test(10, '#', intArray23, "YY7XS", (long) ' ');
        testgen testgen29 = new testgen();
        java.lang.String str31 = testgen29.generateStr((int) (short) -1);
        char char33 = testgen29.generateChar((int) (short) 0);
        int[] intArray35 = testgen29.generateArr(0);
        gen0.test((int) 'f', 'Y', intArray35, "r1Ror6fLPm", (-5346144739450824145L));
        testgen testgen41 = new testgen();
        java.lang.String str43 = testgen41.generateStr((int) (short) -1);
        char char45 = testgen41.generateChar((int) (short) 0);
        char char47 = testgen41.generateChar(1);
        int[] intArray49 = testgen41.generateArr((int) '#');
        gen0.test(0, 'a', intArray49, "hi!", (long) 1383);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test19");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        int int4 = testgen0.generateInt((int) (byte) -1);
        char char6 = testgen0.generateChar((int) '#');
        java.lang.String str8 = testgen0.generateStr(1);
        java.lang.String str10 = testgen0.generateStr((int) 'a');
        long long12 = testgen0.generateLong((int) '4');
        char char14 = testgen0.generateChar(10);
        char char16 = testgen0.generateChar((int) (short) 100);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test20");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr((-1));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test21");
        com.gen gen0 = new com.gen();
        int[] intArray7 = new int[] { (short) 100, (byte) 0, 0, 100 };
        gen0.test(0, 'a', intArray7, "", (long) (short) 100);
        int[] intArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            gen0.test((int) (short) 1, 'Y', intArray13, "YY7XS", 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test22");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        int int4 = testgen0.generateInt((int) (byte) -1);
        char char6 = testgen0.generateChar((int) '#');
        java.lang.String str8 = testgen0.generateStr(1);
        java.lang.String str10 = testgen0.generateStr((int) 'a');
        java.lang.Class<?> wildcardClass11 = testgen0.getClass();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test23");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr((int) (short) -1);
        char char4 = testgen0.generateChar((int) (short) 0);
        char char6 = testgen0.generateChar(1);
        char char8 = testgen0.generateChar((int) (byte) 0);
        int int10 = testgen0.generateInt(1383);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test24");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr((int) (short) -1);
        char char4 = testgen0.generateChar((int) (short) 0);
        char char6 = testgen0.generateChar(1);
        char char8 = testgen0.generateChar(100);
        int int10 = testgen0.generateInt((int) (short) 100);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test25");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        long long4 = testgen0.generateLong(100);
        java.lang.String str6 = testgen0.generateStr((int) 'f');
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test26");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        int int4 = testgen0.generateInt((int) (byte) -1);
        int[] intArray6 = testgen0.generateArr(10);
        int[] intArray8 = testgen0.generateArr((int) (byte) 0);
        int[] intArray10 = testgen0.generateArr(0);
        int[] intArray12 = testgen0.generateArr((int) (byte) 0);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test27");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr((int) (short) -1);
        char char4 = testgen0.generateChar((int) (short) 0);
        char char6 = testgen0.generateChar(1);
        int[] intArray8 = testgen0.generateArr((int) '#');
        int[] intArray10 = testgen0.generateArr((int) '3');
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test28");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        int int4 = testgen0.generateInt((int) (byte) -1);
        char char6 = testgen0.generateChar((int) '#');
        java.lang.String str8 = testgen0.generateStr(1);
        java.lang.String str10 = testgen0.generateStr((int) 'a');
        long long12 = testgen0.generateLong((int) '4');
        char char14 = testgen0.generateChar(10);
        int int16 = testgen0.generateInt((-1));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test29");
        com.gen gen0 = new com.gen();
        int[] intArray7 = new int[] { (short) 100, (byte) 0, 0, 100 };
        gen0.test(0, 'a', intArray7, "", (long) (short) 100);
        testgen testgen13 = new testgen();
        java.lang.String str15 = testgen13.generateStr((int) (short) -1);
        char char17 = testgen13.generateChar((int) (short) 0);
        char char19 = testgen13.generateChar(1);
        int[] intArray21 = testgen13.generateArr((int) '#');
        int[] intArray23 = testgen13.generateArr(1);
        gen0.test(10, '#', intArray23, "YY7XS", (long) ' ');
        testgen testgen29 = new testgen();
        java.lang.String str31 = testgen29.generateStr((int) (short) -1);
        char char33 = testgen29.generateChar((int) (short) 0);
        int[] intArray35 = testgen29.generateArr(0);
        gen0.test((int) 'f', 'Y', intArray35, "r1Ror6fLPm", (-5346144739450824145L));
        testgen testgen41 = new testgen();
        java.lang.String str43 = testgen41.generateStr(100);
        int int45 = testgen41.generateInt((int) (byte) -1);
        int[] intArray47 = testgen41.generateArr(10);
        int[] intArray49 = testgen41.generateArr((int) (byte) 0);
        gen0.test((-1), '4', intArray49, "wydBzYkv3ul", (long) (short) 1);
        int[] intArray59 = new int[] { '4', 1383, ' ', (short) 10 };
        gen0.test((int) (short) 0, 'a', intArray59, "wydBzYkv3ul", (long) (short) 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test30");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr((int) (short) -1);
        char char4 = testgen0.generateChar((int) (short) 0);
        char char6 = testgen0.generateChar(1);
        java.lang.String str8 = testgen0.generateStr(1383);
        long long10 = testgen0.generateLong((int) (byte) 1);
        int[] intArray12 = testgen0.generateArr((int) (byte) -1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test31");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        long long4 = testgen0.generateLong(100);
        char char6 = testgen0.generateChar((int) '4');
        char char8 = testgen0.generateChar(0);
        java.lang.String str10 = testgen0.generateStr((-1));
        long long12 = testgen0.generateLong((int) 'Y');
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test32");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr((int) (short) -1);
        char char4 = testgen0.generateChar((int) (short) 0);
        char char6 = testgen0.generateChar(1);
        char char8 = testgen0.generateChar((int) 'a');
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test33");
        com.gen gen0 = new com.gen();
        int[] intArray9 = new int[] { 1383, (byte) 10, 3571, ' ', (-4624), (byte) 100 };
        gen0.test((int) '#', 'l', intArray9, "hi!", (long) 100);
        java.lang.Class<?> wildcardClass13 = intArray9.getClass();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test34");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        long long4 = testgen0.generateLong(100);
        int[] intArray6 = testgen0.generateArr((int) 'x');
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test35");
        com.gen gen0 = new com.gen();
        int[] intArray7 = new int[] { (short) 100, (byte) 0, 0, 100 };
        gen0.test(0, 'a', intArray7, "", (long) (short) 100);
        testgen testgen13 = new testgen();
        java.lang.String str15 = testgen13.generateStr((int) (short) -1);
        char char17 = testgen13.generateChar((int) (short) 0);
        char char19 = testgen13.generateChar(1);
        int[] intArray21 = testgen13.generateArr((int) '#');
        int[] intArray23 = testgen13.generateArr(1);
        gen0.test(10, '#', intArray23, "YY7XS", (long) ' ');
        testgen testgen29 = new testgen();
        java.lang.String str31 = testgen29.generateStr((int) (short) -1);
        char char33 = testgen29.generateChar((int) (short) 0);
        int[] intArray35 = testgen29.generateArr(0);
        gen0.test((int) 'f', 'Y', intArray35, "r1Ror6fLPm", (-5346144739450824145L));
        testgen testgen41 = new testgen();
        java.lang.String str43 = testgen41.generateStr((int) (short) -1);
        char char45 = testgen41.generateChar((int) (short) 0);
        char char47 = testgen41.generateChar(1);
        int[] intArray49 = testgen41.generateArr((int) '#');
        gen0.test((-5525), 'L', intArray49, "qjWnEZKiWOVr1Ror6fL", (long) (short) -1);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test36");
        com.gen gen0 = new com.gen();
        int[] intArray7 = new int[] { (short) 100, (byte) 0, 0, 100 };
        gen0.test(0, 'a', intArray7, "", (long) (short) 100);
        testgen testgen13 = new testgen();
        java.lang.String str15 = testgen13.generateStr((int) (short) -1);
        char char17 = testgen13.generateChar((int) (short) 0);
        char char19 = testgen13.generateChar(1);
        int[] intArray21 = testgen13.generateArr((int) '#');
        int[] intArray23 = testgen13.generateArr(1);
        gen0.test(10, '#', intArray23, "YY7XS", (long) ' ');
        java.lang.Class<?> wildcardClass27 = gen0.getClass();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test37");
        testgen testgen0 = new testgen();
        long long2 = testgen0.generateLong(0);
        java.lang.String str4 = testgen0.generateStr((int) (short) 1);
        long long6 = testgen0.generateLong((int) (byte) 10);
        long long8 = testgen0.generateLong((-2695));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test38");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        int int4 = testgen0.generateInt((int) (byte) -1);
        int[] intArray6 = testgen0.generateArr(10);
        int[] intArray8 = testgen0.generateArr((int) (byte) 0);
        int[] intArray10 = testgen0.generateArr(0);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test39");
        com.gen gen0 = new com.gen();
        testgen testgen3 = new testgen();
        java.lang.String str5 = testgen3.generateStr(100);
        int int7 = testgen3.generateInt((int) (byte) -1);
        char char9 = testgen3.generateChar((int) '#');
        int[] intArray11 = testgen3.generateArr((int) (byte) -1);
        gen0.test((int) (short) 1, 'Q', intArray11, "YY7XS", 1L);
        testgen testgen17 = new testgen();
        java.lang.String str19 = testgen17.generateStr(100);
        int int21 = testgen17.generateInt((int) (byte) -1);
        char char23 = testgen17.generateChar((int) '#');
        int[] intArray25 = testgen17.generateArr((int) (byte) -1);
        gen0.test(6537, 'a', intArray25, "7XSjlqjWnEZK", 10L);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test40");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr((int) (short) -1);
        char char4 = testgen0.generateChar((int) (short) 0);
        char char6 = testgen0.generateChar(1);
        char char8 = testgen0.generateChar((int) '3');
        long long10 = testgen0.generateLong((int) 'l');
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test41");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        long long4 = testgen0.generateLong(100);
        char char6 = testgen0.generateChar((int) '4');
        int int8 = testgen0.generateInt((int) (byte) 1);
        int[] intArray10 = testgen0.generateArr((int) 'l');
        int[] intArray12 = testgen0.generateArr(100);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test42");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        int int4 = testgen0.generateInt((int) (byte) -1);
        char char6 = testgen0.generateChar((int) '#');
        int[] intArray8 = testgen0.generateArr((int) (byte) -1);
        char char10 = testgen0.generateChar((-354));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test43");
        testgen testgen0 = new testgen();
        long long2 = testgen0.generateLong(0);
        java.lang.String str4 = testgen0.generateStr((-4624));
        int int6 = testgen0.generateInt((int) (short) 100);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test44");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        int int4 = testgen0.generateInt((int) (byte) 100);
        int int6 = testgen0.generateInt(2699);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test45");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr((int) (short) -1);
        char char4 = testgen0.generateChar((int) (short) 0);
        char char6 = testgen0.generateChar(1);
        java.lang.String str8 = testgen0.generateStr(1383);
        int int10 = testgen0.generateInt((int) '4');
        java.lang.String str12 = testgen0.generateStr((int) 'Q');
        char char14 = testgen0.generateChar((-1));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test46");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        long long4 = testgen0.generateLong(100);
        int int6 = testgen0.generateInt((int) 'Q');
        java.lang.String str8 = testgen0.generateStr((int) 'Q');
        java.lang.String str10 = testgen0.generateStr((int) '4');
        java.lang.String str12 = testgen0.generateStr(100);
        long long14 = testgen0.generateLong((int) (short) 100);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test47");
        testgen testgen0 = new testgen();
        long long2 = testgen0.generateLong(0);
        int int4 = testgen0.generateInt((-354));
        int int6 = testgen0.generateInt(2699);
        java.lang.String str8 = testgen0.generateStr(0);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test48");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr((int) (short) -1);
        char char4 = testgen0.generateChar((int) (short) 0);
        char char6 = testgen0.generateChar(1);
        java.lang.String str8 = testgen0.generateStr(1383);
        int int10 = testgen0.generateInt((int) '4');
        java.lang.String str12 = testgen0.generateStr((int) 'Q');
        int[] intArray14 = testgen0.generateArr((-9129));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test49");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        int int4 = testgen0.generateInt((int) (byte) -1);
        int[] intArray6 = testgen0.generateArr(10);
        char char8 = testgen0.generateChar(1);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test50");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        int int4 = testgen0.generateInt((int) (byte) -1);
        char char6 = testgen0.generateChar((int) '#');
        java.lang.String str8 = testgen0.generateStr(1);
        java.lang.String str10 = testgen0.generateStr((int) 'a');
        java.lang.String str12 = testgen0.generateStr((int) 'l');
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test51");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr((int) (short) -1);
        char char4 = testgen0.generateChar((int) (short) 0);
        char char6 = testgen0.generateChar(1);
        int[] intArray8 = testgen0.generateArr((int) '#');
        int[] intArray10 = testgen0.generateArr((int) '3');
        int int12 = testgen0.generateInt((int) 's');
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test52");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr((int) (short) -1);
        char char4 = testgen0.generateChar((int) (short) 0);
        char char6 = testgen0.generateChar(1);
        int[] intArray8 = testgen0.generateArr((int) '#');
        int[] intArray10 = testgen0.generateArr((int) '3');
        int int12 = testgen0.generateInt((int) 'Q');
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test53");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        long long4 = testgen0.generateLong(100);
        char char6 = testgen0.generateChar((int) '4');
        int int8 = testgen0.generateInt((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = testgen0.getClass();
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test54");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        long long4 = testgen0.generateLong(100);
        char char6 = testgen0.generateChar((int) '4');
        char char8 = testgen0.generateChar(0);
        long long10 = testgen0.generateLong((int) 'L');
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test55");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        long long4 = testgen0.generateLong(100);
        char char6 = testgen0.generateChar((int) '4');
        char char8 = testgen0.generateChar(0);
        long long10 = testgen0.generateLong((int) '3');
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test56");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr((int) (short) -1);
        char char4 = testgen0.generateChar((int) (short) 0);
        char char6 = testgen0.generateChar(1);
        char char8 = testgen0.generateChar(100);
        int int10 = testgen0.generateInt((-2695));
        java.lang.Class<?> wildcardClass11 = testgen0.getClass();
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test57");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        long long4 = testgen0.generateLong(100);
        int int6 = testgen0.generateInt((int) 'Q');
        java.lang.String str8 = testgen0.generateStr((int) 'Q');
        java.lang.String str10 = testgen0.generateStr((int) '#');
        int int12 = testgen0.generateInt((int) (byte) 100);
        long long14 = testgen0.generateLong(10);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test58");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        long long4 = testgen0.generateLong(100);
        int int6 = testgen0.generateInt(0);
        java.lang.Class<?> wildcardClass7 = testgen0.getClass();
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test59");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr((int) (short) -1);
        char char4 = testgen0.generateChar((int) (short) 0);
        char char6 = testgen0.generateChar(1);
        java.lang.String str8 = testgen0.generateStr(1383);
        java.lang.String str10 = testgen0.generateStr(1);
        java.lang.String str12 = testgen0.generateStr((int) 'x');
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test60");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr((int) (byte) 10);
        int int4 = testgen0.generateInt((int) ' ');
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test61");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        long long4 = testgen0.generateLong(100);
        int int6 = testgen0.generateInt((int) 'Q');
        java.lang.String str8 = testgen0.generateStr((int) 'Q');
        java.lang.String str10 = testgen0.generateStr((int) '#');
        int int12 = testgen0.generateInt((int) (byte) 100);
        char char14 = testgen0.generateChar((-8876));
        long long16 = testgen0.generateLong((int) (short) 100);
        char char18 = testgen0.generateChar(0);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test62");
        testgen testgen0 = new testgen();
        long long2 = testgen0.generateLong(0);
        java.lang.String str4 = testgen0.generateStr((int) (short) 1);
        int[] intArray6 = testgen0.generateArr(0);
        int int8 = testgen0.generateInt((-354));
        long long10 = testgen0.generateLong((int) (byte) 10);
        java.lang.String str12 = testgen0.generateStr((-6164));
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test63");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        long long4 = testgen0.generateLong(100);
        int int6 = testgen0.generateInt((int) 'Q');
        java.lang.String str8 = testgen0.generateStr((int) 'Q');
        java.lang.String str10 = testgen0.generateStr((int) '4');
        int int12 = testgen0.generateInt(100);
        int int14 = testgen0.generateInt((int) '#');
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test64");
        com.gen gen0 = new com.gen();
        int[] intArray9 = new int[] { 1383, (byte) 10, 3571, ' ', (-4624), (byte) 100 };
        gen0.test((int) '#', 'l', intArray9, "hi!", (long) 100);
        testgen testgen15 = new testgen();
        java.lang.String str17 = testgen15.generateStr((int) (short) -1);
        char char19 = testgen15.generateChar((int) (short) 0);
        char char21 = testgen15.generateChar(1);
        int[] intArray23 = testgen15.generateArr((int) '#');
        gen0.test((int) 'L', 'Y', intArray23, "Y7XSjlqjWnEZKiWO", (-3983067427559775097L));
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test65");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr((int) (short) -1);
        char char4 = testgen0.generateChar((int) (short) 0);
        char char6 = testgen0.generateChar(1);
        int[] intArray8 = testgen0.generateArr((int) '#');
        long long10 = testgen0.generateLong(0);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test66");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr((int) (short) -1);
        int int4 = testgen0.generateInt((int) 'Y');
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test67");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr((int) (short) -1);
        char char4 = testgen0.generateChar((int) (short) 0);
        char char6 = testgen0.generateChar(1);
        char char8 = testgen0.generateChar(100);
        long long10 = testgen0.generateLong(2699);
        long long12 = testgen0.generateLong((int) 'l');
        char char14 = testgen0.generateChar((int) 'Q');
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test68");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        long long4 = testgen0.generateLong(100);
        int int6 = testgen0.generateInt((int) 'Q');
        java.lang.String str8 = testgen0.generateStr((int) 'Q');
        java.lang.String str10 = testgen0.generateStr((int) 'a');
        long long12 = testgen0.generateLong(1676);
        int int14 = testgen0.generateInt((int) '#');
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test69");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr((int) (byte) 10);
        char char4 = testgen0.generateChar((int) (short) 10);
        int int6 = testgen0.generateInt((-4624));
        long long8 = testgen0.generateLong((int) 'Y');
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test70");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        int int4 = testgen0.generateInt((int) (byte) -1);
        int[] intArray6 = testgen0.generateArr((int) (short) 1);
        int[] intArray8 = testgen0.generateArr((int) (byte) 0);
        java.lang.String str10 = testgen0.generateStr((int) (short) 100);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test71");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr((int) (short) -1);
        char char4 = testgen0.generateChar((int) (short) 0);
        char char6 = testgen0.generateChar(1);
        int[] intArray8 = testgen0.generateArr((int) '#');
        int[] intArray10 = testgen0.generateArr(1);
        long long12 = testgen0.generateLong((int) (short) 100);
        char char14 = testgen0.generateChar((int) (byte) 100);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Testgen0.test72");
        testgen testgen0 = new testgen();
        java.lang.String str2 = testgen0.generateStr(100);
        long long4 = testgen0.generateLong(100);
        int[] intArray6 = testgen0.generateArr((int) 'Q');
        int[] intArray8 = testgen0.generateArr((int) '4');
        java.lang.Class<?> wildcardClass9 = testgen0.getClass();
    }
}

