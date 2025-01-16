package javaOOP;

import java.lang.reflect.Array;

public class main {


    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Anahi", "Pediatria");
        System.out.println(myDoctor.getName());


        Doctor myDoctor2 = new Doctor(myDoctor.getName(), myDoctor.getSpeciality());
        // Valor actual
        System.out.println(myDoctor2.getName());
        //Asignación de valor
        myDoctor2.setName("Juan");

        // Comparativa
        System.out.println(myDoctor.getName());
        System.out.println(myDoctor2.getName());

    }
}
