package kr.hs.emirim.w2038.project11_2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class GallertAdapter extends BaseAdapter {
    Context context;
    int[] posterIds = {R.drawable.arrival, R.drawable.atomicblond, R.drawable.basis, R.drawable.bombshell, R.drawable.cameron,
                        R.drawable.chicago, R.drawable.devilwearsprada, R.drawable.floridaproject, R.drawable.ghostbusters, R.drawable.honnest,
                        R.drawable.littlewomen, R.drawable.madmax};
    String[] titleIds = {"컨택트", "아토믹 블론드", "세상을 바꾼 변호인", "밤쉘", "카메론 포스트의 잘못된 교육",
                        "시카고", "악마는 프라다를 입는다", "플로리다 프로젝트", "고스트버스터즈", "정직한 후보",
                        "작은 아씨들", "매드맥스"};
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
                Toast toast = new Toast(context);
                View toastView = View.inflate(context, R.layout.toast1, null);
                TextView textTitle = toastView.findViewById(R.id.text_title);
                textTitle.setText(titleIds[pos]);
                toast.setView(toastView);
                toast.show();

            }
        });
        return imgv;
    }
}
