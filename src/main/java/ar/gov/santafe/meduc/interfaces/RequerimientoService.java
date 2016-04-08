/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.gov.santafe.meduc.interfaces;

import ar.gov.santafe.meduc.dto.SimpleDto;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author mdominguez
 */
@Path("requerimiento")
public interface RequerimientoService {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public SimpleDto getRequerimiento(@QueryParam("id") Integer id);

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public SimpleDto createPersona(SimpleDto req);   
}
