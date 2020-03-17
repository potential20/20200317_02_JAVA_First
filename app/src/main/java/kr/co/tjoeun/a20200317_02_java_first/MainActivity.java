package kr.co.tjoeun.a20200317_02_java_first;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import kr.co.tjoeun.a20200317_02_java_first.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);


//        EditText에 타이핑 => 입력버튼 => 텍스트뷰에 출력
//        + 입력버튼 누르면 기존 입력내용삭제 ""으로 설정.

        binding.okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = binding.inputEdt.getText().toString();

                binding.resultTxt.setText(input);
                binding.inputEdt.setText("");
            }
        });





    }
}
