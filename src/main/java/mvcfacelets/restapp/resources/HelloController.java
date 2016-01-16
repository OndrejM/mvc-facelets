package mvcfacelets.restapp.resources;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.ws.rs.*;

@Path("/hello")
@Controller
@RequestScoped
public class HelloController {

    @Inject
    private Models model;
    
    @GET
    public String doGet(@QueryParam("view") @DefaultValue("JSP") ViewEngineType viewEngine) {
        model.put("hello", "Hello MVC 1.0 from " + viewEngine);
        
        return "hello." + viewEngine.getViewSuffix();
    }

    public static enum ViewEngineType {
        JSP {
            @Override
            public String getViewSuffix() {
                return "jsp";
            }
        }, FACELET {
            @Override
            public String getViewSuffix() {
                return "xhtml";
            }
        };
        
        public abstract String getViewSuffix();
    }
    
}
