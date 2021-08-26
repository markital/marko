package homework2.task1;

public enum Gender {
MALE(111), FEMALE(222);
private int id;

    Gender() {
    }

    Gender(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "id=" + id +
                '}';
    }
}
