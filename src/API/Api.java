package API;
import java.util.Scanner;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

import first.Course;

import java.net.URI;
import java.net.http.HttpClient;
import java.io.IOException;
import java.io.PrintStream;

public class Api {
	
	public static void main(String[] args) {
		boolean menue=true;
		boolean users=true;
		Scanner sa=new Scanner(System.in);
		while(menue) {
			System.out.println("1.multple users");
			System.out.println("2.pagination");
			System.out.println("3.passward");
			System.out.println("4.seeding");
			
			String bb = sa.next();
			int option = Integer.parseInt(bb);
			switch (option) {	
			case 1:
				while(users) {
					System.out.println("PLS ENTER USERS:");
					int user = sa.nextInt();
					if(user ==0) {
						
					HttpRequest request = HttpRequest.newBuilder()
							.uri(URI.create("https://randomuser.me/api/?results=30"))
							
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
				}users=false;
				
				break;
			
			case 2:
				
				break;
			
			case 3:
				break;
			
			case 4:
				
				
				
				break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
	
	}
	}
}
