package com.company;

public class BuildingEngineer
{

    private HouseBuilder builder;

    public BuildingEngineer(HouseBuilder builder)
    {
        this.builder = builder;
    }

    public void constructHouse()
    {
        this.builder.buildWalls();
        this.builder.buildDoors();
        this.builder.buildWindows();
        this.builder.buildRoof();
        this.builder.buildGarage();
    }

    public House getHouse()
    {
        return this.builder.getHouse();
    }
}
