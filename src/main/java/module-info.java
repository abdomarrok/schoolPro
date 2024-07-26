module com.marrok.schoolmanager {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.ikonli.javafx;
    requires fontawesomefx;
    requires com.calendarfx.view;
    requires java.logging;
    requires org.slf4j;
    requires java.persistence;
    requires org.hibernate.orm.core;
    requires java.naming;
    requires java.sql;
    requires net.bytebuddy;
    requires java.xml.bind;

    opens com.marrok.schoolmanager to javafx.fxml;
    exports com.marrok.schoolmanager;
    exports com.marrok.schoolmanager.controllers.main;
    opens com.marrok.schoolmanager.controllers.main to javafx.fxml;
    exports com.marrok.schoolmanager.controllers.dashboard;
    opens com.marrok.schoolmanager.controllers.dashboard to javafx.fxml;
    exports com.marrok.schoolmanager.controllers;
    opens com.marrok.schoolmanager.controllers to javafx.fxml;
}
