module dev.razafindratelo.bank {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.postgresql.jdbc;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens dev.razafindratelo.bank to javafx.fxml;
    exports dev.razafindratelo.bank;
    exports dev.razafindratelo.bank.controllers;
    exports dev.razafindratelo.bank.controllers.admin;
    exports dev.razafindratelo.bank.controllers.client;
    exports dev.razafindratelo.bank.models;
    exports dev.razafindratelo.bank.views;
}