
    public class PassengerCars extends Car implements Competing, ICanDrive {

        public PassengerCars(String brand, String model, double engineCapacity) {
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


        @Override
        public void pitStop() {
            System.out.println(" Пит-Стоп 2 минуты");

        }

        @Override
        public void bestLapTime() {
            System.out.println(" Лучший круг за  5 минут ");

        }

        @Override
        public void maximumSpeed() {
            System.out.println(" Максимум 200 км в час");

        }
        public void startMoving() {

        }

        public void stop() {
        }


        public void refuel() {

        }


        public void driver(String categori) {

        }

    }

