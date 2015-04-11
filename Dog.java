
public class Dog extends LandAnimal implements Animal {

    @Override
    public String getHello() {
        return "Bark";
    }

    @Override
    public int getNumberOfLegs() {
        return 4;
    }

    @Override
    public boolean hasATail() {
        return true;
    }

    @Override
    public boolean isAMammal() {
        return true;
    }

    @Override
    public boolean isCarnivourous() {
        return true;
    }
}
