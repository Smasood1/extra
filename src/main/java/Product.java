public class Product {



    public double discountCalculator(double price, int discountAmount){
        double percent = (double)discountAmount/100;
        return (price * (1 - percent));

    }









}
