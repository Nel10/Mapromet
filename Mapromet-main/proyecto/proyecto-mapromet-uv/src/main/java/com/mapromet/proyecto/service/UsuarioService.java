package com.mapromet.proyecto.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.mapromet.proyecto.model.Usuario;
import com.mapromet.proyecto.web.dto.UserRegistrationDto;

public interface UsuarioService extends UserDetailsService{
	Usuario save(UserRegistrationDto registrationDto);
}
