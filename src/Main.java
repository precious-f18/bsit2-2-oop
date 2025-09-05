public class Main {
    public static void main(String[] args) {
        System.out.println("═══ Food Ordering System ═══ \n");
        System.out.println("Creating orders and adding items...");

        Order order1 = new Order("Erika Von");
        try {
            order1.addItem("Pizza", 14.5);
            System.out.println("Item 'Pizza' added successfully");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            order1.addMultipleItems(new String[]{"Burger", "Fries"}, 7.50, 4.25);
            System.out.println("Items added: Burger, Fries");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            order1.addItem("Hotdog", -5.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            order1.addItem("", 4.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Order order2 = new Order("Helena Gracia");
        order2.addMultipleItems(
                new String[]{"Burger", "Fries", "Coke", "Salad", "Ice Cream"},
                6.80, 4.20, 2.25, 5.00, 13.00
        );

        Order order3 = new Order("John Riki");
        order3.addMultipleItems(new String[]{"Pasta", "Juice"}, 13.00, 6.50);

        System.out.println("\nOrder Results:");
        System.out.println(order1.displayOrder());
        System.out.println(order2.displayOrder());
        System.out.println(order3.displayOrder());

        System.out.println("\nTotal orders created: " + Order.getTotalOrders());

        Order largest = order1;
        if (order2.getTotalAmount() > largest.getTotalAmount()) largest = order2;
        if (order3.getTotalAmount() > largest.getTotalAmount()) largest = order3;

        System.out.println("Largest order: " + largest.getCustomerName() + " ($" +
                String.format("%.2f", largest.getTotalAmount()) + ")");
    }
}
