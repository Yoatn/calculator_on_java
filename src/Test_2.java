final class MyResult {
    private final int first;
    private final int second;

    public MyResult(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
}

// ...

public static MyResult something() {
    int number1 = 1;
    int number2 = 2;

    return new MyResult(number1, number2);
}
    public static void main(String[] args) {
        MyResult result = something();
        System.out.println(result.getFirst() + result.getSecond());
}
