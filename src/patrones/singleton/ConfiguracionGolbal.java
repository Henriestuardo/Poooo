package patrones.singleton;

public class ConfiguracionGolbal {
    private static ConfiguracionGolbal instancia = null;

    private String UrlBaseDatos;
    private int maxConexiones;

    private ConfiguracionGolbal(){
        UrlBaseDatos ="C:UsersAIODocumentsEst2024";
        maxConexiones=10;
    }

    public static synchronized ConfiguracionGolbal getInstancia(){
        if (instancia == null){
            instancia = new ConfiguracionGolbal();
        }
        return instancia;
    }

    public String getUrlBasedeDatos(){
        return UrlBaseDatos;
    }

    public void setUrlBasedeDatos(String UrlBaseDatos){
        this.UrlBaseDatos = UrlBaseDatos;
    }

}
