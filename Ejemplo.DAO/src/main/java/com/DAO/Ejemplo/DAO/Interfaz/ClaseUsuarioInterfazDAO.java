package com.DAO.Ejemplo.DAO.Interfaz;

import java.util.List;
import java.util.Optional;

import EjemploPractico.Entidad.ClaseUsuario;

public interface ClaseUsuarioInterfazDAO {
	public void deleteAll(ClaseUsuario usuario);
	List<ClaseUsuario> findAll();
	public void crearUsuario (ClaseUsuario usuario);
	Optional<ClaseUsuario> findById(Long id);

}
