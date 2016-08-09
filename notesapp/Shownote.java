package com.example.jatin.notesapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class Shownote extends DialogFragment{
    private Note mNote;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){

        AlertDialog.Builder builder= new AlertDialog.Builder(getActivity());
        LayoutInflater inflater=getActivity().getLayoutInflater();
        View shownote=inflater.inflate(R.layout.show_note,null);
        TextView title=(TextView)shownote.findViewById(R.id.textView);
        TextView desc=(TextView)shownote.findViewById(R.id.textView2);
        title.setText(mNote.getmTitle());
        desc.setText(mNote.getmDescription());
        Button close=(Button)shownote.findViewById(R.id.button3);
        builder.setView(shownote).setMessage("Yourmessage");

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();

            }

        });
        return builder.create();
    }
    public void sendNoteSelected(Note noteSelected) {
        mNote = noteSelected;
    }
}
