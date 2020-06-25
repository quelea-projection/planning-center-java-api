package org.quelea.planningcenter.path.services;

import lombok.AllArgsConstructor;
import org.quelea.planningcenter.service.services.PeopleService;
import retrofit2.Retrofit;

@AllArgsConstructor
public class PeoplePath {

    private final Retrofit retrofit;

    public PeopleService api() {
        return retrofit.create(PeopleService.class);
    }
}
