package com.epam.country;

public class Runner {
    public static void main(String[] args) {
        Country belarus = new Country("Belarus", "Minsk");
        belarus.addRegions(new Region(RegionType.MINSK_REGION, 39854, 45654354),
                new Region(RegionType.VITEBSK_REGION, 40051, 4564554),
                new Region(RegionType.BREST_REGION, 32786, 7685645),
                new Region(RegionType.GOMEL_REGION, 40372, 52356454),
                new Region(RegionType.MOGILEV_REGION, 29068, 3456424),
                new Region(RegionType.GRODNO_REGION, 25127, 3576345));
        belarus.printCapital();
        belarus.printNumberOfRegions();
        belarus.printArea();
        belarus.printRegionalCenter();
    }
}
