public class SmallHouseBuilder implements HouseBuilder {
    private House house;

    public SmallHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildWalls() {
        this.house.setWalls("Małe ściany");
    }

    @Override
    public void buildFloors() {
        this.house.setFloors("Małe podłogi");
    }

    @Override
    public void buildRooms() {
        this.house.setRooms("Małe pokoje");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("Mały dach");
    }

    @Override
    public void buildWindows() {
        this.house.setWindows("Małe okna");
    }

    @Override
    public void buildDoors() {
        this.house.setDoors("Małe drzwi");
    }

    @Override
    public void buildGarage() {
        this.house.setGarage("Mały garaż");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
