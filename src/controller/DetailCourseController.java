package controller;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import model.Participant;

import java.awt.event.ActionEvent;


public class DetailCourseController {
    //@FXML
   // void saveParticipant(ActionEvent event) {
        //    String partizip_name = tf_particip_name.getText();
        //    String partizip_lastname = tf_particip_lastname.getText();
        //   Participant p = new Participant((partizip_name, partizip_lastname));
        //  CourseController.c_selected.addParticipant(p);
        //   participants.add(p);
        //  lbl_course_particip.setText(String.valueOf(CourseController.c_selected.getNoParticipants()));
        // @FXML
        // void delete participant(ActionEvent event){
        // Participant p_deleted = tbl_particip.getSelectionModel().getSelectedItems();
        // CourseController.c_selected.deleteParticipant(p_deleted);
        // participants.remove(p_deleted);
        // lbl_course_particip.setText(String.valueOf(participants.size());
        // insertParticipantsIntoTableView();
    
        @FXML
        private Label lbl_course_name;

        @FXML
        private Label lbl_course_cateogry;

        @FXML
        private Label lbl_course_date;

        @FXML
        private Label lbl_course_trainer;

        @FXML
        private TableColumn<Participant, String> col_partizip_name;

        @FXML
        private TableColumn<Participant, String> col_partizip_lastname;

        @FXML
        private Label lbl_particip_name;

        @FXML
        private Label lbl_partizip_lastname;


        public void initialize(){
            //participants.addAll(CourseController.c_selected.getCourse_participants());
            //ustawienie danych wybranego kursu
            lbl_course_name.setText(CourseController.c_selected.getCourse_name());
            lbl_course_cateogry.setText(CourseController.c_selected.getCourse_category());
            lbl_course_date.setText(CourseController.c_selected.getCourse_date().toString());
            lbl_course_trainer.setText(CourseController.c_selected.getCourse_trainer());


        }

    }

