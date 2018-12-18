package employe.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/employe")
public class EmployeResources {

	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public String ajouterEmploye(Employe emp) {

		if (emp.getPrenom() == null && emp.getNom() == null) {

			return "Hello from JAX-RS";
		}
		return "Hello from JAX-RS" + emp.getNom() + " " + emp.getPrenom();

	}

}
