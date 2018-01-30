package fr.devsquad.minutemed.rest.imageService;


//@Path("/images")
public class ImageService {
/*
    /*
     * The maximum allowed file size in megabytes.
     * Files larger than this size will not be uploadable or downloadable.
     *
    private static final int MAX_SIZE_IN_MB = 1;

    /*
     * The directory where the images will be stored.
     * Make sure this directory exists before you run the service.
     *
    private static final java.nio.file.Path BASE_DIR = Paths.get(System.getProperty("user.home"), "Documents", "Saved_Images");

    @Context
    private UriInfo uriInfo;

    /*
     * Download a list of all image file names.
     *
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonArray getFileNames() throws IOException {

        // Filters out all non JPEG or PNG files, as well as files larger than the maximum allowed size.
        DirectoryStream.Filter<java.nio.file.Path> filter = entry -> {
            boolean sizeOk = Files.size(entry) <= 1024 * 1024 * MAX_SIZE_IN_MB;
            boolean extensionOk = entry.getFileName().toString().endsWith("jpg") || entry.getFileName().toString().endsWith("png");
            return sizeOk && extensionOk;
        };

        // Browse the filtered directory and list all the files.
        JsonArrayBuilder results = Json.createArrayBuilder();
        for (java.nio.file.Path entry : Files.newDirectoryStream(BASE_DIR, filter)) {
            results.add(entry.getFileName().toString());
        }
        return results.build();
    }

    /*
     * Upload a JPEG or PNG file.
     *
    @POST
    @Consumes({"image/jpeg", "image/png"})
    public Response uploadImage(InputStream in, @HeaderParam("Content-Type") String fileType,
            @HeaderParam("Content-Length") long fileSize) throws IOException {

        // Make sure the file is not larger than the maximum allowed size.
        if (fileSize > 1024 * 1024 * MAX_SIZE_IN_MB) {
            throw new WebApplicationException(Response.status(Status.BAD_REQUEST).entity("Image is larger than " + MAX_SIZE_IN_MB + "MB").build());
        }

        // Generate a random file name based on the current time.
        // This probably isn't 100% safe but works fine for this example.
        String fileName = "" + System.currentTimeMillis();

        if (fileType.equals("image/jpeg")) {
            fileName += ".jpg";
        } else {
            fileName += ".png";
        }

        // Copy the file to its location.
        Files.copy(in, BASE_DIR.resolve(fileName), StandardCopyOption.REPLACE_EXISTING);

        // Return a 201 Created response with the appropriate Location header.
        URI path = uriInfo.getAbsolutePathBuilder().path(fileName).build();
        return Response.status(Status.CREATED).location(path).build();
    }

    /*
     * Download a JPEG file.
     *
    @GET
    @Path("{name}.jpg")
    @Produces("image/jpeg")
    public InputStream getJpegImage(@PathParam("name") String fileName) throws IOException {

        fileName += ".jpg";
        java.nio.file.Path dest = BASE_DIR.resolve(fileName);

        if (!Files.exists(dest)) {
            throw new WebApplicationException(Status.NOT_FOUND);
        }

        return Files.newInputStream(dest);
    }

    /*
     * Download a PNG file.
     *
    @GET
    @Path("{name}.png")
    @Produces("image/png")
    public InputStream getPngImage(@PathParam("name") String fileName) throws IOException {

        fileName += ".png";
        java.nio.file.Path dest = BASE_DIR.resolve(fileName);

        if (!Files.exists(dest)) {
            throw new WebApplicationException(Status.NOT_FOUND);
        }

        return Files.newInputStream(dest);
    }*/
}
