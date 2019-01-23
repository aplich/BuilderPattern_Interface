public class BigHouseBuilder implements HouseBuilder {
    private House house;

    public BigHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildWalls() {
        this.house.setWalls("Duże ściany");
    }

    @Override
    public void buildFloors() {
        this.house.setFloors("Duże podłogi");
    }

    @Override
    public void buildRooms() {
        this.house.setRooms("Duże pokoje");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("Duży dach");
    }

    @Override
    public void buildWindows() {
        this.house.setWindows("Duże okna");
    }

    @Override
    public void buildDoors() {
        this.house.setDoors("Duże drzwi");
    }

    @Override
    public void buildGarage() {
        this.house.setGarage("Duży garaż");
    }

    @Override
    public House getHouse() {
        return house;
    }
}