
    public class physicalSponsor <T extends Car> {
        private String name;
        private double amount;

        public physicalSponsor(String name, double amount) {
            this.name = name;
            this.amount = amount;
        }

        public String getName() {
            return name;
        }

        public double getAmount() {
            return amount;
        }
        public void sponsoredBy(){
            System.out.println(" Я спонсирую заезд");
        }
    }


