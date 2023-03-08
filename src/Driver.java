public class Driver {
    public static void main(String[] args) {
        Penguin pororo = new Penguin();

        pororo.name="뽀로로";
        pororo.habitat ="남금";

        pororo.showName();
        pororo.showHabitat();

        Animal pingu = (Animal) new Penguin();
        pingu.name="핑구";
        ((Penguin) pingu).habitat = "EBS";
        pingu.showName();
        ((Penguin) pingu).showHabitat();


        Penguin penguin = new Penguin();
        Animal animal = penguin;
        Penguin happyfeet = (Penguin) animal;
        happyfeet.name="해피핏";
        happyfeet.habitat="몰라";

        happyfeet.showHabitat();
    }
}
