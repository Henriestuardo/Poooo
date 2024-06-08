package patrones.singleton.respuesta;

import patrones.singleton.ConfiguracionGolbal;

public class Main {
    public static void main(String[] args) {
        ConfiguracionGolbal configuracion = ConfiguracionGolbal.getInstancia();

        System.out.println("URL de la base de datos" + configuracion.getUrlBasedeDatos());

        configuracion.setUrlBasedeDatos(("C:UsersAIODocumentsEst2024"));

        System.out.println("Nueva URL de la base de datos" + configuracion.getUrlBasedeDatos());
        ConfiguracionGolbal configuracion2=ConfiguracionGolbal.getInstancia();
        System.out.println("URL de la base de datos" + configuracion.getUrlBasedeDatos());
    }
}
