package mvcfacelets.restapp.resources;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.ws.rs.Path;
import javax.ws.rs.GET;

@Path("/hello")
@Controller
@RequestScoped
public class HelloController {

    @Inject
    private Models model;
    
    @GET
    public String doGet() {
        model.put("hello", "Hello MVC 1.0");
        return "hello.jsp";
    }
}
