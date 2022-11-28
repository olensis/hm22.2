
    public class Bus extends Car{
        public Bus(String brand, String model, double engineCapacity) {
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
            System.out.println(" Пит-Стоп 3 минуты");

        }


        public void bestLapTime() {
            System.out.println(" Лучший круг за 6 минут");

        }


        public void maximumSpeed() {
            System.out.println(" Лучшая скорость 180 км в час");

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


