module com.mycompany.th1_ca2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.th1_ca2 to javafx.fxml;
    exports com.mycompany.th1_ca2;
}
