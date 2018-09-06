package statusbartest.lei.com.statusbartest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
//全屏下沉浸式状态栏下即StatusBarUtil.setTranslucentForImageView(this,0,null);  使用时layout中设置android:fitsSystemWindows="true"，ScrollView滑动导航栏不透明。
//全屏下沉浸式状态栏下即StatusBarUtil.setTranslucentForImageView(this,0,null);  使用时layout中不设置android:fitsSystemWindows="true"，ScrollView滑动导航栏透明。
//全屏下沉浸式状态栏下，设置android:fitsSystemWindows="true"，无View，标题不被遮挡，EditView 外有ScrollView时，软键盘弹出时ScrollView也能滑动。
//全屏下沉浸式状态栏下，不设置android:fitsSystemWindows="true"，有View，标题不被遮挡，EditView 外有ScrollView时，软键盘弹出时ScrollView不能滑动。
//全屏下沉浸式状态栏下，不设置android:fitsSystemWindows="true"，无View，标题被遮挡，EditView 外有ScrollView时，软键盘弹出时ScrollView不能滑动。
   /* <View
            android:id="@+id/fake_status_bar"
            android:layout_width="match_parent"
            android:layout_height="@dimen/statusbar_view_height" />*/
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        StatusBarUtil.setTranslucentForImageView(this,0,null);
    }
}
