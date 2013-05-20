package controller;

import com.example.ballaceworldclient.MainActivity;

public abstract class Controller {
	MainActivity mainActivity;
	/**
	 * @param args
	 */
	public Controller(MainActivity m) {

		mainActivity = m;
	}

}
