package sixtask;

import java.util.List;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tires;

    public Car(String model, Engine engine, Cargo cargo, List<Tire> tires){
        this.model=model;
        this.engine=engine;
        this.cargo=cargo;

    }
}
