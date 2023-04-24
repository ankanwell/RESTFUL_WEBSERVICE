package RestfulPack;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

@Path("ankan")
public class AnkanResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AnkanResource
     */
    public AnkanResource() {
    }

    /**
     * Retrieves representation of an instance of RestfulPack.AnkanResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHtml() {
        String msg="<html><body><h1>hello world!</h1></body></html>";
        return msg;
    }

    /**
     * PUT method for updating or creating an instance of AnkanResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_HTML)
    public void putHtml(String content) {
    }
}
