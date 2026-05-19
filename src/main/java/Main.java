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

        System.out.printf("Общая сумма товаров без скидки: %.2f%n", cart.totalPrice());
        System.out.printf("Общая сумма товаров со скидкой: %.2f%n", cart.discountPrice());
        System.out.printf("Общая сумма всех вегетарианских продуктов без скидки: %.2f%n", cart.vegPrice());
    }
}
