public class Bitwiseoperators {
    public static void main(String[] args) {
        //Bitwise & Operator if both input is 1 then only it will become 1
//        a = 5  → 0101
//        b = 3  → 0011
//        a & b = 0001  → 1

        int a=5;
        int b=3;
        System.out.println( "O/p for bitwise  & operator : " + (a & b));

        //
        System.out.println("a << 1 = " + (a << 1)); // 10 left shift
        System.out.println("a >> 1 = " + (a >> 1)); // 2 right shift
        System.out.println("a >>> 1 = " + (a >>> 1)); // 2 unsigned right shift
        System.out.println("****************************");

        //Bitwise | operator : if there is any  1 present then o/p will 1
//        a = 5  → 0101
//        b = 3  → 0011
//        a | b = 0111  → 7
        int c=5;
        int d=3;
        System.out.println("o/p for bitwise |(or) operator : " + (c | d));

//        Bitwise XOR (^)
//
//✔ Gives 1 if bits are different
//✔ Useful for swapping numbers without temp variable
//
//                a = 5  → 0101
//        b = 3  → 0011
//        a ^ b = 0110  → 6
        int e=5;
        int f=3;
        System.out.println("o/p for bitwise (^) Xor : " + (e ^f));

        //Bitwise not (~)
//        It will inverts bits
//        a = 5 (0101)
//        ~a = ...1010 (two's complement) = -6

        int g=5;
        System.out.println(~g);
    }
}
