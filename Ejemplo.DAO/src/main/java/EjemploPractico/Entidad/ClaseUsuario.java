package EjemploPractico.Entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class ClaseUsuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Usa una estrategia adecuada para la generación del ID

	private Long id;
	@Column (name="name")
	private String name;
	@Column (name="lastName")
	private String lastName;
	@Column (name="DNI")
	private String DNI;
	@Column (name="email")
	private String email;

	// Generamos Setters y Getters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ClaseUsuario(Long id, String name, String lastName, String dNI, String email) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		DNI = dNI;
		this.email = email;
	}

	public ClaseUsuario() {
	}

}
