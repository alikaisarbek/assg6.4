package com.company;

public class BungalowHouseBuilder implements HouseBuilder
{
    private House house;

    public BungalowHouseBuilder()
    {
        this.house = new House();
    }

    @Override
    public void buildWalls()
    {
        house.setWalls("Bungalow walls");
    }

    @Override
    public void buildDoors()
    {
        house.setDoors("Bungalow Doors");
    }

    @Override
    public void buildWindows()
    {
        house.setWindows("Bungalow Windows");
    }

    @Override
    public void buildRoof()
    {
        house.setRoof("Bungalow roof");
    }

    @Override
    public void buildGarage()
    {
        house.setGarage("Bungalow garage");
    }
    public House getHouse()
    {
        return this.house;
    }

}
