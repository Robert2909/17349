package mx.uv.listi.c17349.Saludar;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = "*")
@RestController
public class SaludarControlador {

    Saludador persona;

    @RequestMapping("/")
    public String home() {
        return "Hola";
    }

    //  @GetMapping("/saludar")
    //  public String saludar() {
    //  return "Hola";
    //  }

    @GetMapping(value = {"/saludar", "/saludar/{nombre}"})
    public String saludar(@PathVariable(required = false) String nombre) {
        if (nombre != null) {
            return "Hola " + nombre;
        } else {
            return "Hola desconocido";
        }
    }

    @RequestMapping(value = "/saludar2", method = RequestMethod.GET)
    public Saludador mostrar() {
        Saludador s = new Saludador("Hola desde el objeto Saludador");
        return s;
    }

    // Mejora en los métodos y sus verbos
    @GetMapping("/saludarget")
    public Saludador saludarGet() {
        return this.persona;
    }

    @PostMapping("/saludarpost")
    public void saludarPost(@RequestBody Saludador s) {
        System.out.println(s);
        persona = s;
    }

    @GetMapping("/query")
    public String metodo(@RequestParam String nombre) {
        System.out.println("El nombre es: " + nombre);
        return "El nombre es: " + nombre;
    }

    @GetMapping("/backend")
    public String backend(@RequestParam String nombre, @RequestParam String password) {
        System.out.println("El nombre es: " + nombre + " " + password);
        return "El nombre es: " + nombre + " " + password;
    } 
}
