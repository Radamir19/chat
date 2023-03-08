module com.nurmagomedov.networkclientchat {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.nurmagomedov.networkclientchat to javafx.fxml;
    exports com.nurmagomedov.networkclientchat;
}