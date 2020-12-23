package org.acme.rest.json;

import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("/multipart")
public class MultiPartResource {

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public String upload(@MultipartForm MultipartBody data) throws IOException {
        return String.format("nbOfBytes=%d", data.file.readAllBytes().length);
    }
}