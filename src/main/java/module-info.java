module com.marrok.schoolmanager {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.ikonli.javafx;
    requires fontawesomefx;
    requires com.calendarfx.view;
    requires java.logging;
    requires org.slf4j;
    requires java.sql;



    opens com.marrok.schoolmanager to javafx.fxml;
    exports com.marrok.schoolmanager;
    exports com.marrok.schoolmanager.controllers.main;
    opens com.marrok.schoolmanager.controllers.main to javafx.fxml;
    exports com.marrok.schoolmanager.controllers.dashboard;
    opens com.marrok.schoolmanager.controllers.dashboard to javafx.fxml;
    exports com.marrok.schoolmanager.controllers;
    opens com.marrok.schoolmanager.controllers to javafx.fxml;
    exports com.marrok.schoolmanager.controllers.signin;
    opens com.marrok.schoolmanager.controllers.signin to javafx.fxml;
}
