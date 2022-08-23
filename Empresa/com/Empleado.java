package Empresa.com;

public class Empleado extends Empresa{
    private String Nombres;
    private String Apellidos;
    private String telefono;
    private String Direccion;
    private int Documento;
    private String Banco;
    private int NumCuentaBancaria;
    private int Salario;


    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getDocumento() {
        return Documento;
    }

    public void setDocumento(int documento) {
        Documento = documento;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String banco) {
        Banco = banco;
    }

    public int getNumCuentaBancaria() {
        return NumCuentaBancaria;
    }

    public void setNumCuentaBancaria(int numCuentaBancaria) {
        NumCuentaBancaria = numCuentaBancaria;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int salario) {
        Salario = salario;
    }
}
