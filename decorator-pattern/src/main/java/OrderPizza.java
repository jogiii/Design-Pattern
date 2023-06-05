import com.jogi.pattern.decorator.BasePizza;
import com.jogi.pattern.decorator.Farmhouse;
import com.jogi.pattern.decorator.toppings.ExtraCheese;
import com.jogi.pattern.decorator.toppings.Mushroom;

public class OrderPizza {

    public static void main(String[] args) {
        BasePizza pizza = new Mushroom(new ExtraCheese(new Farmhouse()));
        System.out.printf("your pizza cost is "+pizza.cost());
    }
}
