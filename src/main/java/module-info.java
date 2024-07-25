module com.marrok.schoolmanager {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.ikonli.javafx;
    requires fontawesomefx;
    requires com.calendarfx.view;
    requires java.logging;

    opens com.marrok.schoolmanager to javafx.fxml;
    exports com.marrok.schoolmanager;
    exports com.marrok.schoolmanager.controllers.main;

    opens com.marrok.schoolmanager.controllers.main to javafx.fxml;
}