package edu.mum.cs545.ws;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cs545.airline.model.Airline;
import cs545.airline.model.Airplane;
import cs545.airline.model.Flight;
import cs545.airline.service.AirlineService;
import cs545.airline.service.AirplaneService;

@Path("/airplane")
public class AirPlaneWebService {
	@Inject
	private AirplaneService airPlaneService;
	
	@POST
	@Path("/create")
	@Produces({MediaType.APPLICATION_JSON})
	public void create(Airplane airplane) {
		airPlaneService.create(airplane);
	}
	
	@DELETE
	@Path("/delete")
	@Produces({MediaType.APPLICATION_JSON})
	public void delete(Airplane airplane) {
		airPlaneService.delete(airplane);
	}

	@PUT
	@Path("/update")
	@Produces({MediaType.APPLICATION_JSON})
	public Airplane update(Airplane airplane) {
		return airPlaneService.update(airplane);
	}
	
	@GET
	@Path("/find")
	@Produces({MediaType.APPLICATION_JSON})
	public Airplane find(Airplane airplane) {
		return airPlaneService.find(airplane);
	}
	
	@GET
	@Path("/findbyname")
	@Produces({MediaType.APPLICATION_JSON})
	public Airplane findbyname(String serialno) {
		return airPlaneService.findBySrlnr(serialno);
	}
	
	@GET
	@Path("/findbyflight")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Airplane> findByFlight(Flight flight) {
		return airPlaneService.findByFlight(flight);
	}
	
	@GET
	@Path("/findbyfmode")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Airplane> findByfindByModel(String model) {
		return airPlaneService.findByModel(model);
	}
	
	@GET
	@Path("/findall")
	@Produces({MediaType.APPLICATION_JSON})
	public List<Airplane> findAll() {
		return airPlaneService.findAll();
	}
}
