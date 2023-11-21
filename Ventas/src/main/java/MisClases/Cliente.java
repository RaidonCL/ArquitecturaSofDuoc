
package MisClases;


public class Cliente {
    private int IdCliente;
    private String Nombre;
    private String Direccion;
    private String Correo;
    private int Rut;
    private int Telefono;
    
        public int getIdCliente() {
        return IdCliente;
        }
    public String getNombre() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public int getRut() {
        return Rut;
    }

    public int getTelefono() {
        return Telefono;
    }

        public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
    
    
}
