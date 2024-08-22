package org.example;

import org.example.db_top.*;

import java.net.Proxy;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        DBConnection dbConnection = new DBConnection();
        try (Statement statement = dbConnection.connection.createStatement()){
            String sqlQueryForCourses = "SELECT * FROM courses";
            ResultSet resultSet = statement.executeQuery(sqlQueryForCourses);
            while (resultSet.next()){
                Course course = new Course();
                course.setId(resultSet.getInt(1));
                course.setName(resultSet.getString(2));
                course.setDuration(resultSet.getInt(3));
                course.setType(Type.valueOf(resultSet.getString(4)));
                course.setDescription(resultSet.getString(5));
                course.setTeacherId(resultSet.getInt(6));
                course.setStudentsCount(resultSet.getInt(7));
                course.setPrice(resultSet.getInt(8));
                course.setPricePerHour(resultSet.getInt(9));
                System.out.println(course);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try(Statement statement = dbConnection.connection.createStatement()){
            String sqlQueryForPurchaseList = "SELECT * FROM purchaselist";
            ResultSet resultSet = statement.executeQuery(sqlQueryForPurchaseList);
            while (resultSet.next()){
                PurchaseList purchaseList = new PurchaseList();
                purchaseList.setStudentName(resultSet.getString(1));
                purchaseList.setCourseName(resultSet.getString(2));
                purchaseList.setPrice(resultSet.getInt(3));
                purchaseList.setSubscriptionDate(resultSet.getDate(4));

                System.out.println(purchaseList);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try (Statement statement = dbConnection.connection.createStatement()){
            String sqlQueryForStudents = "SELECT * FROM students";
            ResultSet resultSet = statement.executeQuery(sqlQueryForStudents);
            while (resultSet.next()){
                Student student = new Student();
                student.setId(resultSet.getInt(1));
                student.setName(resultSet.getString(2));
                student.setAge(resultSet.getInt(3));
                student.setRegistrationDate(resultSet.getDate(4));
                System.out.println(student);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try (Statement statement = dbConnection.connection.createStatement()){
            String sqlQueryForSubscriptions = "SELECT * FROM subscriptions";
            ResultSet resultSet = statement.executeQuery(sqlQueryForSubscriptions);
            while (resultSet.next()){
                Subscription subscription = new Subscription();
                subscription.setStudentId(resultSet.getInt(1));
                subscription.setCourseId(resultSet.getInt(2));
                subscription.setSubcriptionDate(resultSet.getDate(3));
                System.out.println(subscription);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try (Statement statement = dbConnection.connection.createStatement()){
            String sqlQueryForTeachers = "SELECT * FROM teachers";
            ResultSet resultSet = statement.executeQuery(sqlQueryForTeachers);
            while (resultSet.next()){
                Teacher teacher = new Teacher();
                teacher.setId(resultSet.getInt(1));
                teacher.setName(resultSet.getString(2));
                teacher.setSalary(resultSet.getInt(3));
                teacher.setAge(resultSet.getInt(4));
                System.out.println(teacher);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}