
    public class LegalSponsor <T extends Car>{
        private String companyName;
        private double amount;

        public LegalSponsor(String companyName, double amount) {
            this.companyName = companyName;
            this.amount = amount;
        }

        public String getCompanyName() {
            return companyName;
        }

        public double getAmount() {
            return amount;
        }
        public void sponsoredBy(){
            System.out.println(" Я спонсирую заезд");
        }

    }


