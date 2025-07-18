package level3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class SerializableObject {
    public static void serializableToJson(Object object) throws Exception {
        Class<?> incognitClass = object.getClass();
        if (incognitClass.isAnnotationPresent(SerializableJson.class)) {
            SerializableJson annotation = incognitClass.getAnnotation(SerializableJson.class);

            String directory = annotation.directory();
            String filename = incognitClass.getSimpleName()+ ".json";

            System.out.println("Director collected from Serializable Json interface " + annotation.directory());

            File dir = new File(directory);
            if (!dir.exists())
                dir.mkdirs();
            Gson gson = new Gson();
            String json = gson.toJson(object);

            try (FileWriter fileWriter = new FileWriter(new File(dir, filename))) {
                fileWriter.write(json);
                System.out.println("File created successful in " + dir.getName() + File.pathSeparator + filename);
            } catch (IOException e) {
                System.out.println("Error while opening file: " + e.getMessage());
            }
        }
        else {
            throw new IllegalAccessException("The annotations must contains the directory");
        }
    }
}
