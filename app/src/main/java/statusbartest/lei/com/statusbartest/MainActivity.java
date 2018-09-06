package statusbartest.lei.com.statusbartest;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//StatusBarUtil.setColor使用时，标题不被遮住，因为StatusBarUtil.setColor方法中有fitSystemWindows=true。
// EditView 外有ScrollView时，软键盘弹出时ScrollView也能滑动。
// 注意： StatusBarUtil.setColor方法要在setContentView之后调用。因为setColor有setRootView方法

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        StatusBarUtil.setColor(this,getResources().getColor(R.color.bgColor),0);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button btn_next = (Button)findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
