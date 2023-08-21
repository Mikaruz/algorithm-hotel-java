package ArbolBinario;

public class Sucursal {
    private String ID;
    private String Empresa;
    private String Calle;

    public Sucursal(Object[] Registro) {
        this.ID = Registro[0].toString();
        this.Empresa = Registro[1].toString();
        this.Calle = Registro[2].toString();
    }

    public Object[] getRegistro() {
        Object[] Registro = {ID, Empresa, Calle};
        return Registro;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }
}
