class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementación del método abstracto para calcular el área de un círculo
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
