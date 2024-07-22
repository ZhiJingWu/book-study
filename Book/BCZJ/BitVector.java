package BCZJ;

public class BitVector {
    private int bits;

    public BitVector() {
        this.bits = 0;
    }

    // 设置指定位置的位为1
    public void setBit(int position) {
        bits |= (1 << position);
    }

    // 清除指定位置的位（设为0）
    public void clearBit(int position) {
        bits &= ~(1 << position);
    }

    // 检查指定位置的位是否为1
    public boolean isBitSet(int position) {
        return (bits & (1 << position)) != 0;
    }

    // 打印位向量的二进制表示
    public void printBits() {
        System.out.println(Integer.toBinaryString(bits));
    }

    public static void main(String[] args) {
        BitVector bv = new BitVector();

        bv.setBit(3);
        bv.printBits(); // 1000

        bv.setBit(1);
        bv.printBits(); // 1010

        bv.clearBit(3);
        bv.printBits(); // 0010

        System.out.println(bv.isBitSet(1)); // true
        System.out.println(bv.isBitSet(3)); // false
    }
}
