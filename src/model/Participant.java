package model;

import controller.CourseController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.event.ActionEvent;

public class Participant {
    private int partizip_id;
    private String partizip_name;
    private String partizip_lastname;

    public Participant(String partizip_name, String partizip_lastname) {
        this.partizip_name = partizip_name;
        this.partizip_lastname = partizip_lastname;
    }
    //------------------------------------------
    ObservableList<Participant> participants = FXCollections.observableArrayList();
    //--------------metoda wpisujaca uczestnikow na liste----------
    private void insertParticipantsintoTableView(){
     //   col_partizip_name.setCellValueFactory(new PropertyValueFactory<Participant, String>("particip_name"));
    //    col_partizip_lastname.setCellValueFactory(new PropertyValueFactory<Participant, String>("particip_lastname"));
     //   tbl_particip.setItems(participants);

    }




    public int getPartizip_id() {
        return partizip_id;
    }

    public void setPartizip_id(int partizip_id) {
        this.partizip_id = partizip_id;
    }

    public String getPartizip_name() {
        return partizip_name;
    }

    public void setPartizip_name(String partizip_name) {
        this.partizip_name = partizip_name;
    }

    public String getPartizip_lastname() {
        return partizip_lastname;
    }

    public void setPartizip_lastname(String partizip_lastname) {
        this.partizip_lastname = partizip_lastname;
    }
}
