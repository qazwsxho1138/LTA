package com.fym.lta.dao;

import com.fym.lta.common.ConnectionFactory;
import com.fym.lta.common.LTAException;
import com.fym.lta.common.Queries;
import com.fym.lta.dto.BuildingDto;
import com.fym.lta.dto.FloorDto;

import com.fym.lta.dto.LocationDto;
import com.fym.lta.dto.LocationTypeDto;

import java.sql.Types;

import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class FloorDaoImp implements FloorDao {
    /**get all floors in building */
    public List<FloorDto> getAll_Floors() {
        List<FloorDto> Floors = null;
        try (JdbcRowSet jdbcRs = RowSetProvider.newFactory().createJdbcRowSet()) {
            jdbcRs.setUrl(ConnectionFactory.getUrl());
            jdbcRs.setUsername(ConnectionFactory.getUsername());
            jdbcRs.setPassword(ConnectionFactory.getPassword());
            jdbcRs.setCommand(Queries.LIST_ALL_FLOORS);
            jdbcRs.execute();

            FloorDto Floor = null;

            while (jdbcRs.next()) {
                if (Floors == null)
                 Floors = new ArrayList<>();
                Floor = new FloorDto();
                Floor.setFloor_id(jdbcRs.getInt(1));
                Floor.setCode(jdbcRs.getString(2));
                Floor.setDescription(jdbcRs.getString(3));
                BuildingDto building = new BuildingDto();
                building.setCode(jdbcRs.getString(4));
                Floor.setBuilding(building);
                
                
                Floors.add(Floor);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Floors;
        }

    /**Delete Floor */
    public boolean delete_Floor(FloorDto Floor) {
        try (JdbcRowSet jdbcRs = RowSetProvider.newFactory().createJdbcRowSet()) {
            jdbcRs.setUrl(ConnectionFactory.getUrl());
            jdbcRs.setUsername(ConnectionFactory.getUsername());
            jdbcRs.setPassword(ConnectionFactory.getPassword());
            jdbcRs.setCommand(Queries.DELETE_FLOOR);
            jdbcRs.setString(1, Floor.getCode());
            jdbcRs.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;

        }
     }

    /**insert Floors in building  */
     public boolean insert_Floor(FloorDto Floor) throws LTAException {
        try (JdbcRowSet jdbcRs = RowSetProvider.newFactory().createJdbcRowSet()) {
            jdbcRs.setUrl(ConnectionFactory.getUrl());
            jdbcRs.setUsername(ConnectionFactory.getUsername());
            jdbcRs.setPassword(ConnectionFactory.getPassword());
            jdbcRs.setCommand(Queries.INSER_NEW_FLOOR);
            jdbcRs.setString(1, Floor.getCode());
            jdbcRs.setString(2, Floor.getDescription());

           
            if (Floor.getInertion_Date() != null)
                jdbcRs.setDate(3, new java.sql.Date(Floor.getInertion_Date().getTime()));
            else
                jdbcRs.setNull(3, java.sql.Types.DATE);


            jdbcRs.setString(4, Floor.getInsertedBy());
             
             
            jdbcRs.setInt(5, Floor.getBuilding().getBuilding_id());


            jdbcRs.execute();

            return true;
        } catch (java.sql.SQLIntegrityConstraintViolationException e) {
            LTAException ex = new LTAException();
            ex.setExactMessage("Floor Already Exists!!!");
            throw ex;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
        }
    
    
    /**Update floor  */    
    public boolean Update_Floor(FloorDto Floor) {
    try (JdbcRowSet jdbcRs = RowSetProvider.newFactory().createJdbcRowSet()) {
        jdbcRs.setUrl(ConnectionFactory.getUrl());
        jdbcRs.setUsername(ConnectionFactory.getUsername());
        jdbcRs.setPassword(ConnectionFactory.getPassword());
        jdbcRs.setCommand(Queries.UPDATE_FLOOR);
       
        jdbcRs.setString(1, Floor.getDescription());
      
        if (Floor.getUpdatedBy() != null)
            jdbcRs.setString(2, Floor.getUpdatedBy());
        else
            jdbcRs.setNull(2, Types.VARCHAR);
        
        if (Floor.getUpdate_Date() != null)
            jdbcRs.setDate(3, new java.sql.Date(Floor.getUpdate_Date().getTime()));
        else
            jdbcRs.setNull(3, java.sql.Types.DATE);
        
        jdbcRs.setInt(4, Floor.getBuilding().getBuilding_id());

        
        jdbcRs.setString(5, Floor.getCode());

        jdbcRs.execute();
        return true;
    } 

    catch (Exception e) {
        e.printStackTrace();
        return false;
    }

    }

 
    /**check if this floor already exists or not!  */
  public boolean isExist(FloorDto Floor) {
    try (JdbcRowSet jdbcRs = RowSetProvider.newFactory().createJdbcRowSet()) {
        jdbcRs.setUrl(ConnectionFactory.getUrl());
        jdbcRs.setUsername(ConnectionFactory.getUsername());
        jdbcRs.setPassword(ConnectionFactory.getPassword());
        jdbcRs.setCommand(Queries.IS_FLOOR_EXIST);
        jdbcRs.setString(1, Floor.getCode());
        jdbcRs.execute();
        if (jdbcRs.next()) {
            return true;
        } else {
            return false;
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return false;
    }
   

    /**search building  */
    public List<FloorDto> searchFloor(String Code) {
        List<FloorDto> Floors = null;

        try (JdbcRowSet jdbcRs = RowSetProvider.newFactory().createJdbcRowSet()) {
            jdbcRs.setUrl(ConnectionFactory.getUrl());
            jdbcRs.setUsername(ConnectionFactory.getUsername());
            jdbcRs.setPassword(ConnectionFactory.getPassword());
            jdbcRs.setCommand(Queries.FLOORS_SEARCH);
            jdbcRs.setString(1, '%' + Code.toLowerCase().trim() + '%');

            jdbcRs.execute();


            while (jdbcRs.next()) {
                if (Floors == null)
                    Floors = new ArrayList<>();

                FloorDto lSerch = new FloorDto();
                lSerch.setFloor_id(jdbcRs.getInt(1));
                lSerch.setCode(jdbcRs.getString(2));
                lSerch.setDescription(jdbcRs.getString(3));
                BuildingDto building = new BuildingDto();
                building.setCode(jdbcRs.getString(4));
                lSerch.setBuilding(building);
                
            Floors.add(lSerch);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Floors;
        }
    
    //this behavior is to list all floors that located inside a specific building
    public List<FloorDto> getFloorsOfBuilding(int building_id){
        List<FloorDto> floor = null;
        try (JdbcRowSet jdbcRs = RowSetProvider.newFactory().createJdbcRowSet()) {

            jdbcRs.setUrl(ConnectionFactory.getUrl());
            jdbcRs.setUsername(ConnectionFactory.getUsername());
            jdbcRs.setPassword(ConnectionFactory.getPassword());
            jdbcRs.setCommand(Queries.FLOOR_FILTER);
            jdbcRs.setInt(1, building_id);
            jdbcRs.execute();
            while (jdbcRs.next()) {
                if (floor == null)
                    floor = new ArrayList<>();
                FloorDto fFilter = new FloorDto();
                fFilter.setFloor_id(jdbcRs.getInt(1));
                fFilter.setCode(jdbcRs.getString(2));
                floor.add(fFilter);}
            } 
        catch (Exception e) {
            e.printStackTrace();
            }

            return floor;
            }

    



}


