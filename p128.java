import java.util.*;

// Functional Interface
interface onlinebill{
    double apply(double amount);
}

class p128 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        HashMap<String, Double> items = new HashMap<>();
        double total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter item name: ");
            String name = sc.next();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            items.put(name, price);
            total += price;
        }

        HashMap<String, Double> coupon = new HashMap<>();
        coupon.put("SAVE10", 0.10);
        coupon.put("SAVE20", 0.20);
        coupon.put("WELCOME", 0.15);

        System.out.print("Enter coupon code: ");
        String user = sc.next().toUpperCase();

        onlinebill gst = amt -> amt * 0.18;

        onlinebill discount = amt -> (amt > 1000) ? amt * 0.08 : 0.0;

        onlinebill delivery = amt -> (amt > 500) ? 0.0 : 50.0;

        onlinebill couponDiscount = amt -> {
            if (coupon.containsKey(user)) {
                return amt * coupon.get(user);
            } else {
                return 0.0;
            }
        };

        double gstAmt = gst.apply(total);
        double discountAmt = discount.apply(total);
        double couponAmt = couponDiscount.apply(total);
        double deliveryAmt = delivery.apply(total);

        double finalAmount = total + gstAmt - discountAmt - couponAmt + deliveryAmt;

        System.out.println("\n========== Grocery BILL ==========");
        items.forEach((k, v) -> System.out.println(k + " : Rs" + v));

        System.out.println("--------------------------");
        System.out.println("Total Amount     : Rs" + total);
        System.out.println("GST (18%)        : Rs" + gstAmt);
        System.out.println("Discount         : Rs" + discountAmt);

        if (coupon.containsKey(user)) {
            System.out.println("Coupon Applied   : " + user);
            System.out.println("Coupon Discount  : Rs" + couponAmt);
        } else if (!user.equals("NONE")) {
            System.out.println("Invalid Coupon ");
        }

        System.out.println("Delivery Charge  : Rs" + deliveryAmt);
        System.out.println("--------------------------");
        System.out.println("Final Amount     : Rs" + finalAmount);
        System.out.println("=======================================");
    }
}