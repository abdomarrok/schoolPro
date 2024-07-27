package com.marrok.schoolmanager.controllers.dashboard;
import com.marrok.schoolmanager.model.Student;
import com.marrok.schoolmanager.model.StudentsModel;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {

    public TableView<Student> tbData;
    public TableColumn<Student,String> gender;
    public TableColumn<Student, Integer> contact;
    public TableColumn<Student,Integer> year;
    public TableColumn<Student, Integer> id;
    public TableColumn<Student, String> firstName;
    public TableColumn<Student, String> lastName;

    public PieChart pieChart;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        loadChart();
        loadStudents();
    }

    private void loadChart()
    {

        PieChart.Data slice1 = new PieChart.Data("Classes", 213);
        PieChart.Data slice2 = new PieChart.Data("Attendance"  , 67);
        PieChart.Data slice3 = new PieChart.Data("Teachers" , 36);

        pieChart.getData().add(slice1);
        pieChart.getData().add(slice2);
        pieChart.getData().add(slice3);

    }



    private ObservableList<Student> studentsModels = FXCollections.observableArrayList(

            new Student(1,"Amos", "Chepchieng",2004,555555,true,5),
            new Student(2,"Amos2", "Chepchieng2",2005,555555,false,5),
            new Student(3,"Amos3", "Chepchieng3",2006,555555,true,5)
    );


    private void loadStudents()
    {
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        firstName.setCellValueFactory(new PropertyValueFactory<>("fname"));
        lastName.setCellValueFactory(new PropertyValueFactory<>("lname"));
        gender.setCellValueFactory(celldata->{
           if( celldata.getValue().getGender()){
               return new SimpleStringProperty("male");
           }else {
               return  new SimpleStringProperty("female");
           }
        });
        contact.setCellValueFactory(new PropertyValueFactory<>("contact"));
        year.setCellValueFactory(new PropertyValueFactory<>("year"));
        tbData.setItems(studentsModels);
    }

}
