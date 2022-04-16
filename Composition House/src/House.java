public class House {
    private String address;
    private int storey;
    private Room rooms;
    private Kitchen kitchen;

    public House(String address, int storey, Room rooms,Kitchen kitchen) {
        this.address = address;
        this.storey = storey;
        this.rooms = rooms;
        this.kitchen = kitchen;
    }
    public void openRoom(){
       rooms.openTheRoom();
    }
}
