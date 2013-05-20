package com.example.ballaceworldclient;

import model.GameUser;
import controller.LoginController;
import controller.MainpageController;
import controller.QuestController;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

@TargetApi(Build.VERSION_CODES.GINGERBREAD)
@SuppressLint({ "JavascriptInterface", "NewApi", "CommitPrefEdits" })
public class MainActivity extends FragmentActivity {
	public static final String PREFS_NAME = "MyPrefsFile";
	LoginController loginController;
	MainpageController mainpageController;
	QuestController questController;

	/** Called when the activity is first created. */
	@TargetApi(Build.VERSION_CODES.GINGERBREAD)
	@SuppressLint("NewApi")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON,
				WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
				.permitAll().build();
		StrictMode.setThreadPolicy(policy);

		SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
		int userid = settings.getInt("userid", -1);

		loginController = new LoginController(this);
		mainpageController = new MainpageController(this);
		questController = new QuestController(this);
		if (userid == -1) {
			loginController.doRegisterAction();

		} else {
			mainpageController.showMainpageAction();
		}
	}

	public LoginController getLoginController() {
		return this.loginController;
	}

	public MainpageController getMainpageController() {
		return mainpageController;
	}

	public QuestController getQuestController() {
		return questController;
	}

}