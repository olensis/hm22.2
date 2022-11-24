
    public class Cargo  extends  Car{
        public Cargo(String brand, String model, double engineCapacity) {
            super(brand, model, engineCapacity);
        }


        protected void beginMovement() {
            System.out.println( " Я начинаю движение");


        }


        protected void completeMovement() {
            System.out.println(" Я заканчиваю движение");
        }

        @Override
        public void repair() {

        }


        public void pitStop() {
            System.out.println(" Пит-Стоп 1 минуту");

        }


        public void bestLapTime() {
            System.out.println(" Лучшее время круга 10 минут");

        }


        public void maximumSpeed() {
            System.out.println(" Максимальная скоро 150 км в час ");

        }


        public void startMoving() {

        }


        public void stop() {

        }


        public void refuel() {

        }


        public void driver(String categori) {

        }
        public void drive(){
            System.out.println(" Я вожу машину"  + getBrand()   );

            System.out.println("Я имею права категории " + Car.CATEGORI_B);

        }
    }

