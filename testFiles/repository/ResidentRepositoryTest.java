package repository;

import data.model.Resident;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResidentRepositoryTest {
    @BeforeEach
    public void  setUp() {
        Residents residents = new Residents();
    }
    @Test
    public void testThatCountIsZero_beforeResidentCreation() {
        Residents residents = new Residents();
        residents.count();
        assertEquals(0, residents.count());
    }
    @Test
    public void testThatCountIsOne_afterResidentCreation() {
        Residents residents = new Residents();
        Resident resident1 = new Resident();
        residents.save(resident1);
        assertEquals(1, residents.count());

    }
    @Test
    public void saveOneResident_findByIdReturn() {
        Residents residents = new Residents();
        Residents sevedResident =  residents.save(residents);
        Residents foundResident =  residents.findById(sevedResident.g);
    }

}