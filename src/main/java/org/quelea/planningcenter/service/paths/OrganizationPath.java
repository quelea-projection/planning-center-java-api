package org.quelea.planningcenter.service.paths;

import lombok.AllArgsConstructor;
import org.quelea.planningcenter.service.services.OrganizationService;
import retrofit2.Retrofit;

@AllArgsConstructor
public class OrganizationPath {

    private final Retrofit retrofit;

    public SongsPath songs() {
        return new SongsPath(
                retrofit.newBuilder()
                        .baseUrl(
                                retrofit.baseUrl()
                                        .newBuilder("songs/")
                                        .build()
                        ).build()
        );
    }

    public PeoplePath people() {
        return new PeoplePath(
                retrofit.newBuilder()
                        .baseUrl(
                                retrofit.baseUrl()
                                        .newBuilder("people/")
                                        .build()
                        ).build()
        );
    }

    public FoldersPath folders() {
        return new FoldersPath(
                retrofit.newBuilder()
                        .baseUrl(
                                retrofit.baseUrl()
                                        .newBuilder("folders/")
                                        .build()
                        ).build()
        );
    }

    public MediasPath media() {
        return new MediasPath(
                retrofit.newBuilder()
                        .baseUrl(
                                retrofit.baseUrl()
                                        .newBuilder("media/")
                                        .build()
                        ).build()
        );
    }

    public MediaPath media(String id) {
        return new MediaPath(
                retrofit.newBuilder()
                        .baseUrl(
                                retrofit.baseUrl()
                                        .newBuilder("media/" + id + "/")
                                        .build()
                        ).build()
        );
    }

    public ServiceTypesPath serviceTypes() {
        return new ServiceTypesPath(
                retrofit.newBuilder()
                        .baseUrl(
                                retrofit.baseUrl()
                                        .newBuilder("service_types/")
                                        .build()
                        ).build()
        );
    }

    public ServiceTypePath serviceType(String id) {
        return new ServiceTypePath(
                retrofit.newBuilder()
                        .baseUrl(
                                retrofit.baseUrl()
                                        .newBuilder("service_types/" + id + "/")
                                        .build()
                        ).build()
        );
    }

    public OrganizationService api() {
        return retrofit.create(OrganizationService.class);
    }
}
