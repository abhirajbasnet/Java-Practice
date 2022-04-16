public class Main {
    public static void main(String[] args) {

        Kitchen kitchen = new Kitchen("Pan",2, "Spices", 4);
        Room room = new Room(4, kitchen);
        House house = new House("Anzac Avenue", 2, room, kitchen);
        house.openRoom();

    }

}
