package ormi_0614.interfaceAnimal;

public class Lion extends Animal implements Predator {
    @Override
    public String getFood() {
        return "feed fish";
    }
}
