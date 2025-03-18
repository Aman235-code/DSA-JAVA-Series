public class Human extends Animal{
    public static void main(String[] args) {
        Human h = new Human();
        h.eat();
        System.out.println(h.food);
        h.sleep();
    }
}
