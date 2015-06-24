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
public class CentreInteretTest extends BaseDaoTest {
	
	@Autowired
	private CentreInteretDao centreInteretDao;
	

    @Before
    public void populateDatabase() {
        Operation operation = Operations.sequenceOf(
    		CommonOperation.DELETE_ALL,
    		CommonOperation.INSERT_REFERENCE_DATA
		);
        DbSetup dbSetup = new DbSetup(destination, operation);
        dbSetup.launch();
    }
    
 
    
}
