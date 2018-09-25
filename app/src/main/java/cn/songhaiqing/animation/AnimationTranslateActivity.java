package cn.songhaiqing.animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class AnimationTranslateActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.an_translate);
		ImageView imgv=(ImageView) findViewById(R.id.img);
		Animation alphaAnimation=AnimationUtils.loadAnimation(this, R.anim.translate);
		imgv.startAnimation(alphaAnimation);
	}
}
