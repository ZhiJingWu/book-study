package BCZJ;

public class demo0102 {
    public static void main(String[] args) {
        int a = 0b1010; // 10 in binary: 1010
        int b = 0b1100; // 12 in binary: 1100

        int and = a & b; // result is 1000 (8 in decimal)
        System.out.println(and);

        int or = a | b; // result is 1110 (14 in decimal)
        System.out.println(or);

        int xor = a^b; // result is 0110 (6 in decimal)
        System.out.println(xor);

        //  Question
        int notA = ~a; // result is 0101 (5 in decimal)
        int notB = ~b; // result is 0011 (3 in decimal)
        System.out.println(notA);
        System.out.println(notB);

        int leftShitA = a << 1; // 10100 ->  20
        int leftShitB = b << 2; // 1100 00  ->  48
        System.out.println("leftShitA: " + leftShitA);
        System.out.println("leftShitB: " + leftShitB);

        int rightShitA = a >> 1; // 0101 ->  5
        int rightShitB = b >> 2; // 0011  ->  3
        System.out.println("rightShitA: " + rightShitA);
        System.out.println("rightShitB: " + rightShitB);


        int noSymbolRightShitA = a >>> 1; // 0101 ->  5
        int noSymbolRightShitB = b >>> 2; // 0011  ->  3
        System.out.println("noSymbolRightShitA: " + noSymbolRightShitA);
        System.out.println("noSymbolRightShitB: " + noSymbolRightShitB);
    }
}
