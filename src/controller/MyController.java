package controller;

import model.GameUser;

import com.example.ballaceworldclient.MainActivity;
import com.example.ballaceworldclient.MyJavaScriptInterface;
import com.example.ballaceworldclient.R;

import android.annotation.SuppressLint;
import android.provider.Settings.Secure;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

@SuppressLint("JavascriptInterface")
public class MyController {
	MainActivity mainActivity;

	WebView myBrowser;
	EditText msg;
	Button btnSendMsg;

	EditText username;
	EditText password;
	EditText deviceid;
	Button submit;
	TextView errorMsg;
	/**
	 * @param args
	 */
	public MyController(MainActivity m) {

		mainActivity = m;
	}

	public void doRegisterAction() {
		mainActivity.setContentView(R.layout.login);
		username = (EditText) mainActivity.findViewById(R.id.username);
		password = (EditText) mainActivity.findViewById(R.id.password);
		deviceid = (EditText) mainActivity.findViewById(R.id.device);
		errorMsg = (TextView) mainActivity.findViewById(R.id.errorMsg);
		submit =   (Button) mainActivity.findViewById(R.id.submit);
		deviceid.setText("Device: "+Secure.getString(mainActivity.getContentResolver(),Secure.ANDROID_ID));
		
		submit.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String usernametext = username.getText().toString();
				String passwordtext = password.getText().toString();
				boolean loginSuccess = GameUser.getInstance().register(usernametext,passwordtext);
				if(loginSuccess){
					errorMsg.setText(mainActivity.getGameUser().getMood());
				}else{
					errorMsg.setText("Login Failed.");
					return;
				}
			}
		});
		
	}

	@SuppressLint({ "JavascriptInterface", "SetJavaScriptEnabled" })
	public void doTestAction() {
	
		mainActivity.setContentView(R.layout.activity_main);

		myBrowser = (WebView) mainActivity.findViewById(R.id.mybrowser);

		final MyJavaScriptInterface myJavaScriptInterface = new MyJavaScriptInterface(
				mainActivity);
		myBrowser.addJavascriptInterface(myJavaScriptInterface,
				"AndroidFunction");

		myBrowser.getSettings().setJavaScriptEnabled(true);

		msg = (EditText) mainActivity.findViewById(R.id.msg);
		btnSendMsg = (Button) mainActivity.findViewById(R.id.sendmsg);
		myBrowser.loadUrl("file:///android_asset/mypage.html");
		btnSendMsg.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String msgToSend = msg.getText().toString();
				myBrowser.loadUrl("javascript:callFromActivity(\"" + msgToSend
						+ "\")");

			}
		});
	}

}
