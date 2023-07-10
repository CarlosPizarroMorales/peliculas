package cl.prueba.pelis.dto.response;

public class CommonDeleteDto {

    String message;
	
    public CommonDeleteDto() {}
    public CommonDeleteDto(String name, Long id) {
        this.message = "la entidad " + name + " con id " + id + " fue borrada";
    }
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
