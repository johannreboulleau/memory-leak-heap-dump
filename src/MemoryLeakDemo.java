import java.util.ArrayList;
import java.util.List;

public class MemoryLeakDemo {
    // Une liste statique pour maintenir les références en permanence
    private static final List<Object> memoryLeakList = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Application started. Try to create a memory leak...");
        while (true) {
            try {
                // Ajout d'objets dans la liste pour empêcher leur libération
                memoryLeakList.add(new byte[1024 * 1024]); // Chaque objet est un tableau de 1 Mo
                System.out.println("Add objects in the memory. Current size: " + (memoryLeakList.size()) + " MB");
                Thread.sleep(100); // Attendre un peu pour rendre la surcharge visible
            } catch (OutOfMemoryError e) {
                System.err.println("Memory leak detected!");
                e.printStackTrace();
                break;
            }
        }

        System.out.println("End process.");
    }
}