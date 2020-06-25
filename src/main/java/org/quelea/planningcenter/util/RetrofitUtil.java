package org.quelea.planningcenter.util;

import lombok.experimental.UtilityClass;
import retrofit2.Retrofit;
import java.util.Objects;

@UtilityClass
public class RetrofitUtil {

    public Retrofit appendPath(Retrofit retrofit, String toAppend) {
        return retrofit.newBuilder()
                .baseUrl(Objects.requireNonNull(retrofit.baseUrl().newBuilder(toAppend)).build())
                .build();
    }

}
