package com.bolsadeideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.di.app.models.domain.ItemFactura;
import com.bolsadeideas.springboot.di.app.models.domain.Producto;
import com.bolsadeideas.springboot.di.app.models.service.IServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServicio;
import com.bolsadeideas.springboot.di.app.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {

	@Bean("miServicioSimple")
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}

	@Bean("miServicioComplejo")
	@Primary
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}

	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems() {
		Producto producto1 = new Producto("camara", 100);
		Producto producto2 = new Producto("mouse", 50);
		Producto producto3 = new Producto("teclado", 500);

		ItemFactura linea1 = new ItemFactura(producto1, 1);
		ItemFactura linea2 = new ItemFactura(producto2, 5);
		ItemFactura linea3 = new ItemFactura(producto3, 7);

		return Arrays.asList(linea1, linea2, linea3);

	}

	
	@Bean("itemsFacturaOficina")
	public List<ItemFactura> registrarItemsOficina() {
		Producto producto1 = new Producto("Monitor LG", 1000);
		Producto producto2 = new Producto("Notebook", 1550);
		Producto producto3 = new Producto("Laptop", 500);
		Producto producto4 = new Producto("Escritorio", 500);
		
		ItemFactura linea1 = new ItemFactura(producto1, 1);
		ItemFactura linea2 = new ItemFactura(producto2, 2);
		ItemFactura linea3 = new ItemFactura(producto3, 3);
		ItemFactura linea4 = new ItemFactura(producto3, 4);
		
		return Arrays.asList(linea1, linea2, linea3, linea4);

	}
}
