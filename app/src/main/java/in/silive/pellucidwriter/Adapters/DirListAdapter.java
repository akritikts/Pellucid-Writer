package in.silive.pellucidwriter.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import in.silive.pellucidwriter.R;

/**
 * Created by akriti on 1/3/17.
 */

public class DirListAdapter extends BaseAdapter {


    ArrayList<String> dirList;
    Context context;
    LayoutInflater layoutInflater;

    public DirListAdapter(Context context, ArrayList<String> dirList) {
        this.context = context;
        this.dirList = dirList;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dirList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null)
            view = layoutInflater.inflate(R.layout.item_directory,null);
        TextView tv = (TextView)view.findViewById(R.id.tvDirName);
        tv.setText(dirList.get(i));
        return view;
    }
}
