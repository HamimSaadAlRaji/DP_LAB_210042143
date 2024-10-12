//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ICondiment condiment = new Milk(new Sugar(new Milk(new latte())));
        System.out.println(condiment.cost());
        System.out.println(condiment.Description());
    }
}