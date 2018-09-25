package cn.songhaiqing.animation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * 动画例子
 */
public class AnimationExampleActivity extends Activity implements OnClickListener {

    Button btn_alpha;//渐变透明度动画效果
    Button btn_scale; //渐变尺寸伸缩动画效果
    Button btn_translate;// 画面转换位置移动动画效果
    Button btn_rotate;//画面转移旋转动画效果

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        getView();
        setOnclikListener();
    }

    private void getView() {
        btn_alpha = (Button) findViewById(R.id.btn_alpha);
        btn_scale = (Button) findViewById(R.id.btn_scale);
        btn_translate = (Button) findViewById(R.id.btn_translate);
        btn_rotate = (Button) findViewById(R.id.btn_rotate);
    }

    private void setOnclikListener() {
        btn_alpha.setOnClickListener(this);
        btn_scale.setOnClickListener(this);
        btn_translate.setOnClickListener(this);
        btn_rotate.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btn_alpha:
                intent = new Intent(AnimationExampleActivity.this, AnimationAlphaActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_scale:
                intent = new Intent(AnimationExampleActivity.this, AnimationScaleActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_translate:
                intent = new Intent(AnimationExampleActivity.this, AnimationTranslateActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_rotate:
                intent = new Intent(AnimationExampleActivity.this, AnimationRotateActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }
}