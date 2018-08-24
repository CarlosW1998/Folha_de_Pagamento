package Model;

public class Assalariado extends Empregado {
    private double salarioHorario;

    public void setSalarioHorario(double salarioHorario) {
        this.salarioHorario = salarioHorario;
    }
    public double getSalarioHorario()
    {
        return this.salarioHorario;
    }
}
