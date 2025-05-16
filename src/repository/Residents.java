package repository;


import data.model.Resident;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Residents implements ResidentRepository{
    private List<Resident> residents = new ArrayList<Resident>();

    @Override
    public Resident save(Resident resident) {
        residents.add(resident);
        return resident;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Optional<Residents> findById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Residents> findByFullName(String firstName) {
        return List.of();
    }

    @Override
    public long count() {
        return residents.size();
    }

    @Override
    public List<Residents> findAll() {
        return List.of();
    }
}
