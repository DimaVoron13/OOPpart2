public abstract class Vehicles extends Transport {

    public Vehicles(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void repair() {
        super.repair();
        checkEngine();
    }
}