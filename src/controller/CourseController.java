package controller;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Course;

import java.time.LocalDate;
import java.util.Observable;


public class CourseController {
        // Obiekt listy kursow
        ObservableList<Course> courses = FXCollections.observableArrayList();
        public static int id;
        //----------------------------------
        @FXML
        private TableView<Course> tbl_course;

        @FXML
        private TableColumn<Course, String> call_course_name;

        @FXML
        private TableColumn<Course, String> call_course_category;

        @FXML
        private TextField tf_course_name;

        @FXML
        private TextField tf_course_category;

        @FXML
        private DatePicker dp_course_date;

        @FXML
        private TextField df_trener_name;

        @FXML
        void addCourse(ActionEvent event) {
                //walidacja danych
                if (!tf_course_name.getText().equals("") && !tf_course_category.getText().equals("") && dp_course_date.getValue() != null) {
                        //pobranie wartosci z pola TextField
                        String course_name = tf_course_name.getText();
                        String course_category = tf_course_category.getText();
                        LocalDate course_date = dp_course_date.getValue();
                        String course_trainer = df_trener_name.getText();
                        //utworzenie obiektu klasy Course
                        Course c = new Course(++id, course_name, course_category, course_date, course_trainer);
                        //wprowadzenie obiektu klasy Course do listy kursow
                        courses.add(c);
                        //odswiezenie TableView
                        insertCoursesIntoTableView();
                        tf_course_name.clear();
                        tf_course_category.clear();
                        dp_course_date.setValue(null);
                        df_trener_name.clear();

                } else {
                        Alert a = new Alert(Alert.AlertType.ERROR);
                        a.setTitle("Blad");
                        a.setHeaderText("Blad dodawania nowego kursu");
                        a.setContentText("Musisz podac wszystkie dane w celu dodania nowego kursu");
                        a.show();
                }
        }
                @FXML
                void deleteCourse (ActionEvent event){

                }

                @FXML
                void getCourse (ActionEvent event){


                }
                //----------metoda do wprowadzenia zawartosci listy kursow do tabelki---------
                private void insertCoursesIntoTableView () {
                        //konfiguracja zmiennych do kolumn
                        call_course_name.setCellValueFactory(new PropertyValueFactory<Course, String>("course_name"));
                        call_course_category.setCellValueFactory(new PropertyValueFactory<Course, String>("course_category"));
                        //wprowadzenie danych do tabeli z listy ObservableList
                        tbl_course.setItems(courses);
                }
                //---------------------------------------
                //metoda ktora uruchamia

        }



