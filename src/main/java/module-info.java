module ni.edu.uam.sincronizacionycontroldehilos {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.edu.uam.sincronizacionycontroldehilos to javafx.fxml;
    exports ni.edu.uam.sincronizacionycontroldehilos;
}