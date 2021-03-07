package com.company;

public class Builder
{
    public static void main(String[] args)
    {
        HouseBuilder treeHouseBuilder = new TreeHouseBuilder();

        BuildingEngineer buildingEngineer = new BuildingEngineer(treeHouseBuilder);

        buildingEngineer.constructHouse();
        House house = buildingEngineer.getHouse();
        System.out.println(house);
    }
}
