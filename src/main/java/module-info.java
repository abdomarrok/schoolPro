module com.marrok.schoolmanager {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.ikonli.javafx;
    requires fontawesomefx;
    requires com.calendarfx.view;
    requires java.logging;
    requires org.slf4j;

    opens com.marrok.schoolmanager to javafx.fxml;
    exports com.marrok.schoolmanager;
    exports com.marrok.schoolmanager.controllers.main;
    exports com.marrok.schoolmanager.controllers.dashboard;
    opens com.marrok.schoolmanager.controllers.dashboard to javafx.fxml;
    opens com.marrok.schoolmanager.controllers.main to javafx.fxml;
}