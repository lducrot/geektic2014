package com.ninja_squad.geektic.dao;

import static org.junit.Assert.*;

import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.operation.Operation;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * This is example code for a DAO test.
 * @author JB Nizet
 */
public class GeekDaoTest extends BaseDaoTest {
	
	@Autowired
	private GeekDao geekDao;

    @Before
    public void populateDatabase() {
        Operation operation = Operations.sequenceOf(
    		CommonOperation.DELETE_ALL,
    		CommonOperation.INSERT_REFERENCE_DATA
		);
        DbSetup dbSetup = new DbSetup(destination, operation);
        dbSetup.launch();
    }

    @Test
    public void testFindById() throws Exception {
    	Long idAttendu = 1L;
    	
    	Long reponse = geekDao.findById(idAttendu).get(0).getIdGeek();
    	assertEquals(idAttendu, reponse);
    }
    
    @Test
    public void testFindBySexe() throws Exception {
    	String sexeAttendu = "M";
    	
    	String reponse = geekDao.findBySexe(sexeAttendu).get(0).getSexe();
    	assertEquals(sexeAttendu, reponse);
    }
    
    @Test
    public void testfindByCentreInteret() throws Exception {
    	Long idCentreInteretAttendu = 1L;
		
    	Long reponse = geekDao.findByCentreInteret(idCentreInteretAttendu).get(0).getIdGeek();
    	assertEquals(idCentreInteretAttendu, reponse);
    }
    
}
