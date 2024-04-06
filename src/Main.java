public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento  = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media =(8.2 + 6.0 + 9.0)/ 3;
        System.out.println(media);

        java.lang.String sinopsis = """
                Matrix es una paradoja 
                la mejor pelicula del fin del milenio
                Fue lanzada en: 
                """ + fechaDeLanzamiento;
//        java.lang.String nueva = "Esta es una nueva cadena";
//        s% representa una cadena de texto
//        d% representa un int
//        %2f representa una valor float que en esta parte puedes agregar los desimales
        System.out.println(sinopsis);
//        System.out.println(sinopsis.format("Matrix es una muy buena pelicula %s que fue lanzada en %d  y la nota de la pelicula fue %2f",nueva,fechaDeLanzamiento,notaDeLaPelicula));

        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);

//        int celsius = 30;
//        System.out.println((float)(celsius * 1.8) + 32);




    }
}