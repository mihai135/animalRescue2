package org.fasttrackit.persistence;

import org.fasttrackit.domain.Animals;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class animalRescueRepository {

    public void createAnimals (Animals animals) throws SQLException, IOException, ClassNotFoundException {
        Connection connection = DatabaseConfiguration.getConnection();
        String insertSQL = "INSERT INTO animals ( `name`, age, health, hunger, hapiness, favFood, prefActivity) " +
                "VALUES(?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
        preparedStatement.setString(1, animals.getName());
        preparedStatement.setInt(2, animals.getAge());
        preparedStatement.setInt(3, animals.getHealth());
        preparedStatement.setInt(4, animals.getHunger());
        preparedStatement.setInt(5, animals.getHappiness());
        preparedStatement.setString(6, animals.getFavFood());
        preparedStatement.setString(7, animals.getPrefActivity());

        preparedStatement.executeUpdate();

    }
}
