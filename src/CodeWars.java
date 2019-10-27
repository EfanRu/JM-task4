import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class CodeWars {
    public static void main(String[] args) {
        AsciiCharSequence as = new AsciiCharSequence(new byte[]{'a', 'b', 'c'});
        System.out.println(as.toString());
    }

    public static class AsciiCharSequence implements java.lang.CharSequence {
        // implementation
        private byte[] arr;

        public AsciiCharSequence(byte[] b) {
            arr = b;
        }

        @Override
        public int length() {
            return arr.length;
        }

        @Override
        public char charAt(int index) {
            return (char) arr[index];
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            byte[] arrCh = Arrays.copyOfRange(arr, start, end);
            return new String(Arrays.copyOfRange(arr, start, end));
        }

        @Override
        public String toString() {
            return new String(arr);
        }
    }


}