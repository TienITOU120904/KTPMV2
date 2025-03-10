module daihocmo.javafxenglishapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens daihocmo.javafxenglishapp to javafx.fxml;
    exports daihocmo.javafxenglishapp;
    exports daihocmo.pojo;
}
