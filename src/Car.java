import java.util.*;

public abstract class Car {
        public  String categori;
        private String Brand;
        private String Model;
        private double engineCapacity;
        public static final String CATEGORI_B = "Категория Б";
        public static final String CATEGORI_С = "Категория С";
        public static final String CATEGORI_D = "Категория D";
        private Set<Car> Race;
        private Set<Driver> drivers;
        private Set<Mechanik> mechanics;
        private Set<LegalSponsor> legalSponsors;
        private Set<physicalSponsor> physicalSponsors;


        public Set<Mechanik> getMechanics() {
            return mechanics;
        }

        public Set<LegalSponsor> getLegalSponsors() {
            return legalSponsors;
        }

        public Set<physicalSponsor> getPhysicalSponsors() {
            return physicalSponsors;
        }

        public Car(String brand, String model, double engineCapacity) {
            Brand = brand;
            Model = model;
            this.engineCapacity = engineCapacity;
            Race = new HashSet<>();
            drivers = new HashSet<>();
            mechanics = new HashSet<>();
            legalSponsors = new HashSet<>();
            physicalSponsors = new HashSet<>();


            if (model == null ||  model.isBlank())
                System.out.println("Неверное значение");
            if (brand == null ||  brand.isBlank())
                System.out.println("Неверное значение");
            if (engineCapacity <= 0)
                System.out.println("Неверное значение");

        }

        public void addDriver(Driver<?> driver) {
            drivers.add(driver);

        }

        public void addMechanik(Mechanik<?>... mechaniks) {
            this.mechanics.addAll(Arrays.asList(mechaniks));

        }

        public Set<Driver> getDrivers() {
            return drivers;
        }

        public void addLegal(LegalSponsor<?> legalSponsor) {
            legalSponsors.add(legalSponsor);

        }

        public void addPhysics(physicalSponsor<?> physicalSponsor) {
            physicalSponsors.add(physicalSponsor);

        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return physicalSponsors.equals(car.physicalSponsors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(physicalSponsors);
    }

    public Set<Car> getRace() {
            return Race;
        }

        public String getBrand() {
            return Brand;
        }

        public String getModel() {
            return Model;
        }

        public double getEngineCapacity() {
            return engineCapacity;
        }

        public abstract void beginMovement();

        protected abstract void completeMovement();


        protected void printInfo() {
            System.out.println(" Модель " + getModel() + " Бренд " + getBrand() + " Объем двигетеля" + engineCapacity);
        }

        public boolean sto() {
            return false;
        }

        public abstract void repair();
    }




