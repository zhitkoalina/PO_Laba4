import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Dish[] dishesOne = {new Drink("Espresso", 1.50, 500, false),
                new Drink("Latte", 2.55, 800, false),
                new Drink("Milkshake", 3.50, 800, false),
                new Drink("Tea", 1.20, 200, true),
                new Drink("CocaCola", 0.80, 350, true),
                new Toast("Ham", 2.99, 2800, false),
                new Toast("Chicken", 2.99, 2500, false),
                new Toast("Tuna", 3.99, 2100, false),
                new Toast("Cheese", 1.99, 1800, false),
                new Toast("Avocado", 1.99, 1500, true)};
        Menu menuOne = new Menu(dishesOne);

        Dish[] dishesTwo = {new Drink("Rom", 5.60, 200, true),
                new Drink("Martini", 8.59, 500, true),
                new Drink("Vodka", 3.54, 300, true)};
        Menu menuTwo = new Menu(dishesTwo);

        Menu[ ] menus = {menuOne, menuTwo};

        Scanner scan = new Scanner(System.in);
        int x = 0;
        String s ="";

        while (!"4".equals(s)){
            System.out.println("\n\nВведите пункт");
            System.out.println("1. Вывести все меню");
            System.out.println("2. Вывести все vegan friendly блюда");
            System.out.println("3. Подсчитать среднюю стоимость блюд с калорийностью более 300");
            System.out.println("4. Выход");
            s = scan.next();

            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e){
                System.out.println("Ошибка ввода");
            }

            switch (x){
                case 1:
                    for (Menu menu : menus) {
                        System.out.println("\n\n\nБлюда меню:");
                        for (Dish dish : menu.dishes) {
                            dish.display();
                        }
                    }
                    break;
                case 2:
                    for (Menu menu : menus) {
                        System.out.println("\n\n\nВегетарианские блюда меню :");
                        for (Dish dish : menu.dishes) {
                            if (dish.isVegan) {
                                dish.display();
                            }
                        }
                    }
                    break;
                case 3:
                    for (Menu menu : menus) {
                        int count = 0;
                        double sum = 0;
                        for (Dish dish : menu.dishes) {
                            if (dish.calories >= 300) {
                                count = count + 1;
                                sum = sum + dish.price;
                            }
                        }
                        System.out.println("\nCредняя стоимость меню: " + sum / count);
                    }
                    break;
            }
        }
    }
}