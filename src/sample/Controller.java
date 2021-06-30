package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML private TableView<Student> table;
    @FXML private TableColumn<Student,Integer> id;
    @FXML private TableColumn<Student, String> name;
    @FXML private TableColumn<Student, String> surname;
    @FXML private TableColumn<Student,Integer> age;

    public ObservableList<Student> list= FXCollections.observableArrayList(
            new Student (1, "Mark","surname1", 22 ),
            new Student (1, "Mark","surname1", 14 ),
            new Student (1, "Mark","surname1", 12 ),
        new Student (1, "Mark","surname1", 20 ),
        new Student (1, "Mark","surname1", 13 )
    );
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       id.setCellValueFactory(new PropertyValueFactory<Student,Integer>("id"));
       name.setCellValueFactory(new PropertyValueFactory<Student,String>("name"));
       surname.setCellValueFactory(new PropertyValueFactory<Student,String>("surname"));
       age.setCellValueFactory(new PropertyValueFactory<Student,Integer>("age"));
        table.setItems(list);
        age.setSortType(TableColumn.SortType.ASCENDING);
        table.getSortOrder().add(age);
        table.sort();
    }
}
