public class Main {
    public static void main(String args[]) {
        // 1) Tworzymy instancje konkretnych builderów
        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();

        //2) Tworzymy instancję klasy HouseDirector i przekazujemy wybranego houseBuildera w konstruktorze
        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);
        //3) "Budujemy dom
        smallHouseDirector.buildHouse();

        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);
        bigHouseDirector.buildHouse();

        //4) Tworzymy konkretne instancje domów
        House smallHouse = smallHouseDirector.getHouse();
        House bigHouse = bigHouseDirector.getHouse();

        System.out.println(smallHouse);
        System.out.println(bigHouse);

    }
}
