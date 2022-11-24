public class Driver <T extends Car& ICanDrive>{
    private String fio;
    private String availabilityOfRights;
    private double experience;


    public Driver(String fio, String availabilityOfRights, double experience) {
        this.fio = fio;
        this.availabilityOfRights = availabilityOfRights;
        this.experience = experience;

    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getAvailabilityOfRights() {
        return availabilityOfRights;
    }

    public void setAvailabilityOfRights(String availabilityOfRights) {
        this.availabilityOfRights = availabilityOfRights;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public void startMoving() {
        System.out.println(" Я начинаю движение");

    }

    public void stop() {
        System.out.println(" Я остановился");

    }

    public void refuel() {
        System.out.println(" Я заправляюсь ");

    }

    public void driveB(T car) {
        System.out.println(" Я вожу машину "+ car.getBrand() + car.getModel());

        System.out.println("Я имею права категории " + Car.CATEGORI_B + " и я буду учавствовать в заезде");

    }

    public void driveC(T car) {
        System.out.println(" Я вожу машину"+ car.getModel() + car.getBrand() );

        System.out.println("Я имею права категории " + Car.CATEGORI_С + " и я буду учавствовать в заезде");

    }

    public void driveD(T car) {
        System.out.println(" Я вожу машину"+ car.getModel() + car.getBrand());

        System.out.println("Я имею права категории " + Car.CATEGORI_D+ " и я буду учавствовать в заезде");
    }
}

