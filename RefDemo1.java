import java.math.BigDecimal;
import java.math.BigInteger;

class RefDemo1{
    public static void main(String[] args) {
        BigDecimal bd = new BigDecimal("10098989898898898980000.2000343");
        BigInteger bg = new BigInteger("100000000000000000000");
        BigInteger bg2 = new BigInteger("200000000000000000000");
        BigInteger b3 = bg.add(bg2);
        System.out.println(b3);
        Float ff = 90.20F;
        Long rr = 10000L;
        Character r11 = 'A';
        if(Character.isAlphabetic('A')){

        }
        int x = 100;
        x++;
        byte e = (byte)x;
        Integer w = 1000;
        System.out.println(Integer.toHexString(1000));
        System.out.println(w.toString());
        byte g = w.byteValue();
        float bb = w.floatValue();

    }
}