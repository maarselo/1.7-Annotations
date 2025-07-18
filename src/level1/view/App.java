package level1.view;

import level1.model.FaceToFaceWorker;
import level1.model.OnlineWorker;

public class App {
    @SuppressWarnings("deprecation")
    public static void run() {
        OnlineWorker onlineWorker = new OnlineWorker("Marcelo", "Villavicencio", 10.0);
        FaceToFaceWorker faceToFaceWorker = new FaceToFaceWorker("Alejandra", "Hidalgo", 9.0);

        System.out.println(onlineWorker.getName() + " charges a total of " + onlineWorker.calculateSalary(160));
        System.out.println(faceToFaceWorker.getName() + " charges a total of " + faceToFaceWorker.calculateSalary(160));

        onlineWorker.greet();
        faceToFaceWorker.greet();
    }
}
