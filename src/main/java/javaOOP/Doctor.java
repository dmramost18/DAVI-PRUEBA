package javaOOP;

 class Doctor {
    // Attributes
    static int id = 0 ;

    private String name;
    private String lastname;
    private String speciality;

    // Custom constructor method
    public Doctor(String name, String speciality){
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    // Getters/Obtener and Setters/Actualizar
     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getLastname() {
         return lastname;
     }

     public void setLastname(String lastname) {
         this.lastname = lastname;
     }

     public String getSpeciality() {
         return speciality;
     }

     public void setSpeciality(String speciality) {
         this.speciality = speciality;
     }

}
