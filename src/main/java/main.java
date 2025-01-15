public class main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(1.0);
        System.out.println("Área del círculo: " + circulo.calcularArea());

        Rectangulo rectangulo= new Rectangulo(4,6);
        System.out.println("Altura del rectangulo: " + rectangulo.calcularArea());

        Doctor doctor = new Doctor();
        doctor.id = 101;
        doctor.name = "Katherine Pérez";
        doctor.speciality = "Medico General";
        doctor.showName();

    }


}


