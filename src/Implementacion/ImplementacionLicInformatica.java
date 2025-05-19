package Implementacion;

import java.util.HashMap;
import Interface.MetodosLicInformatica;
import Model.LicInformatica;

public class ImplementacionLicInformatica implements MetodosLicInformatica {

    private HashMap<Long, LicInformatica> hashMapDatos = new HashMap<>();

    @Override
    public void guardar(LicInformatica info) {
        hashMapDatos.put(info.getCedula(), info);
    }

    @Override
    public void mostrar() {
        System.out.println(hashMapDatos);
    }

    @Override
    public LicInformatica buscar(long cedula) {
        return hashMapDatos.get(cedula);
    }

    @Override
    public void editar(LicInformatica info) {
        hashMapDatos.put(info.getCedula(), info);
    }

    @Override
    public void eliminar(long cedula) {
        hashMapDatos.remove(cedula);
    }
}