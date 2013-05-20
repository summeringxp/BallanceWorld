package view.tabs;

import com.example.ballaceworldclient.MainActivity;
import com.example.ballaceworldclient.R;


import android.app.Dialog;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
 
public class QuestFragment extends ListFragment{
	static MainActivity mainActivity;
    /** An array of items to display in ArrayList */
    String questNames[] = new String[]{
        "砂谷の入り口",
        "谷底の橋",
        "森の坂道",
        "氷河に繋ぐ道",
        "適当な名前5",
        "適当な名前6",
        "適当な名前7",
        "適当な名前8",
    };
    int selected=0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
 
        /** Creating array adapter to set data in listview */
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity().getBaseContext(), android.R.layout.simple_list_item_multiple_choice, questNames);
 
        /** Setting the array adapter to the listview */
        setListAdapter(adapter);
 
        return super.onCreateView(inflater, container, savedInstanceState);
    }
 
    @Override
    public void onStart() {
        super.onStart();
 
        /** Setting the multiselect choice mode for the listview */
        getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
    }
    @Override
	public void onListItemClick(ListView l, View v, int position, long id) {
       selected = l.getCheckedItemPosition();
       final Dialog dialog = new Dialog(super.getActivity());
		dialog.setContentView(R.layout.dialog);
		dialog.setTitle(questNames[selected]);

		// set the custom dialog components - text, image and button
		final TextView text = (TextView) dialog.findViewById(R.id.text);
		text.setText("Show Quest preview here.(future work)");
		ImageView image = (ImageView) dialog.findViewById(R.id.image);
		image.setImageResource(R.drawable.ic_launcher);

		Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);
		Button dialogButton2 = (Button) dialog.findViewById(R.id.dialogButtonCancel);
		// if button is clicked, close the custom dialog
		dialogButton.setOnTouchListener(new OnTouchListener() {
		
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				text.setText(String.valueOf(selected));
				dialog.dismiss();
				mainActivity.getQuestController().doQuestAction(selected);
				
				return false;
			}
		});
		
		dialogButton2.setOnTouchListener(new OnTouchListener() {
		
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				dialog.dismiss();
				return false;
			}
		});

		dialog.show();
       
    }

	public static void setMainActivity(MainActivity m) {
		// TODO Auto-generated method stub
		mainActivity = m;
	}
}