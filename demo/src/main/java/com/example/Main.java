public class Main {
    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println(myMinIntValue - 1);

        System.out.println("lowest int held in mem is" + myMinIntValue);
        System.out.println("highest int is " + myMaxIntValue);


        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("byte min value is " + myMinByteValue);
        System.out.println("byte max value is " + myMaxByteValue);


        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("short min value is " + myMinShortValue);
        System.out.println("short max value is " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("long min value is " + myMinLongValue);
        System.out.println("long max value is " + myMaxLongValue);

        

    }
}
