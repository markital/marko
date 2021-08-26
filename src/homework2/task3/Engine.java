package homework2.task3;

public class Engine {
    private String model;
    private int volume;
    private int power;

    public Engine(String model, int volume, int power) {
        this.model = model;
        this.volume = volume;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", volume=" + volume +
                ", power=" + power +
                '}';
    }
}
