package patrones.singleton;

import java.util.ArrayList;
import java.util.List;

public class LogerClass {
    private static LogerClass instance;
    private List<String> logs;

    private LogerClass(){
        logs = new ArrayList<>();
    }

    public static LogerClass getInstance(){
        if (instance == null){
            instance = new LogerClass();
        }
        return instance;
    }

    public void writelogs (String message){
        logs.add(message);

    }

    public void showlogs(){
        for (int i = 0; i< logs.size(); i++){
            System.out.println((logs.get(i)));
        }

        for (String log:logs){
            System.out.println((log));
        }
    }

}
