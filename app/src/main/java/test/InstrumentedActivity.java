package test;

import com.example.jacoco.MainActivity;
import com.example.jacoco.ThreddActivity;

// 这里继承的是APP的MainActivity，在AndroidManifest.xml中寻找带有"android.intent.action.MAIN"属性的Activity
public class InstrumentedActivity extends MainActivity {
    public FinishListener finishListener ;
    public void  setFinishListener(FinishListener finishListener){
        this.finishListener = finishListener;
    }

    @Override
    public void onDestroy() {
        if (this.finishListener !=null){
            finishListener.onActivityFinished();
        }
        super.onDestroy();
    }

}