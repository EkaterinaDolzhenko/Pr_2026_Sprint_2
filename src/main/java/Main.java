import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        var meat = new Meat(5,100);
        var redApple = new Apple(10, 50, Colour.RED);
        var greenApple = new Apple(8, 60, Colour.GREEN);

        Food[] items = {meat, redApple, greenApple};

        var cart = new ShoppingCart(items);

        System.out.println("Общая сумма товаров без скидки: " + cart.totalPrice());
        System.out.println("Общая сумма товаров со скидкой: " + cart.discountPrice());
        System.out.println("Общая сумма всех вегетарианских продуктов без скидки: " + cart.vegPrice());
    }
}
