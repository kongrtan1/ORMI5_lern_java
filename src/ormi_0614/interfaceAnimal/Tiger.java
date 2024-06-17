package ormi_0614.interfaceAnimal;

public class Tiger extends Animal implements Predator {

    @Override
    public String getFood() {
        return "feed meat";
    }
}
