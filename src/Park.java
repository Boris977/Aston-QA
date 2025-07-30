public class Park {

    class Attraction {
        String name;
        String workingHours;
        double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Атракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + "₽");
            System.out.println("------------------------------");
        }
    }

    public static void main(String[] args) {
        Park park = new Park();

        Park.Attraction rollerCoaster = park.new Attraction("Американские горки", "10:00–18:00", 350);
        Park.Attraction ferrisWheel = park.new Attraction("Колесо обозрения", "11:00–20:00", 250);
        Park.Attraction hauntedHouse = park.new Attraction("Дом с привидениями", "15:00–22:00", 300);

        rollerCoaster.printInfo();
        ferrisWheel.printInfo();
        hauntedHouse.printInfo();
    }
}