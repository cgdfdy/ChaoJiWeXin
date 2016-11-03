package cn.ucai.superwechat.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.ucai.superwechat.R;
import cn.ucai.superwechat.utils.MFGT;

public class GuideActivity extends BaseActivity {
    Button btnGologin;
    Button btnGoRegister;
    GuideActivity mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        mContext =this;
        btnGologin = (Button) findViewById(R.id.btn_gologin);
        btnGoRegister = (Button) findViewById(R.id.btn_goregister);
        btnGologin();
        gotoRegister();
    }

    public void btnGologin() {
        btnGologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GuideActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });
    }
    public void gotoRegister() {
        btnGoRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GuideActivity.this, RegisterActivity.class);
                startActivity(intent);

            }
        });

    }
}