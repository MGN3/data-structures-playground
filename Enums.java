package colecciones;

public enum Enums {
	
    HOLA("Hola"),
    ADIOS("Adios"),
    BIENVENIDO("Bienvenido"),
    PERDON("Perdón");
    
	
	private String value;
	
    private Enums(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}

