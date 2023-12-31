package com.example.ugcnetapp.ui.quiz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ugcnetapp.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class StartQuiz extends AppCompatActivity {


    private TextView questionTxt, indicator;
    private LinearLayout container;
    private Button nextBtn, shareBtn;
    private int score = 0;
    private  int position = 0;
    private  int count = 0;

    DatabaseReference reference;

    private List<QuestionData>list;

    WebView webQuiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz);


        webQuiz = findViewById(R.id.quizView);
        webQuiz.getSettings().setJavaScriptEnabled(true);
        webQuiz.setWebViewClient(new WebViewClient());
        webQuiz.loadUrl("https://modelexam.in/exams_new/index.php?exty=demox&um=guest&fm=m&bal=0&newexamid=csa_ugc");


//        questionTxt = findViewById(R.id.question);
//        indicator = findViewById(R.id.indicator);
//        container = findViewById(R.id.linearLayout3);
//        nextBtn = findViewById(R.id.next_btn);
//        shareBtn = findViewById(R.id.share_btn);
//
//        list = new ArrayList<>();
//        reference = FirebaseDatabase.getInstance().getReference();
//        reference.child("Question").addListenerForSingleValueEvent(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                for (DataSnapshot snapshot : dataSnapshot.getChildren()){
//                    String question = snapshot.child("question").getValue().toString();
//                    String option1 = snapshot.child("option1").getValue().toString();
//                    String option2 = snapshot.child("option2").getValue().toString();
//                    String option3 = snapshot.child("option3").getValue().toString();
//                    String option4 = snapshot.child("option4").getValue().toString();
//                    String correctAns = snapshot.child("answer").getValue().toString();
//
//                    list.add(new QuestionData(option1,option2,option3,option4,question,correctAns));
//                }
//                if (list.size() > 0){
//                    loadQuestion(questionTxt,0,list.get(position).getQuestion());
//                }else {
//                    Toast.makeText(StartQuiz.this, "No Data Found", Toast.LENGTH_SHORT).show();
//                }
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//                Toast.makeText(StartQuiz.this, error.getMessage(), Toast.LENGTH_SHORT).show();
//            }
//        });
    }

//    private void loadQuestion(View view, int value, String data){
//        for (int i = 0; i<4; i++){
//            container.getChildAt(i).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#989898")));
//        }
//        view.animate().alpha(value).scaleX(value).scaleY(value).setDuration(500)
//                .setStartDelay(100).setInterpolator(new DecelerateInterpolator())
//                .setListener(new Animator.AnimatorListener() {
//                    @Override
//                    public void onAnimationStart(@NonNull Animator animator) {
//                        if ((value == 0 && count < 4)){
//                            String option = " ";
//                            if (count == 0)
//                                option = list.get(position).getOption1();
//                            else if (count == 1)
//                                option = list.get(position).getOption2();
//                            else if (count == 2)
//                                option = list.get(position).getOption3();
//                            else if (count == 3)
//                                option = list.get(position).getOption4();
//
//
//                            loadQuestion(container.getChildAt(count),0,option);
//                            count++;
//
//                        }
//                    }
//
//                    @Override
//                    public void onAnimationEnd(@NonNull Animator animator) {
//                        if (value == 0){
//                            try {
//                                ((TextView)view).setText(data);
//                                indicator.setText(position +"/"+ list.size());
//                            }catch (ClassCastException e){
//                                ((Button)view).setText(data);
//                            }
//                            view.setTag(data);
//                            loadQuestion(view,1,data);
//
//                        }
//                    }
//
//                    @Override
//                    public void onAnimationCancel(@NonNull Animator animator) {
//
//                    }
//
//                    @Override
//                    public void onAnimationRepeat(@NonNull Animator animator) {
//
//                    }
//                });
//
//    }
}