package org.fasttrackit.service;

import org.fasttrackit.domain.Animals;
import org.fasttrackit.persistence.animalRescueRepository;

import java.io.IOException;
import java.sql.SQLException;

public class animalRescueService {

    private animalRescueRepository animalrescueRepository = new animalRescueRepository();

    public void createAnimals (Animals animals) throws SQLException, IOException, ClassNotFoundException {
        System.out.println(("creating animals entry: " + animals));
        animalrescueRepository.createAnimals(animals);

    }
}
