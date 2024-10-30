package lv.rvt;

public class DecreasingCounter {
    private int value;   // a variable that remembers the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue(){
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        this.value = this.value - 100;
    }

    public void reset() {
        this.value = this.value - 100;
    }
}
