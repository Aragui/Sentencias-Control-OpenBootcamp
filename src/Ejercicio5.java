public class Ejercicio5 {
    public static void main(String[] args) {
        var estacion = "PRIMAVERA";

        switch (estacion){
            case "PRIMAVERA":
                System.out.println("Mira como florecen las plantas!!!");
                break;
            case "VERANO":
                System.out.println("Hora de ir a la playa");
                break;
            case "OTOÑO":
                System.out.println("Empieza a enfriar, las hojas se estan cayendo");
                break;
            case "INVIERNO":
                System.out.println("Que frio hace");
                break;
            default:
                System.out.println(estacion + " no existe");
        }
    }
}
