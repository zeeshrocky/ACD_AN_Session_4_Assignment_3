package com.example.admin.gridview;

/**
 * Created by Admin on 04-Aug-16.
 */
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class BaseAdaptorLearn extends BaseAdapter {
    private Context context;
    //MainActivity obj= new MainActivity();
    //List<MainActivity.listItems> listitm= obj.getItems();

    public BaseAdaptorLearn(Context a){
        this.context=a;
        Log.i("cons","tructore");
    }

    @Override
    public int getCount() {
        //Log.i("count", String.valueOf(listitm.size()));
        return 9;

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
        Log.i("inside ","getvEW");

        if (convertView==null){
            LayoutInflater inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.listitem,parent,false);
        }
        ImageView nam=(ImageView)convertView.findViewById(R.id.textview1);
        Log.i("Position: ", String.valueOf(position));
        switch (position){
            case 0: nam.setImageResource(R.drawable.and1);break;
            case 1: nam.setImageResource(R.drawable.and2);break;
            case 2: nam.setImageResource(R.drawable.and3);break;
            case 3: nam.setImageResource(R.drawable.and4);break;
            case 4: nam.setImageResource(R.drawable.and5);break;
            case 5: nam.setImageResource(R.drawable.and6);break;
            case 6: nam.setImageResource(R.drawable.and7);break;
            case 7: nam.setImageResource(R.drawable.and8);break;
            case 8: nam.setImageResource(R.drawable.and9);break;
        }
        return convertView;
    }
}
