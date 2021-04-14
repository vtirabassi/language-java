package functional.recursividade;

public class TailCall {

    public static void main(String[] args) {
        System.out.println(fatorialA(5));
    }

    private static int fatorialA(int value) {
        return fatorialTailCall(value, 1);
    }

    private static int fatorialTailCall(int value, int valueBase) {
        if (value == 0)
            return valueBase;

        return fatorialTailCall(value - 1, valueBase*value);
    }
}
