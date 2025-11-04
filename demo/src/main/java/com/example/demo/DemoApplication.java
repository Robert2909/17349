package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Aplicación iniciada");
	}

	@RequestMapping("/")
	public String	 home () {
		System.out.println("Hola mundo!");
		return """
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hola mundo</title>
</head>
<body>
    <h1>Hola mundo!</h1>
    <ul>
        <li><a href="/altas">Altas</a></li>
        <li><a href="/bajas">Bajas</a></li>
        <li><a href="/consultas">Consultas</a></li>
        <li><a href="/cambios">Cambios</a></li>
    </ul>

	<ul>
		<li><a href="/sistema">Sistema</a></li>
		<li><a href="/plantilla">Plantilla</a></li>
	</ul>
</body>
</html>
				""";
	}

	// Ejemplo de métodos REST NO adecuados al estilo RESTFUL
	@RequestMapping("/altas")
	public String altas() {
		return "Altas";
	}

	@RequestMapping("/bajas")
	public String bajas() {
		return "Bajas";
	}

	@RequestMapping("/cambios")
	public String cambios() {
		return "Cambios";
	}

	@RequestMapping("/consultas")
	public String consultas() {
		return "Consultas";
	}

	// Ejemplo de métodos REST SI adecuados al estilo RESTFUL
	@RequestMapping(value = "/sistema", method = RequestMethod.POST)
	public String altasREST() {
		return "Altas";
	}

	@RequestMapping(value = "/sistema", method = RequestMethod.DELETE)
	public String bajasREST() {
		return "Bajas";
	}

	@RequestMapping(value = "/sistema", method = RequestMethod.PUT)
	public String cambiosREST() {
		return "Cambios";
	}

	@RequestMapping(value = "/sistema", method = RequestMethod.GET)
	public String consultasREST() {
		return "Consultas";
	}

}