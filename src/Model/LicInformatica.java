package Model;

public class LicInformatica extends Profesionistas {


	    private String area;
	    private float salario;

	    public LicInformatica(long cedula, String carrera, String area, float salario) {
	        super(cedula, carrera);
	        this.area = area;
	        this.salario = salario;
	    }

	    @Override
	    public String toString() {
	        return "LicInformatica [getCedula()=" + getCedula() + ", getCarrera()=" + getCarrera() + ", area=" + area
	                + ", salario=" + salario + "]";
	    }

	    public String getArea() {
	        return area;
	    }

	    public void setArea(String area) {
	        this.area = area;
	    }

	    public float getSalario() {
	        return salario;
	    }

	    public void setSalario(float salario) {
	        this.salario = salario;
	    }
	
}