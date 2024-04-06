public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento  = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        java.lang.String tipoPLan = "plus";
//Codigo que prueba los operadores relacionales
//        if (fechaDeLanzamiento >= 2022){
//            System.out.println("Peliculas mas populares");
//        }else{
//            System.out.println("Peliculas Retro que aun valen la pena ver");
//        }

        if (incluidoEnElPlan && tipoPLan.equals("plus") ){
            System.out.println("Disfrute de su pelicula");
        }else{
            System.out.println("Pelicula no disponible para su plan actual");
        }

    }

}
