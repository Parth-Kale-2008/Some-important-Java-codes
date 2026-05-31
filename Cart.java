import java.util.*;
class Product{
    String name;
    double price;
    int id;
    int quantity;

    Product(String name,double price,int id,int quantity){
        this.name = name;
        this.price = price;
        this.id = id;
        this.quantity = quantity;
    }
}

class Shopping{
    HashMap<Product,Integer> cartItems = new HashMap<>();
    void addProduct(Product p,int quantity){
        cartItems.put(p, cartItems.getOrDefault(p, 0) + quantity);
        System.out.println("Product added to cart");
    }

    void removeProduct(Product p){
        cartItems.remove(p);
        System.out.println("Item removed successfully: ");
    }

    void showCart() {
        double total = 0;

        for (Map.Entry<Product, Integer> item : cartItems.entrySet()) {
            Product p = item.getKey();
            int quantity = item.getValue();
            double cost = p.price * quantity;
            total += cost;

            System.out.println(p.name + " | Qty: " + quantity + " | Price: " + cost);
        }
        System.out.println("Total Amount: ₹" + total);
    }
}

public class Cart{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome user !");

        Product p1 = new Product("Shoes",999,1,1);
        Product p2 = new Product("T-Shirt",1999,2,2);
        Product p3 = new Product("Watch",3999,3,1);

        Shopping cart = new Shopping();

        while(true){
            System.out.println("1.Add Shoes");
            System.out.println("2.Add T_Shirt");
            System.out.println("3.Add Watch");
            System.out.println("4.view cart");
            System.out.println("5.Exit");

            int choice = sc.nextInt();

            switch(choice){
                case 1 -> cart.addProduct(p1, 1);
                case 2 -> cart.addProduct(p2, 1);
                case 3 -> cart.addProduct(p3, 1);
                case 4 -> cart.showCart();
                case 5 ->{
                    System.out.println("thanks for shopping");
                }
                default -> System.out.println("invalid choice:");
            }
        }
    }
}

