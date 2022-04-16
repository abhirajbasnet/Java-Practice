public class Room {
    private int rooms;
    private Kitchen kitchen;

    public Room(int rooms, Kitchen kitchen) {
        this.rooms = rooms;
        this.kitchen = kitchen;
    }

    public void openTheRoom(){
        System.out.println("Opening the Door");
        kitchen.openTheDoor();
    }

    public int getRooms() {
        return rooms;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }
}
