package raydekigtd;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonManager {

    private static final String ARQUIVO =
            "tarefas.json";

    private static final Gson gson =
            new GsonBuilder()
                    .setPrettyPrinting()
                    .create();

    public static void salvar(
            List<Tarefa> tarefas) {

        try (FileWriter writer =
                     new FileWriter(ARQUIVO)) {

            gson.toJson(tarefas, writer);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public static List<Tarefa> carregar() {

        try (FileReader reader =
                     new FileReader(ARQUIVO)) {

            Type tipo =
                    new TypeToken<ArrayList<Tarefa>>() {}.getType();

            return gson.fromJson(reader, tipo);

        } catch (Exception e) {

            return new ArrayList<>();
        }
    }
}