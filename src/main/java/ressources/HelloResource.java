package ressources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("greetings")
public class HelloResource {
	//1 methode sans parametre  
	/*
@GET 
@Produces(MediaType.TEXT_PLAIN)
public String sayHello()

{ return "Hello from JAX -RS";
	}	
	*/
//2 methode avec path parametre 
@GET 
@Produces(MediaType.TEXT_PLAIN)
@Path("{FirstName}/{LastName}")
public String sayHello2(@PathParam (value= "FirstName") String prenom, @PathParam(value= "LastName") String nom)
{return " Hello from JAX -RS with path parametre " +prenom+" "+nom;
	}
//3 methode avec Query parametre 
/*
@GET 
@Produces(MediaType.TEXT_PLAIN)
public String sayHello3(@QueryParam (value= "FirstName") String prenom, @QueryParam(value= "LastName") String nom)
{return "Hello from JAX -RS with Query Parametre to  " +prenom+" "+nom;
	}
	*/
//4  methode 1+3
@GET 
@Produces(MediaType.TEXT_PLAIN)
public String sayHello4(@QueryParam (value= "FirstName") String prenom, @QueryParam(value= "LastName") String nom)
{if (prenom==null && nom==null) {
	return "Hello from JAX -RS";
}
return "Hello from JAX -RS with Query Parametre to "+prenom+" "+nom;
}
}

