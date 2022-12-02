import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Mechanik<Car> vova = new Mechanik<>("Владимир", "Петров", "Лучшая");
        LegalSponsor<Car> ph = new LegalSponsor<>("Роснефть", 200000);

        Bus mersedes = new Bus("Мерседес", " 151", 4);
        Bus lada = new Bus("Лада", "112", 3);
        Bus audi = new Bus("Ауди", " АР22", 5);
        Bus kia = new Bus("Киа", " А5", 3);
        kia.addDriver(new Driver<>("Николаев Николай Николевич", "да", 7));
        kia.addMechanik(new Mechanik<>("Петр", "Иванов", "Юниверсал"));
        kia.addLegal(new LegalSponsor<>("Бюджети компани", 10500));
        kia.addMechanik(vova);
        kia.addMechanik(vova);
        kia.addMechanik(vova);



        PassengerCars lada1 = new PassengerCars("Лада", " Гранта", 1.5);
        PassengerCars volga = new PassengerCars(" Лада", " Волга", 2);
        PassengerCars spectra = new PassengerCars("Киа", " Спектра", 2);
        PassengerCars bmw = new PassengerCars("БМВ", " i8", 3);
        bmw.addDriver(new Driver<PassengerCars>(" Иванов Иван Иванович", "да", 10));
        bmw.addMechanik(new Mechanik<>("Николай", "Иванов", "Вагнер"));
        bmw.addPhysics(new physicalSponsor<>("Екатерина", 20000));

        Cargo cargo = new Cargo("Лада", " Газель", 3.5);
        Cargo cargo1 = new Cargo(" Хэндай", " Солярис", 2.5);
        Cargo Hyundai = new Cargo(" Хэндай", " Спортейдж", 3);
        Cargo g5 = new Cargo(" Ауди", " g5", 2);
        g5.addDriver(new Driver<>("Боб", "да", 5));
        g5.addMechanik(new Mechanik<>("Александр", "Зотов", "Пирро"));
        g5.addLegal(new LegalSponsor<>("Владимир", 5000));

        Set<Car> cars = Set.of(bmw, kia, g5);
        for (Car car : cars) {
            printInfo(car);

        }


    }

    private static void printInfo(Car car) {

        System.out.println("Информация по машине " + car.getBrand() + car.getModel());
        System.out.println("Водители:");
        for (Driver<?> driver : car.getDrivers()) {
            System.out.println(driver.getFio());
                    System.out.println("Механики :");
                    for (Mechanik<?> mechanik : car.getMechanics()) {
                        System.out.println(mechanik.getName() + mechanik.getSurname() + mechanik.getCompany());
                    }
                }

            }
        }

