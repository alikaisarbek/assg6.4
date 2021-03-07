package com.company;

public class TreeHouseBuilder implements HouseBuilder
{
    private House house;

    public TreeHouseBuilder()
    {
        this.house = new House();
    }

    @Override
    public void buildWalls()
    {
        house.setWalls("Tree walls");
    }

    @Override
    public void buildDoors()
    {
        house.setDoors("Tree Doors");
    }

    @Override
    public void buildWindows()
    {
        house.setWindows("Tree Windows");
    }

    @Override
    public void buildRoof()
    {
        house.setRoof("Tree roof");
    }

    @Override
    public void buildGarage() {
        house.setGarage("Tree garage");
    }

    public House getHouse()
    {
        return this.house;
    }
}
