package org.quelea.planningcenter.path.services;

import lombok.AllArgsConstructor;
import org.quelea.planningcenter.service.services.OrganizationService;
import org.quelea.planningcenter.util.RetrofitUtil;
import retrofit2.Retrofit;

@AllArgsConstructor
public class OrganizationPath {

    private final Retrofit retrofit;

    public SongsPath songs() {
        return new SongsPath(RetrofitUtil.appendPath(retrofit, "songs/"));
    }

    public PeoplePath people() {
        return new PeoplePath(RetrofitUtil.appendPath(retrofit, "people/"));
    }

    public FoldersPath folders() {
        return new FoldersPath(RetrofitUtil.appendPath(retrofit, "folders/"));
    }

    public MediasPath media() {
        return new MediasPath(RetrofitUtil.appendPath(retrofit, "media/"));
    }

    public MediaPath media(String id) {
        return new MediaPath(RetrofitUtil.appendPath(retrofit, "media/" + id + "/"));
    }

    public ServiceTypesPath serviceTypes() {
        return new ServiceTypesPath(RetrofitUtil.appendPath(retrofit, "service_types/"));
    }

    public ServiceTypePath serviceType(String id) {
        return new ServiceTypePath(RetrofitUtil.appendPath(retrofit, "service_types/" + id + "/"));
    }

    public OrganizationService api() {
        return retrofit.create(OrganizationService.class);
    }
}
