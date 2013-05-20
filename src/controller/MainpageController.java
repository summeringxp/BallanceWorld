package controller;

import view.tabs.CastleFragment;
import view.tabs.DummyTabContent;
import view.tabs.ItemFragment;
import view.tabs.OtherCastlesFragment;
import view.tabs.QuestFragment;
import view.tabs.ShopFragment;
import view.tabs.SocialFragment;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TabWidget;
import ballanceBallGame.GameRenderer;
import ballanceBallGame.GameSurfaceView;
import ballanceBallGame.MapDto;

import com.example.ballaceworldclient.MainActivity;
import com.example.ballaceworldclient.R;

public class MainpageController extends Controller {
	TabHost tHost;
	//TabWidget tw;
	private long tempRec;
	private GameSurfaceView menuView;
	private GameRenderer gameRenderer;

	private Button start, back, reset;
	private int time = 0;
	public MainpageController(MainActivity m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	public void showMainpageAction() {
		mainActivity.setContentView(R.layout.mainpage);
		MapDto mdto = new MapDto();
		gameRenderer = GameRenderer.getInstance(mdto, mainActivity);
		gameRenderer.getGameManager().setRecordTime(Integer.MAX_VALUE);
		menuView = (GameSurfaceView) mainActivity.findViewById(R.id.menuview);
		
		menuView.setGameRenderer(gameRenderer);

		start = (Button) mainActivity.findViewById(R.id.start2);
		back = (Button) mainActivity.findViewById(R.id.back2);
		reset = (Button) mainActivity.findViewById(R.id.reset2);
		
		start.setVisibility(View.INVISIBLE);
		back.setVisibility(View.INVISIBLE);
		reset.setVisibility(View.INVISIBLE);
		menuView.setVisibility(View.INVISIBLE);
		
		reset.setOnClickListener(mResetListener);
		back.setOnClickListener(mBackListener);
		start.setOnClickListener(mStartListener);
		final Handler mHandler = new Handler() {
			public void handleMessage(Message msg) {

				menuView.setVisibility(View.INVISIBLE);
				time = msg.what;
				showDialog();
			}

		};

		gameRenderer.setHandler(mHandler);
		
		
		
		tHost = (TabHost) mainActivity.findViewById(android.R.id.tabhost);
	//	tw = (TabWidget) mainActivity.findViewById(android.R.id.tabs);
		tHost.setup();

		/**
		 * Defining Tab Change Listener event. This is invoked when tab is
		 * changed
		 */
		TabHost.OnTabChangeListener tabChangeListener = new TabHost.OnTabChangeListener() {

			@Override
			public void onTabChanged(String tabId) {
				android.support.v4.app.FragmentManager fm = mainActivity
						.getSupportFragmentManager();
				QuestFragment questFragment = (QuestFragment) fm
						.findFragmentByTag("quest");
				questFragment.setMainActivity(mainActivity);
				OtherCastlesFragment otherCastlesFragment = (OtherCastlesFragment) fm
						.findFragmentByTag("othercastles");
				CastleFragment castleFragment = (CastleFragment) fm
						.findFragmentByTag("castle");
				ItemFragment itemFragment = (ItemFragment) fm
						.findFragmentByTag("item");
				ShopFragment shopFragment = (ShopFragment) fm
						.findFragmentByTag("shop");
				SocialFragment socialFragment = (SocialFragment) fm
						.findFragmentByTag("social");
				android.support.v4.app.FragmentTransaction ft = fm
						.beginTransaction();

				if (questFragment != null)
					ft.detach(questFragment);
				
				if (otherCastlesFragment != null)
					ft.detach(otherCastlesFragment);

				if (castleFragment != null)
					ft.detach(castleFragment);
				
				if (itemFragment != null)
					ft.detach(itemFragment);
				
				if (shopFragment != null)
					ft.detach(shopFragment);
				
				if (socialFragment != null)
					ft.detach(socialFragment);

				/** If current tab is android */
				if (tabId.equalsIgnoreCase("quest")) {

					if (questFragment == null) {
						/**
						 * Create AndroidFragment and adding to
						 * fragmenttransaction
						 */
						ft.add(R.id.Quest, new QuestFragment(), "quest");
					} else {
						/**
						 * Bring to the front, if already exists in the
						 * fragmenttransaction
						 */
						ft.attach(questFragment);
					}

				} else if (tabId.equalsIgnoreCase("castle")){
					/** If current tab is apple */
					if (castleFragment == null) {
						/**
						 * Create AppleFragment and adding to
						 * fragmenttransaction
						 */
						ft.add(R.id.Castle, new CastleFragment(), "castle");
					} else {
						/**
						 * Bring to the front, if already exists in the
						 * fragmenttransaction
						 */
						ft.attach(castleFragment);
					}
				}else if (tabId.equalsIgnoreCase("othercastles")){
					if (otherCastlesFragment == null) {
					
						ft.add(R.id.Shop, new OtherCastlesFragment(), "othercastles");
					} else {
				
						ft.attach(otherCastlesFragment);
					}
				}else if (tabId.equalsIgnoreCase("item")){
					/** If current tab is apple */
					if (itemFragment == null) {
						/**
						 * Create AppleFragment and adding to
						 * fragmenttransaction
						 */
						ft.add(R.id.Item, new ItemFragment(), "item");
					} else {
						/**
						 * Bring to the front, if already exists in the
						 * fragmenttransaction
						 */
						ft.attach(itemFragment);
					}
				}else if (tabId.equalsIgnoreCase("shop")){
					/** If current tab is apple */
					if (shopFragment == null) {
						/**
						 * Create AppleFragment and adding to
						 * fragmenttransaction
						 */
						ft.add(R.id.Shop, new ShopFragment(), "shop");
					} else {
						/**
						 * Bring to the front, if already exists in the
						 * fragmenttransaction
						 */
						ft.attach(shopFragment);
					}
				}else{
					/** If current tab is apple */
					if (socialFragment == null) {
						/**
						 * Create AppleFragment and adding to
						 * fragmenttransaction
						 */
						ft.add(R.id.Social, new SocialFragment(), "social");
					} else {
						/**
						 * Bring to the front, if already exists in the
						 * fragmenttransaction
						 */
						ft.attach(socialFragment);
					}
				}
				
				ft.commit();
			}
		};

		/** Setting tabchangelistener for the tab */
		tHost.setOnTabChangedListener(tabChangeListener);

		/** Defining tab builder for Andriod tab */
		TabHost.TabSpec tSpecQuest = tHost.newTabSpec("quest");
	    tSpecQuest.setIndicator("Quest",mainActivity.getResources().getDrawable(R.drawable.icon));
		tSpecQuest.setContent(new DummyTabContent(mainActivity
				.getBaseContext()));
		tHost.addTab(tSpecQuest);
		
		TabHost.TabSpec tSpecOtherCastles = tHost.newTabSpec("othercastles");
	    tSpecOtherCastles.setIndicator("Other Castles",mainActivity.getResources().getDrawable(R.drawable.icon));
		tSpecOtherCastles.setContent(new DummyTabContent(mainActivity
				.getBaseContext()));
		tHost.addTab(tSpecOtherCastles);

		/** Defining tab builder for Apple tab */
		TabHost.TabSpec tSpecCastle = tHost.newTabSpec("castle");
		tSpecCastle.setIndicator("Castle",mainActivity.getResources().getDrawable(R.drawable.icon));
		tSpecCastle
				.setContent(new DummyTabContent(mainActivity.getBaseContext()));
		tHost.addTab(tSpecCastle);
		
		/** Defining tab builder for Apple tab */
		TabHost.TabSpec tSpecItem = tHost.newTabSpec("item");
		tSpecItem.setIndicator("Item",mainActivity.getResources().getDrawable(R.drawable.icon));
		tSpecItem
				.setContent(new DummyTabContent(mainActivity.getBaseContext()));
		tHost.addTab(tSpecItem);
		
		/** Defining tab builder for Apple tab */
		TabHost.TabSpec tSpecShop = tHost.newTabSpec("shop");
		tSpecShop.setIndicator("Shop",mainActivity.getResources().getDrawable(R.drawable.icon));
		tSpecShop
				.setContent(new DummyTabContent(mainActivity.getBaseContext()));
		tHost.addTab(tSpecShop);
		
		/** Defining tab builder for Apple tab */
		TabHost.TabSpec tSpecSocial = tHost.newTabSpec("social");
		tSpecSocial.setIndicator("Social",mainActivity.getResources().getDrawable(R.drawable.icon));
		tSpecSocial
				.setContent(new DummyTabContent(mainActivity.getBaseContext()));
		tHost.addTab(tSpecSocial);

	}
	
	OnClickListener mStartListener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub

			gameRenderer.getGameManager().reset();
			gameRenderer.getGameManager().setRecordTime(tempRec);
			gameRenderer.getGameManager().setGameStep(1);
			// gameRenderer.changeMap(md.find(mapindex));

			// updateButtonState(1);
		}

	};
	OnClickListener mResetListener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub

			gameRenderer.getGameManager().reset();

		}

	};
	OnClickListener mBackListener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub

			gameRenderer.getGameManager().reset();
			gameRenderer.getGameManager().setGameStep(0);
			// gameRenderer.changeMap(md.find(mapindex));

			// updateButtonState(0);
			mainActivity.getMainpageController().setMenuVisible();

		}

	};

	private void showDialog() {
		AlertDialog.Builder alert = new AlertDialog.Builder(mainActivity);

		alert.setNegativeButton("Cancel",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int whichButton) {
						// Canceled.
						gameRenderer.getGameManager().reset();

						menuView.setVisibility(View.VISIBLE);
					}
				});

		alert.setTitle("You Win! " + time / 1000.0 + "s");

		alert.setNegativeButton("Retry", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int whichButton) {
				// Canceled.
				gameRenderer.getGameManager().reset();
				menuView.setVisibility(View.VISIBLE);
			}
		});

		alert.show();
	}

	protected void setMenuVisible() {
		// TODO Auto-generated method stub
		start.setVisibility(View.INVISIBLE);
		back.setVisibility(View.INVISIBLE);
		reset.setVisibility(View.INVISIBLE);
		menuView.setVisibility(View.INVISIBLE);
		tHost.setVisibility(View.VISIBLE);
	//	tw.setVisibility(View.VISIBLE);
	}

	public void setMenuInvisible() {
		// TODO Auto-generated method stub
		start.setVisibility(View.VISIBLE);
		back.setVisibility(View.VISIBLE);
		reset.setVisibility(View.VISIBLE);
		menuView.setVisibility(View.VISIBLE);
		tHost.setVisibility(View.INVISIBLE);
		//tw.setVisibility(View.INVISIBLE);
	}

	public GameRenderer getGameRenderer() {
		return gameRenderer;
	}
	

}
