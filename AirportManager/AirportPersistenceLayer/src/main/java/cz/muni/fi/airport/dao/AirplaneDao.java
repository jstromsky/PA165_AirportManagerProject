package cz.muni.fi.airport.dao;

import cz.muni.fi.airport.entity.Airplane;
import java.util.Date;
import java.util.List;

/**
 * Interface for Data Access Object for entity Airplane
 *
 * @author Jakub Stromský
 */
public interface AirplaneDao {
    
    /**
     * Creates new entity of Airplane
     * 
     * @param a airplane to be persisted
     */
    public void create(Airplane a);
    
    /**
     * Removes entity of Airplane
     * 
     * @param a airplane to be removed
     */
    public void delete(Airplane a);
    
    /**
     * Updates entity of Airplane
     * 
     * @param a airplane to be updated
     */
    public void update(Airplane a);
    
    /**
     * Finds all entities of Airplane
     * 
     * @return list of Airplane entities
     */
    public List<Airplane> findAllAirplanes();
    
    /**
     * Finds all available entities of Airplane.
     * 
     * @param fromDate date from which airplanes must be available
     * @param toDate date to which airplanes must be available
     * @param origin place where airplane must be
     * @return list of available airplanes in given time interval and place
     */
    public List<Airplane> findAvailableAirplanes(Date fromDate, Date toDate, String origin);
    
    /**
     * Finds entity of Airplane by given identificator
     * 
     * @param id identificator of airplane
     * @return airplane with given ID
     */
    public Airplane findById(Long id);
    
}