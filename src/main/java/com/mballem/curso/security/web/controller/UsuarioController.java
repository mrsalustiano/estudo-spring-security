package com.mballem.curso.security.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mballem.curso.security.domain.Usuario;

@Controller
@RequestMapping("u")
public class UsuarioController {

	//Abrir cadastro de usuario
	@GetMapping("/novo/cadastro/usuario")
	public String CadastroPorAdminParaAdminMedicoPaciente(Usuario usuario) {
		
		
		return "usuario/cadastro";
	}
}
