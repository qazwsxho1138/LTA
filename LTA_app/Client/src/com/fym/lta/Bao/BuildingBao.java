package com.fym.lta.Bao;

import com.fym.lta.dto.BuildingDto;

import java.util.List;

public interface BuildingBao {
    /**
     * insert new Building if it doesn't exists
     * otherwise it updates the exis. once
     */
    public boolean saveBuilding(BuildingDto Building);


    /**
     * search for Building
     */

    public BuildingDto SearchBuilding(String name);

    /**
     * return all Buildings from db
     */

    public List<BuildingDto> listBuilding();

    /**
     * delete a Building
     */
    public boolean deleteBuilding(BuildingDto Building);
}
