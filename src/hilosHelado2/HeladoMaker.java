package hilosHelado2;

import java.util.concurrent.*;

public class HeladoMaker {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3); // Creamos un executor con un pool de 3 hilos
        Future<String> saborFuture = executor.submit(new SeleccionarSabor());
        Future<String> ingredientesFuture = executor.submit(new AgregarIngredientes());
        Future<String> mezclarFuture = executor.submit(new Mezclar());

        // Esperamos a que cada tarea se complete y obtenemos el resultado
        try {
            String sabor = saborFuture.get();
            String ingredientes = ingredientesFuture.get();
            String mezcla = mezclarFuture.get();
            /*Después de enviar las tareas al executor, esperamos a que cada tarea se complete y obtenemos el resultado.
            Si alguna tarea falla, capturamos la excepción y la imprimimos.*/
            System.out.println("El helado de " + sabor + " con " + ingredientes + " ha sido mezclado: " + mezcla);
        } catch (ExecutionException e) {
            System.out.println("Ocurrió un error al hacer el helado: " + e.getMessage());
        }
       /* Finalmente, cerramos el executor utilizando el método "shutdown()". Esto asegura que se detengan
        todos los hilos de ejecución  asociados al executor.*/
        executor.shutdown();
    }

   /* Cada tarea es de tipo "Callable", que es una interfaz funcional que se puede utilizar con el método "submit()"
    del ExecutorService para ejecutar una tarea y obtener un resultado.*/
    static class SeleccionarSabor implements Callable<String> {
        public String call() throws Exception {
            System.out.println("Seleccionando sabor...");
            Thread.sleep(2000);
            return "vainilla";
        }
    }

    static class AgregarIngredientes implements Callable<String> {
        public String call() throws Exception {
            System.out.println("Agregando ingredientes...");
            Thread.sleep(2000);
            return "chocolate chips";
        }
    }

    static class Mezclar implements Callable<String> {
        public String call() throws Exception {
            System.out.println("Mezclando...");
            Thread.sleep(2000);
            return "mezcla completa";
        }
    }
}
