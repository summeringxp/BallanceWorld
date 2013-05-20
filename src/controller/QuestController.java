package controller;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import ballanceBallGame.GameRenderer;
import ballanceBallGame.GameSurfaceView;
import ballanceBallGame.MapDto;

import com.example.ballaceworldclient.MainActivity;
import com.example.ballaceworldclient.R;

public class QuestController extends Controller {
	private long tempRec;
	private GameSurfaceView menuView;
	private GameRenderer gameRenderer;

	private Button start, back, reset;
	private int time = 0;

	public QuestController(MainActivity m) {
		super(m);
		
		

	}

	public void doQuestAction(int selected) {
		MapDto mdto = new MapDto(selected);
		
		mainActivity.getMainpageController().getGameRenderer().changeMap(mdto);
		mainActivity.getMainpageController().setMenuInvisible();
		
	}

}
