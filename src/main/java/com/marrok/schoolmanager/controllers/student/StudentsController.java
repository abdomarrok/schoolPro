package com.marrok.schoolmanager.controllers.student;

import com.marrok.schoolmanager.model.Student;
import com.marrok.schoolmanager.model.StudentsModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentsController implements Initializable {

    public TableView<Student> tbData;
    public TableColumn<Student,Boolean> gender;
    public TableColumn<Student, Integer> contact;
    public TableColumn<Student,Integer> year;


    public TableColumn<Student, Integer> studentId;


    public TableColumn<Student, String> firstName;

    public TableColumn<Student, String> lastName;
    public StudentsController()
    {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        studentId.setCellValueFactory(new PropertyValueFactory<>("StudentId"));
        firstName.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<>("LastName"));

        tbData.setItems(studentsModels);
    }

    private ObservableList<Student> studentsModels = FXCollections.observableArrayList(
            new Student(1,"Amos", "Chepchieng",2004,555555,true,5),
            new Student(2,"Amos2", "Chepchieng2",2005,555555,true,5),
            new Student(3,"Amos3", "Chepchieng3",2006,555555,true,5)
    );


}
