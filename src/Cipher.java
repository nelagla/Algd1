import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: AA
 * Date: 9/27/13
 * Time: 3:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Cipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        int offset = in.nextInt();
        int textKey = TextKey(text);
        String enc = Cipher.encode(text, offset);
        StringBuilder encToBinary = Cipher.encodeToBinary(enc);
        System.out.println(enc);
        System.out.println(textKey);
        //System.out.println(encToBinary);
        System.out.println(Cipher.decode(enc, offset));
    }

    public static String decode(String enc, int offset) {
        return encode(enc, -offset);
    }

    public static String encode(String enc, int offset) {
        offset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
            for (char i : enc.toLowerCase().toCharArray()) {
                if (Character.isLetter(i)) {
                    int j = (i - 'a' + offset) % 26;
                    encoded.append((char) (j + 'a'));
                } else {
                    encoded.append(i);
                }
            }

        return encoded.toString();
    }
    public static StringBuilder encodeToBinary(String enc){
        byte[] bytes = enc.getBytes();
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes){
            int val = b;
            for (int i = 0; i < 8; i++){
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
            binary.append(' ');
        }
        return binary;

    }
    public static int TextKey(String text){
        int textKey = 0;
        char[] textChar = text.toLowerCase().toCharArray();
        for (int i = 0; i < textChar.length; i++){
            textKey += i;
        }
        return textKey;
    }

}
//sort the array