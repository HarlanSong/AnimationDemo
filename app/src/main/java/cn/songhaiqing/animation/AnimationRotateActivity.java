package cn.songhaiqing.animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;



public class AnimationRotateActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.an_rotate);
		ImageView imgv=(ImageView) findViewById(R.id.img);
		Animation alphaAnimation=AnimationUtils.loadAnimation(this, R.anim.rotate);
		imgv.startAnimation(alphaAnimation);
	}
}
