package demo.com.gradlelibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by Kinnari on 1/10/2018.
 */

public class MyView extends LinearLayout {
    public MyView(Context context) {
        super(context);
        initialize(context);
    }
    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private void initialize(Context context){
        inflate(context, R.layout.my_view, this);
    }
}
