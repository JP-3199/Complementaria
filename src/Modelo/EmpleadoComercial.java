package Modelo;

public class EmpleadoComercial extends EmpleadoBase {
    private double bonificacion;
    private double porcentajeBonificacion;
    public EmpleadoComercial(String nombre, String cedula, double salariobase, double bonificacion, double porcentajeBonificacion){
        super(cedula, nombre,salariobase);
        this.bonificacion=bonificacion;
        this.porcentajeBonificacion=porcentajeBonificacion;
    }
    public  double getBonificacionbase() {
        return bonificacion;
    }
        public  double getBonificacion(){
            return bonificacion*(porcentajeBonificacion*0.01);

    }
    public double getPorcentajeBonificacion(){

        return porcentajeBonificacion;
    }
    @Override

    public  double calcularSalarioTotal(){
        return super.calcularSalarioTotal()+ getBonificacion();
    }
    @Override
    public  String getTipo(){
        return "Comercial";
    }
}
