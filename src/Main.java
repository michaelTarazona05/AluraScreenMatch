public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenid@ a Screen Match");
        System.out.println("Película: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        //System.out.println(media);

        String sinopsis = """
                Matrix es una paradoja.
                La mejor película del fin del milenio.
                Fue lanzada en:""" + " " + fechaDeLanzamiento + "." +
                "\nLa calificación actual es de: " + notaDeLaPelicula + "." +
                "\nLa valoración media es de: " + media + "." +
                "\nIncluido en plan actual: " + incluidoEnElPlan + ".";

        System.out.println(sinopsis);

        /*

        String nombre = “Juan”;
        int aulas = 4;

        String mensaje= """
        Hola, %s!
        Bienvenido al curso de Java.
        Tendremos %d aulas para mostrarte lo que es necesario para que puedas dar tu primeros pasos en este lenguaje """.formatted(nombre, aulas);

        System.out.println(mensaje);


        String passWord;

        String contrasena= "12345";
        if (contrasena.equals("12345")) {
            System.out.println("Acceso autorizado!");
        } else {
            System.out.println("Contraseña incorrecta.");
        }

        String nombre = "Maria";
        int edad = 30;
        double valor = 55.9999;
        System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", nombre, edad, valor));


         */

        int clasificacion = (int) (media / 2); //Casteo

        System.out.println(clasificacion);

    }
}