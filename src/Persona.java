public class Persona {

    double peso;
    double estatura;
    double imc;
    String calificacion;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura (double estatura) {
        this.estatura = estatura;
    }

    public Persona(double peso, double estatura){
        this.peso=peso;
        this.estatura=estatura;

    }

    public Persona(){
        System.out.println("Datos sin parametros");
    }

    public double calcularImc(){
        imc=(peso/(estatura*estatura));
        return imc;
    }



    public String calificacion(double imc){

        if (imc>18.5 && imc<24.9){
            calificacion="Normal";

        } else
            if(imc>25 && imc<29.9){
                calificacion="Sobrepeso";
            }else
                if(imc>30 && imc<34.9) {
                    calificacion="Obesidad Grado 1";
                }else
                    if(imc>35 && imc<39.9) {
                        calificacion="Obesidad Grado 2";
                    }else
                        if(imc>40){
                            calificacion="Obesidad Grado 3";
                        }

                        return calificacion;
    }







}
