package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.stereotype.Component;

//@Component("miServicioPrincipal")
public class MiServicio implements IServicio{

	@Override
	public String operacion() {
		return "ejecutando algun proceso importante....";
	}
	
}
