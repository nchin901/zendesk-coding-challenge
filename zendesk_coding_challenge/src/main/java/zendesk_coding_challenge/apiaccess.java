package zendesk_coding_challenge;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

public class apiaccess {
	//encode credentials
	public static String encodedCredential() {
		String token = "illQC1YY3zduFdXLm2qa0TE6wSd4iW1RUaYHHUfA";
		String accessString = "nchintal@usc.edu/token:" + token;
		String encodedCredential = new String(Base64.getEncoder().encode(accessString.getBytes()));
        return encodedCredential;
	}
	
	//access the api

	public String zendeskaccess() {
		String cred = encodedCredential();
		String lineString = "";
		try {
			URL url = new URL(
					"https://zccnishi.zendesk.com/api/v2/tickets.json");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestProperty("Authorization", "Basic " + cred);
			connection.setRequestProperty("Accept", "application/json");
			System.out.println(connection);
			InputStream istream = connection.getInputStream();
			InputStreamReader iStreamReader = new InputStreamReader(istream);
			BufferedReader bReader = new BufferedReader(iStreamReader);	
			lineString = bReader.readLine();
			System.out.println(lineString);
			bReader.close();
			
		}catch (Exception e) {
			System.out.println("exception in zendeskaccess: " + e.getMessage());
		}
		return lineString;
	}
}
