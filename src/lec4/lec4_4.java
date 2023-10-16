package lec4;

public class lec4_4 {
    public static void main(String[] args) {
        int byte_size = Byte.SIZE;
        int int_size1 = Integer.SIZE / byte_size;
        int float_size = Float.SIZE / byte_size;

        System.out.println("Size of int type is " + int_size1 + " bytes.");
        System.out.println("Size of float type is " + float_size + " bytes.");


        char c = 'a';
        char c_ = '신';
        String string = new String(new char[10]);

        int charSize = Character.BYTES;  // 2 bytes
        int strSize = string.length() * Character.BYTES;  // 20 bytes

        System.out.println("Size of char type is " + charSize + " bytes.");
        System.out.println("Size of string is " + strSize + " bytes.");
        System.out.print("Hello, w\0orld\n");
    }
}