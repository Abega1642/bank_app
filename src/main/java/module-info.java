module dev.razafindratelo.bank {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens dev.razafindratelo.bank to javafx.fxml;
    exports dev.razafindratelo.bank;
}