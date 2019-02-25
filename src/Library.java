public class Library {

    private String name;
    private int Rage;

    public Library() {
    }

    public Library(String name, int rage) {
        this.name = name;
        Rage = rage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRage() {
        return Rage;
    }

    public void setRage(int rage) {
        Rage = rage;
    }
}
