package API;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.io.IOException;

public class Api {

	public static void main(String[] args) {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://randomuser.me/api/"))
				
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = null;
		try {
			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(response.body());
		
		Gson gson = new Gson();
		Random random = gson.fromJson(response.body().toString(),Random.class);
		System.out.print("Version:"+random.getInfo().getVersion()+"\n");
		System.out.print("gender:"+random.getResults().get(0).getGender()+"\n");
		System.out.print("email:"+random.getResults().get(0).getEmail()+"\n");
	}
}
