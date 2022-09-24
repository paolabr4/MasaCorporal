import javax.swing.*;

public class Imc {
    public static void main(String[] args) {
        double p= Double.parseDouble(JOptionPane.showInputDialog("Digite el peso del paciente en Kilos:"));
        double e= Double.parseDouble(JOptionPane.showInputDialog("Digite la estatura del paciente en Metros:"));

        if (e>3){
            e=e/100;
        }


        Persona paciente=new Persona();
        paciente.setEstatura(e);
        paciente.setPeso(p);

        System.out.println("Estatura: "+paciente.getEstatura());
        System.out.println("peso: "+paciente.getPeso());

        System.out.println("el IMC del paciente es:" +paciente.calcularImc());
        System.out.println("El paciente se encuentra: "+paciente.calificacion(paciente.imc));

    }
}
