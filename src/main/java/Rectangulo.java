class Rectangulo extends Figura {
        private double base;
        private double altura;

        public Rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        // Implementación del método abstracto para calcular el área de un rectángulo
        @Override
        public double calcularArea() {
            return base * altura;
        }

    }

