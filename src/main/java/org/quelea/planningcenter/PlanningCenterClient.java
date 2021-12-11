package org.quelea.planningcenter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.github.jasminb.jsonapi.retrofit.JSONAPIConverterFactory;
import okhttp3.OkHttpClient;
import org.quelea.planningcenter.auth.AuthToken;
import org.quelea.planningcenter.model.services.Arrangement;
import org.quelea.planningcenter.model.services.Attachment;
import org.quelea.planningcenter.model.services.AttachmentActivity;
import org.quelea.planningcenter.model.services.AttachmentType;
import org.quelea.planningcenter.model.services.Contributor;
import org.quelea.planningcenter.model.services.CustomSlide;
import org.quelea.planningcenter.model.services.Folder;
import org.quelea.planningcenter.model.services.Item;
import org.quelea.planningcenter.model.services.ItemNote;
import org.quelea.planningcenter.model.services.ItemNoteCategory;
import org.quelea.planningcenter.model.services.ItemTime;
import org.quelea.planningcenter.model.services.Key;
import org.quelea.planningcenter.model.services.Layout;
import org.quelea.planningcenter.model.services.Media;
import org.quelea.planningcenter.model.services.Organization;
import org.quelea.planningcenter.model.services.Person;
import org.quelea.planningcenter.model.services.Plan;
import org.quelea.planningcenter.model.services.PlanPerson;
import org.quelea.planningcenter.model.services.PlanTime;
import org.quelea.planningcenter.model.services.Schedule;
import org.quelea.planningcenter.model.services.Series;
import org.quelea.planningcenter.model.services.ServiceType;
import org.quelea.planningcenter.model.services.Song;
import org.quelea.planningcenter.model.services.Team;
import org.quelea.planningcenter.model.services.TimePreferenceOption;
import org.quelea.planningcenter.path.services.OrganizationPath;
import org.quelea.planningcenter.util.RetrofitUtil;
import retrofit2.Retrofit;
import java.io.IOException;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

public class PlanningCenterClient {

    private final Retrofit retrofit;

    public PlanningCenterClient(AuthToken authToken) {
        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.planningcenteronline.com/")
                .client(new OkHttpClient.Builder()
                        .addInterceptor(chain ->
                                chain.proceed(chain.request().newBuilder()
                                        .header("Authorization", "Bearer " + authToken.getCurrentAccessToken().orElse("0"))
                                        .build())
                        )
                        .build())
                .addConverterFactory(new JSONAPIConverterFactory(
                        new ObjectMapper()
                                .registerModule(new JavaTimeModule())
                                .configure(FAIL_ON_UNKNOWN_PROPERTIES, false),
                        Organization.class, Song.class, Folder.class, ServiceType.class, TimePreferenceOption.class, Plan.class,
                        Schedule.class, PlanPerson.class, Person.class, AttachmentType.class, Series.class, Contributor.class, PlanTime.class, ItemTime.class, Team.class, Item.class, ItemNote.class, ItemNoteCategory.class,
                        Arrangement.class, Key.class, Layout.class, Attachment.class, Media.class, CustomSlide.class, AttachmentActivity.class))
                .build();
    }

    public boolean isConnected() {
        try {
            return services().api().get().execute().isSuccessful();
        } catch (IOException ex) {
            return false;
        }
    }

    public OrganizationPath services() {
        return new OrganizationPath(RetrofitUtil.appendPath(retrofit, "services/v2/"));
    }

}
