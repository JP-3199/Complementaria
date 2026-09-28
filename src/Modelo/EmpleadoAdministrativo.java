package Modelo;

public class EmpleadoAdministrativo extends EmpleadoBase {
    private double bonificacion;
    public EmpleadoAdministrativo(String nombre, String cedula, double salariobase, double bonificacion){
        super(cedula, nombre,salariobase);
        this.bonificacion=bonificacion;
    }
    public  double getBonificacion(){
        return bonificacion;
    }
    @Override

    public  double calcularSalarioTotal(){
    return super.calcularSalarioTotal()+ bonificacion;
    }
    @Override
    public  String getTipo(){
     return "Administrativo";
}
}
