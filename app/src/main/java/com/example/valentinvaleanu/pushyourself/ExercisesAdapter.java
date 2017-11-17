package com.example.valentinvaleanu.pushyourself;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Tina on 07-Nov-17.
 */

public class ExercisesAdapter extends ArrayAdapter<Exercises> {

    public ExercisesAdapter(Activity context, ArrayList<Exercises> exercises) {
        super(context,0, exercises);
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listItemView=convertView;
        if(listItemView==null)
        {
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.custom_layout_exercises,parent,false);
        }
        Exercises currentExercise=getItem(position);

        ImageView icon=(ImageView)listItemView.findViewById(R.id.img_exercise);
        icon.setImageResource(currentExercise.getImgSrc());

        TextView name=(TextView)listItemView.findViewById(R.id.text_exercise);
        name.setText(String.valueOf(currentExercise.getName()));

        return listItemView;
    }
}
