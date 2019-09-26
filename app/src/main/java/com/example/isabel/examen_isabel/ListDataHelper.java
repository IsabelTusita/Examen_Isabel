package com.example.isabel.examen_isabel;

import android.widget.ListView;

import java.util.ArrayList;

public class ListDataHelper {
    public static ArrayList<oto> provideItems(){
        ArrayList<oto> list = new ArrayList<>();
        list.add(new oto(R.drawable.ic_circulo, "HOLO BLUE BRICHT", android.R.color.holo_blue_bright));
        list.add(new oto(R.drawable.ic_circulo, "HOLO BLUE LIGHT", android.R.color.holo_blue_light));
        list.add(new oto(R.drawable.ic_circulo, "HOLO GREEN LICHT", android.R.color.holo_green_light));
        list.add(new oto(R.drawable.ic_circulo, "HOLO ORANGE LIGHT",android.R.color.holo_orange_light));
        list.add(new oto(R.drawable.ic_circulo, "HOLO RED LIGHT",android.R.color.holo_red_light));
        list.add(new oto(R.drawable.ic_circulo, "HOLO PURPLE", android.R.color.holo_purple));
        list.add(new oto(R.drawable.ic_circulo, "HOLO BLUE DARK", android.R.color.holo_blue_dark));
        list.add(new oto(R.drawable.ic_circulo, "HOLO GREEN DARK", android.R.color.holo_green_dark));
        list.add(new oto(R.drawable.ic_circulo, "HOLO RED DARK", android.R.color.holo_red_dark));
        list.add(new oto(R.drawable.ic_circulo, "HOLO ORANGE DARK", android.R.color.holo_orange_dark));

        return list;
    }
}
