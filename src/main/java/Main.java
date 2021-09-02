import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * current API key: Rped7ntSY9HyE4aAxz0AQpjyeT4wMHOE
 *
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        final String BASE_URL = "https://sis.jhu.edu/api/classes";
        final String KEY = "Rped7ntSY9HyE4aAxz0AQpjyeT4wMHOE";

        String endpoint = BASE_URL + "/codes/schools?Key=" + KEY;

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(endpoint)
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
    }
}
