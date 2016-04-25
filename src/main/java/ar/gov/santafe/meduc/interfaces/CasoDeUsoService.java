package ar.gov.santafe.meduc.interfaces;

import ar.gov.santafe.meduc.dto.SimpleDto;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author enorrmann
 */
@Path("casoDeUso")
public interface CasoDeUsoService extends GenericCrudService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/search/{filter}")
    public List<SimpleDto> searchBy(@PathParam("filter")SimpleDto filter);

}
