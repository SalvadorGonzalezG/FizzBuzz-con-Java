public class FizzBuzz {

    // Método para imprimir los números del 1 al 100 con las reglas de FizzBuzz
    public void imprimir() {
        for (int i = 1; i <= 100; i++) {
            // Un número es múltiplo de 3 y 5 si el resto de la división de 'i' entre 3 y 5 es 0.
            if (i % 3 == 0 && i % 5 == 0) {
            // Si 'i' es múltiplo de ambos 3 y 5, imprime "FizzBuzz" en lugar del número.
                System.out.println("FizzBuzz");
            // Un número es múltiplo de 3 si el resto de la división de 'i' entre 3 es 0.
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            // Un número es múltiplo de 5 si el resto de la división de 'i' entre 5 es 0.
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
             // Si 'i' no es múltiplo ni de 3 ni de 5, se ejecuta la siguiente instrucción
            } else {
            // Imprimimos el número actual 'i'.
                System.out.println(i);
            }
        }
    }
}