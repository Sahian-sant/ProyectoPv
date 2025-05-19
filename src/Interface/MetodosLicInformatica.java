package Interface;

import Model.LicInformatica;

public interface MetodosLicInformatica {

    public void guardar(LicInformatica info);
    
    public void mostrar();
    
    public LicInformatica buscar(long cedula);
    
    public void editar(LicInformatica info);
    
    public void eliminar(long cedula);
}