package cn.ytxu.androidbackflow.sample.container.letter;

import cn.ytxu.androidbackflow.sample.container.BaseLetterFragment;

/**
 * Created by newchama on 17/1/3.
 */
public class LetterGFragment extends BaseLetterFragment {

    @Override
    protected void initView() {
        super.initView();


        setRollbackFlow(LetterDFragment.class);
    }
}
