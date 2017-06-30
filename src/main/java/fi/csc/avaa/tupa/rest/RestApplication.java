package fi.csc.avaa.tupa.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("api")
public class RestApplication extends Application {

	@Override
	public Set<Object> getSingletons() {
		Set<Object> resources = new HashSet<>();
		resources.add(new InfraService());
		return resources;
	}
}