package patrones.singleton;

public class MainLogger {
    public static void main(String[] args) {
        LogerClass log1 = LogerClass.getInstance();
        log1.writelogs("Inicio log del obtejo log1");
        log1.writelogs("Final log del obtejo log1");
        log1.showlogs();

        LogerClass log2 = LogerClass.getInstance();
        log2.writelogs("Inicio log del obtejo log2");
        log2.writelogs("Final log del obtejo log2");
        log2.showlogs();

        System.out.println(log1 == log2);
    }
}
