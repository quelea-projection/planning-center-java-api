package org.quelea.planningcenter.util;

import org.junit.jupiter.api.Test;
import retrofit2.Retrofit;

import static org.junit.jupiter.api.Assertions.*;

class RetrofitUtilTest {

    @Test
    void appendPath() {
        Retrofit base = new Retrofit.Builder()
                .baseUrl("https://test.com/")
                .build();

        String toAppend = "hello/world/";

        Retrofit expected = new Retrofit.Builder()
                .baseUrl("https://test.com/hello/world/")
                .build();
        Retrofit actual = RetrofitUtil.appendPath(base, toAppend);

        assertEquals(expected.baseUrl(), actual.baseUrl());

    }
}