package org.fasttrackit.persistance;

;
import org.fasttrackit.domain.Animal;
import org.fasttrackit.domain.Game;

import java.io.IOException;
import java.sql.*;


public class AnimalRescuerRepository {


    public void createAnimal(String pet_name, String pet_type, double age, double pet_health_level,
                             double pet_hunger_level, String pet_favorite_food, String pet_favorite_activity, String pet_medicine_type) throws SQLException, IOException, ClassNotFoundException {
        String insertSql = "INSERT INTO pet (pet_name, pet_type, pet_age, pet_health_level, pet_hunger_level, pet_favorite_food, pet_favorite_activity, pet_medicine_type) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        //try with resources

        try (Connection connection = DatabaseConfiguration.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertSql)
        ) {
            preparedStatement.setString(1, pet_name);
            preparedStatement.setString(2, pet_type);
            preparedStatement.setDouble(3, age);
            preparedStatement.setDouble(4, pet_health_level);
            preparedStatement.setDouble(5, pet_hunger_level);
            preparedStatement.setString(6, pet_favorite_food);
            preparedStatement.setString(7, pet_favorite_activity);
            preparedStatement.setString(8, pet_medicine_type);


            preparedStatement.executeUpdate();


        }

    }





}














