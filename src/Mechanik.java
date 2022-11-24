
    public class Mechanik <T extends Car>{
        private String name;
        private String surname;
        private String company;

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public String getCompany() {
            return company;
        }

        public Mechanik(String name, String surname, String company) {
            this.name = name;
            this.surname = surname;
            this.company = company;
        }
        public void sto(T car){
            car.sto();
        }
        public void repair( T car){
            car.repair();
        }

    }

