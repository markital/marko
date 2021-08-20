package lesson2;

public class Wallet {
    private int sum;
    private String type;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Wallet(int sum, String type) {
        this.sum = sum;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "sum=" + sum +
                ", type='" + type + '\'' +
                '}';
    }
}

