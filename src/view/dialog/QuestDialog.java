//package view.dialog;
//
//import com.example.ballaceworldclient.MainActivity;
//
//import android.R;
//import android.annotation.SuppressLint;
//import android.app.AlertDialog;
//import android.app.Dialog;
//import android.app.DialogFragment;
//import android.content.DialogInterface;
//import android.os.Bundle;
//
//@SuppressLint("NewApi")
//public class QuestDialog extends DialogFragment {
//	MainActivity mainActivity;
//	@SuppressLint("NewApi")
//	@Override
//    public Dialog onCreateDialog(Bundle savedInstanceState) {
//        // Use the Builder class for convenient dialog construction
//        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//        builder.setMessage("Message")
//               .setPositiveButton("Play", new DialogInterface.OnClickListener() {
//                   public void onClick(DialogInterface dialog, int id) {
//                       // FIRE ZE MISSILES!
//                	   
//                   }
//               })
//               .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
//                   public void onClick(DialogInterface dialog, int id) {
//                       // User cancelled the dialog
//                   }
//               });
//        // Create the AlertDialog object and return it
//        return builder.create();
//    }
//	public void setMainActivity(MainActivity mainActivity) {
//		this.mainActivity = mainActivity;
//	}
//	
//}