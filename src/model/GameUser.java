package model;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.example.utils.CommonUtils;

import android.util.Log;

public class GameUser {

	/**
	 * @param args
	 */
	private int id;
	private String username;
	
	private String mood;
	private static GameUser gameUser;

	private GameUser() {
		id = -1;
		mood = "sad";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static GameUser getInstance() {
		// TODO Auto-generated method stub
		if (gameUser == null) {
			gameUser = new GameUser();
		}
		return gameUser;
	}

	public int getId() {
		return id;
	}

	public int register(String usernametext, String passwordtext, String deviceidtext) {
		// TODO Auto-generated method stub
		int userid = -1;
		DefaultHttpClient httpclient = new DefaultHttpClient();
		try {
			
			HttpPost httpPost = new HttpPost(GameConfig.SERVERHOME+GameConfig.REGISTERURL);
			List<NameValuePair> nvps = new ArrayList<NameValuePair>();
			nvps.add(new BasicNameValuePair("username", usernametext));
			nvps.add(new BasicNameValuePair("password", passwordtext));
			nvps.add(new BasicNameValuePair("deviceid", deviceidtext));
			httpPost.setEntity(new UrlEncodedFormEntity(nvps));
			HttpResponse response = httpclient.execute(httpPost);
		
			HttpEntity entity = response.getEntity();

			// If the response does not enclose an entity, there is no need
			// to bother about connection release
			if (entity != null) {
				InputStream instream = entity.getContent();
				try {
					instream.read();
					
					
					mood = CommonUtils.getStringFromInputStream(instream);
					userid = mood.length();
					Log.i("tag", mood);
					// do something useful with the response
				} catch (IOException ex) {
					// In case of an IOException the connection will be released
					// back to the connection manager automatically
					throw ex;
				} catch (RuntimeException ex) {
					// In case of an unexpected exception you may want to abort
					// the HTTP request in order to shut down the underlying
					// connection immediately.
					httpPost.abort();
					throw ex;
				} finally {
					// Closing the input stream will trigger connection release
					try {
						instream.close();
					} catch (Exception ignore) {
					}
				}
			}

		}  catch (Exception e) {
			userid = -1;
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// When HttpClient instance is no longer needed,
			// shut down the connection manager to ensure
			// immediate deallocation of all system resources
			httpclient.getConnectionManager().shutdown();
		}
		return userid;
	}

	public String getMood() {
		return mood;
	}

}
