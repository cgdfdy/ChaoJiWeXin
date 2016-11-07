package cn.ucai.superwechat.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hyphenate.easeui.domain.User;
import com.hyphenate.easeui.utils.EaseUserUtils;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.ucai.superwechat.I;
import cn.ucai.superwechat.R;
import cn.ucai.superwechat.utils.MFGT;

/**
 * Created by Administrator on 2016/11/7.
 */
public class FriendProfileActivity extends BaseActivity {
    @Bind(R.id.findfrind_iv_back)
    ImageView findfrindIvBack;
    @Bind(R.id.findfriend_iv_userAvatar)
    ImageView findfriendIvUserAvatar;
    @Bind(R.id.findfriend_tv_usernick)
    TextView findfriendTvUsernick;
    @Bind(R.id.findfriend_tv_username)
    TextView findfriendTvUsername;
    User user =null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_profile);
        ButterKnife.bind(this);
        user = (User) getIntent().getSerializableExtra(I.User.USER_NAME);
        if (user==null){
            MFGT.finish(this);
        }
        initView();
    }

    private void initView() {
        findfrindIvBack.setVisibility(View.VISIBLE);
        setUserInfo();



    }
    private void setUserInfo() {
        EaseUserUtils.setAppUserAvatar(this,user.getMUserName(),findfriendIvUserAvatar);
        EaseUserUtils.setAppUserNick(user.getMUserName(),findfriendTvUsernick);
        EaseUserUtils.setAppUserNameWithNo(user.getMUserName(),findfriendTvUsername);

    }

    @OnClick(R.id.findfrind_iv_back)
    public void onClick() {
    }
}