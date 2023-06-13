package com.example.hammingweights1;


        import org.junit.jupiter.api.Test;
        import static org.junit.jupiter.api.Assertions.assertEquals;

class Hammingweights1ControllerTest {

    @Test
    public void testHammingWeight() {
        Hammingweights1Controller.defaultwebseite controller = new Hammingweights1Controller().new defaultwebseite();

        // Test case 1: n = 11 (binary: 1011), expected result: 3
        int n1 = 11;
        int expected1 = 3;
        int result1 = controller.hammingWeight(n1);
        assertEquals(expected1, result1);

        // Test case 2: n = 0 (binary: 0000), expected result: 0
        int n2 = 0;
        int expected2 = 0;
        int result2 = controller.hammingWeight(n2);
        assertEquals(expected2, result2);

        // Test case 3: n = 15 (binary: 1111), expected result: 4
        int n3 = 15;
        int expected3 = 4;
        int result3 = controller.hammingWeight(n3);
        assertEquals(expected3, result3);

        // Test case 4: n = 1 (binary: 0001), expected result: 1
        int n4 = 1;
        int expected4 = 1;
        int result4 = controller.hammingWeight(n4);
        assertEquals(expected4, result4);

        // Test case 5: n = 234 (binary: 11101010), expected result: 6
        int n5 = 234;
        int expected5 = 6;
        int result5 = controller.hammingWeight(n5);
        assertEquals(expected5, result5);
    }
}
