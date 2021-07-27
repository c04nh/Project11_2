package kr.hs.emirim.w2038.project11_2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class GallertAdapter extends BaseAdapter {
    Context context;
    int[] posterIds = {R.drawable.arrival, R.drawable.atomicblond, R.drawable.basis, R.drawable.bombshell, R.drawable.cameron,
                        R.drawable.chicago, R.drawable.devilwearsprada, R.drawable.floridaproject, R.drawable.ghostbusters, R.drawable.honnest,
                        R.drawable.littlewomen, R.drawable.madmax};
    ImageView imgvLarge;
    public GallertAdapter(Context context, ImageView imageLarge){
        this.context = context;
        this.imgvLarge = imageLarge;
    }
    @Override
    public int getCount() {
        return posterIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgv = new ImageView(context);
        imgv.setLayoutParams(new Gallery.LayoutParams(200, 300));
        imgv.setImageResource(posterIds[position]);
        imgv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        final int pos = position;
        imgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgvLarge.setImageResource(posterIds[pos]);
            }
        });
        return imgv;
    }
}
