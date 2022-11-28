package API;
import java.util.Scanner;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

import first.Course;

import java.net.URI;
import java.net.http.HttpClient;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

public class Api {
	
	private static String nat;
	private static String logian;
	private static HttpResponse<String> response;

	public static void main(String[] args) {
		
		HttpClient client = HttpClient.newHttpClient();

		boolean menue=true;
		boolean users=true;
		boolean nat=true;

		Scanner sa=new Scanner(System.in);
		while(menue) {
			System.out.println("1.multple users");
			System.out.println("2.pagination");
			System.out.println("3.passward");
			System.out.println("4.seeding");
			System.out.println("5.Nationalities");
			System.out.println("6.Including/Excluding");
			//System.out.println("7.Files json");
			//System.out.println("7.Using previous versions");
			
		
			String bb = sa.next();
			int option = Integer.parseInt(bb);
			Random random;
			switch (option) {	
			
			
			
			
			case 1:
				while(users) {
					System.out.println("PLS ENTER USERS:");
					int user = sa.nextInt();
					if(user ==0) {
						
						try {
						HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://randomuser.me/api/?results=30")).build();
						HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
						System.out.println(response.body());
						String jsonvariable = response.body();
						Gson gson = new Gson();
						Random random1 = gson.fromJson(response.body(), Random .class);
						try {
							FileWriter file =new FileWriter("JSONFilewriter.txt");
							file.write(jsonvariable.toString());
							file.close();
							} catch (IOException e) {
							      
							      e.printStackTrace();
							    }
						System.out.println("JSON file created");
						
						try {
							FileReader read =new FileReader("JSONFileReader.txt");
							BufferedReader bufferedReader=new BufferedReader(read);
							String line;
							while ((line= bufferedReader.readLine())!=null) {
								System.out.println(line);
							}read.close();
							} catch (IOException e) {
							      
							      e.printStackTrace();
							    }
						System.out.println("JSON file created");
						
					
					

				

				
						
						
						for(int i=0; i<response.body().length();i++)
						{
						System.out.println("*********************");
						System.out.println(random1.getResults().get(i).getEmail());
						System.out.println(random1.getResults().get(i).getCell());
						System.out.println(random1.getResults().get(i).getGender());

						System.out.println("*********************");
						}
						}catch(Exception e)
						{
							System.out.println(e);

						}
					}else {
						try{
						System.out.println("PLS ENTER USERS:");
						int user1 = sa.nextInt();
						HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://randomuser.me/api/?results="+user1)).build();
						HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
						System.out.println(response.body());
						Gson gson = new Gson();
						Random random1 = gson.fromJson(response.body(), Random .class);
						
						for(int i=0; i<user1;i++)
						{
						System.out.println("*********************");
						System.out.println(random1.getResults().get(i).getEmail());
						System.out.println(random1.getResults().get(i).getCell());
						System.out.println(random1.getResults().get(i).getGender());

						System.out.println("*********************");
						}
						}catch(Exception e)
						{
							System.out.println(e);

						}
						System.out.println("0");
						int userStop = sa.nextInt();
						if(userStop == 0)
						{
							users = false;
						}

					}
					
				}
				
				
						break;
					
			case 2:
				
				try {
					System.out.println("PLS ENTER page:");
					int page = sa.nextInt();
					System.out.println("PLS ENTER Result:");
					int result = sa.nextInt();
					System.out.println("PLS Write Seed:");
					String seed = sa.next();
				HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://randomuser.me/api/?page="+page+"&results="+result+"&seed="+seed)).build();
				HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
				Gson gson = new Gson();
				String jsonvariable = response.body();
				Random random1 = gson.fromJson(response.body(), Random .class);
				try {
					FileWriter file =new FileWriter("JSONFilewriter.txt");
					file.write(jsonvariable.toString());
					file.close();
					} catch (IOException e) {
					      
					      e.printStackTrace();
					    }
				System.out.println("JSON file created");
				
				try {
					FileReader read =new FileReader("JSONFileReader.txt");
					BufferedReader bufferedReader=new BufferedReader(read);
					String line;
					while ((line= bufferedReader.readLine())!=null) {
						System.out.println(line);
					}read.close();
					} catch (IOException e) {
					      
					      e.printStackTrace();
					    }
				System.out.println("JSON file created");
				
				
				
				
				
				
				Random random11 = gson.fromJson(response.body(), Random .class);
				for(int i=0; i<result;i++)
				{
				System.out.println("*********************");
				System.out.println(random11.getResults().get(i).getEmail());
				System.out.println(random11.getResults().get(i).getCell());
				System.out.println(random11.getResults().get(i).getGender());
				System.out.println(random11.getInfo().getPage());
				System.out.println(random11.getInfo().getSeed());
				System.out.println("*********************");
				}
			
				}catch(Exception e)
				{
					System.out.println(e);

				}
				break;
			
			case 3:
				try {
					System.out.println("PLS Write Password:");
					String pass = sa.next();
					HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://randomuser.me/api/?password=0"+pass)).build();
					HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
					Gson gson = new Gson();
					String jsonvariable = response.body();
					Random random1 = gson.fromJson(response.body(), Random .class);
					try {
						FileWriter file =new FileWriter("JSONFilewriter.txt");
						file.write(jsonvariable.toString());
						file.close();
						} catch (IOException e) {
						      
						      e.printStackTrace();
						    }
					System.out.println("JSON file created");
					
					try {
						FileReader read =new FileReader("JSONFileReader.txt");
						BufferedReader bufferedReader=new BufferedReader(read);
						String line;
						while ((line= bufferedReader.readLine())!=null) {
							System.out.println(line);
						}read.close();
						} catch (IOException e) {
						      
						      e.printStackTrace();
						    }
					System.out.println("JSON file created");
					
					
					
					
					
					
					
					Random random12 = gson.fromJson(response.body(), Random .class);
					System.out.println("*********************");
					System.out.println(random12.getResults().get(0).getEmail());
					System.out.println(random12.getResults().get(0).getCell());
					System.out.println(random12.getResults().get(0).getGender());
					System.out.println(random12.getInfo().getPage());
					System.out.println(random12.getInfo().getSeed());
					System.out.println("*********************");
					}catch(Exception e)
					{
						System.out.println(e);

					}
				
				break;
			
			case 4:
				try {
					System.out.println("PLS Write Seed:");
					String seed = sa.next();
					HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://randomuser.me/api/?seed=0"+seed)).build();
					HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
					Gson gson = new Gson();
					String jsonvariable = response.body();
					Random random1 = gson.fromJson(response.body(), Random .class);
					try {
						FileWriter file =new FileWriter("JSONFilewriter.txt");
						file.write(jsonvariable.toString());
						file.close();
						} catch (IOException e) {
						      
						      e.printStackTrace();
						    }
					System.out.println("JSON file created");
					
					try {
						FileReader read =new FileReader("JSONFileReader.txt");
						BufferedReader bufferedReader=new BufferedReader(read);
						String line;
						while ((line= bufferedReader.readLine())!=null) {
							System.out.println(line);
						}read.close();
						} catch (IOException e) {
						      
						      e.printStackTrace();
						    }
					System.out.println("JSON file created");
					
					
					
					
					
					
					
					Random random13 = gson.fromJson(response.body(), Random .class);
					System.out.println(random13.getResults().get(0).getEmail());
					System.out.println(random13.getResults().get(0).getCell());
					System.out.println(random13.getResults().get(0).getGender());
					System.out.println(random13.getInfo().getPage());
					System.out.println(random13.getInfo().getSeed());
					System.out.println("*********************");
					}catch(Exception e)
					
					{
						System.out.println(e);

					}
				break;
				
			case 5:
				try {
					System.out.println("PLS Write Nationalities:");
					String Nat = sa.next();
					HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://randomuser.me/api/?nat="+Nat)).build();
					HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
					Gson gson = new Gson();
					String jsonvariable = response.body();
					Random random1 = gson.fromJson(response.body(), Random .class);
					try {
						FileWriter file =new FileWriter("JSONFilewriter.txt");
						file.write(jsonvariable.toString());
						file.close();
						} catch (IOException e) {
						      
						      e.printStackTrace();
						    }
					System.out.println("JSON file created");
					
					try {
						FileReader read =new FileReader("JSONFileReader.txt");
						BufferedReader bufferedReader=new BufferedReader(read);
						String line;
						while ((line= bufferedReader.readLine())!=null) {
							System.out.println(line);
						}read.close();
						} catch (IOException e) {
						      
						      e.printStackTrace();
						    }
					System.out.println("JSON file created");
					
					
					
					
					
					
					
					
					
					Random random14 = gson.fromJson(response.body(), Random .class);
					System.out.println(random14.getResults().get(0).getEmail());
					System.out.println(random14.getResults().get(0).getCell());
					System.out.println(random14.getResults().get(0).getGender());
					System.out.println(random14.getInfo().getPage());
					System.out.println(random14.getInfo().getSeed());
					System.out.println(random14.getResults().get(0).getNat());
					System.out.println("*********************");
					
					}catch(Exception e)
					
					{
						
						System.out.println(e);

					}
				break;
				
			
			 case 6:
			  
				 try {
					
					System.out.println("Enter the Result ?");
					int result = sa.nextInt();
					
					System.out.println("Enter Type of data to be Execluded ?");
					String userarr = sa.next();

					HttpRequest request = HttpRequest.newBuilder()
							.uri(URI.create(
									"https://randomuser.me/api/?exc=" + userarr))
							.build();
					HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
					// System.out.println("Random Users: \n" +response.body());
					String jsonvariable = response.body();
					Random random1 = new Gson().fromJson(response.body(), Random.class);
					Gson gson = new Gson();
					Random random15 = gson.fromJson(response.body(), Random .class);
					try {
						FileWriter file =new FileWriter("JSONFilewriter.txt");
						file.write(jsonvariable.toString());
						file.close();
						} catch (IOException e) {
						      
						      e.printStackTrace();
						    }
					System.out.println("JSON file created");
					
					try {
						FileReader read =new FileReader("JSONFileReader.txt");
						BufferedReader bufferedReader=new BufferedReader(read);
						String line;
						while ((line= bufferedReader.readLine())!=null) {
							System.out.println(line);
						}read.close();
						} catch (IOException e) {
						      
						      e.printStackTrace();
						    }
					System.out.println("JSON file created");
					
					
					
					
					
					
					
					
					
						for (int i = 0; i < result; i++) {
							if(random15.getResults().get(i).getGender()!=null) {
							System.out.println(random15.getResults().get(i).getGender());}
							if(random15.getResults().get(i).getEmail()!=null) {
							System.out.println(random15.getResults().get(i).getEmail());}
							if(random15.getResults().get(i).getNat()!=null) {
							System.out.println(random15.getResults().get(i).getNat());}
							System.out.println("***************************");
						}
				 }catch(Exception e)
					
					{
						System.out.println(e);

				}
				 
				 
				 try {
						
						System.out.println("Enter the Result ?");
						int result = sa.nextInt();
						
						System.out.println("Enter Type of data to be included ?");
						String incl = sa.next();

						HttpRequest request = HttpRequest.newBuilder()
								.uri(URI.create(
										"https://randomuser.me/api/?inc=" + incl))
								.build();
						HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
						// System.out.println("Random Users: \n" +response.body());
						Random random1 = new Gson().fromJson(response.body(), Random.class);
						
							for (int i = 0; i < result; i++) {
								if(random1.getResults().get(i).getGender()!=null) {
								System.out.println(random1.getResults().get(i).getGender());}
								if(random1.getResults().get(i).getEmail()!=null) {
								System.out.println(random1.getResults().get(i).getEmail());}
								if(random1.getResults().get(i).getNat()!=null) {
								System.out.println(random1.getResults().get(i).getNat());}
								System.out.println("***************************");
							}
					 }catch(Exception e)
						
						{
							System.out.println(e);

					}
						break;
//			 case 7:
//				 try {
//				      File myObj = new File("filename.txt");
//				      if (myObj.createNewFile()) {
//				        System.out.println("File created: " + myObj.getName());
//				      } else {
//				        System.out.println("File already exists.");
//				      }
//				    } catch (IOException e) {
//				      System.out.println("An error occurred.");
//				      e.printStackTrace();
//				    }
				  }
				
							//break;
		}
							{
      }menue = false;
		
	}
  }	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
	
