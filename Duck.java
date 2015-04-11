
public class Duck extends LandAnimal implements Animal, WaterAnimal {

    @Override
    public String getHello() {
        return "Quack";
    }

    @Override
    public int getNumberOfLegs() {
        return 2;
    }

    @Override
    public boolean hasATail() {
        return false;
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
        return false;
    }

    @Override
    public boolean laysEggs() {
        return true;
    }
}