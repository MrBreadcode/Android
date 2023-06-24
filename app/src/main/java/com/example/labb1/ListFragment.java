package com.example.labb1;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class ListFragment extends Fragment {

    private String[] mBooks = {"Tempting the Best Man", "1001 Dark Nights: Bundle Six", "The Prince: A Wicked Novella", "A Shadow in the Ember",
            "The Emperor's Soul", "White Sand", "The Stormlight Archive", "Cytonic",
            "A Blink of the Screen", "The Long Space", "Soul Music", "Night Watch",
            "The Eye of the World: The Wheel of Time", "The Eye of the World: The Great Hunt", "The Eye of the World: The Dragon Reborn", "The Eye of the World: The Shadow Rising"};
    int[] mImageIds = {R.drawable.armentrout_2012, R.drawable.armentrout_2016, R.drawable.armentrout_2018, R.drawable.armentrout_2021,
            R.drawable.sanderson_2012, R.drawable.sanderson_2016, R.drawable.sanderson_2018, R.drawable.sanderson_2021,
            R.drawable.pratchett_2012, R.drawable.pratchett_2016, R.drawable.pratchett_2018, R.drawable.pratchett_2021,
            R.drawable.jordan_2012, R.drawable.jordan_2016, R.drawable.jordan_2018, R.drawable.jordan_2021};

    private Books mAdapter;
    private class Books extends BaseAdapter {
        private LayoutInflater mLayoutInflater;

        Books(Context context) {
            mLayoutInflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return mBooks.length;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null)
                convertView = mLayoutInflater.inflate(R.layout.fragment_list, null);

            ImageView image = (ImageView) convertView.findViewById(R.id.image_view_icon);
            image.setImageResource(mImageIds[position]);

            return convertView;
        }

        String getString(int position) {
            return mBooks[position] ;
        }

       int getInt(int position) {
            return mImageIds[position];
        }
    }
}