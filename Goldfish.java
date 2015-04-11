
public class Goldfish implements Animal, WaterAnimal {

    @Override
    public String getHello() {
        return null;
    }

    @Override
    public boolean isAMammal() {
        return false;
    }

    @Override
    public boolean isCarnivourous() {
        return false;
    }

    @Override
    public boolean hasGills() {
        return true;
    }

    @Override
    public boolean laysEggs() {
        return true;
    }
}
