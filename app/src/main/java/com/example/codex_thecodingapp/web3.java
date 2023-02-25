package com.example.codex_thecodingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class web3 extends AppCompatActivity {

    private String[] questions = {"Q.1 Who coined the term Web3?","Q.2 Which of these concepts are related to Web3?","Q.3 Web interaction and collaborative communities are example of?","Q.4 What does AI stand for?","Q.5 Who first coined the term 'semantic web'?","Q.6 Where is information stored in Web3 world?","Q.7 Which was the first crypto launched in 2009?","Q.8 What is full form of ICO?","Q.9 Which of following is a risk of crypto trading?","Q.10 When can you trade cryptocurrency?"};

    private String[] optionAans={"Mark Zuckerberg","IOT","Web 1.0","Artificial Intelligence","Fiona Martin","Data Centers","USDC","Initial coin offering","Market Volatility","Mon-Fri"};
    private String[] optionBans={"Elon Musk","Semantic Web","Web 2.0","Abstract Intelligence","Alex Hales","Hard-Disks","Bitcoin","Initial crypto offering","Largely Unregulated","10:00 am-05:30pm"};
    private String[] optionCans={"Nicholas Tesla","AI","Web 3.0","Access Input","Tim Berners","Virtual Digital Wallet","Litecoin","Instance Cyrpto Object","Funds on exchange at risk","Sunday"};
    private String[] optionDans={"Gavin Wood","None","All of the above","Application Index","Virat Kohli","None","Ethereum","Intermidiate Communication Optics","All of the above","Everyday"};

    private boolean[] validCheckA={false,false,false,true,false,false,false,true,false,false,};
    private boolean[] validCheckB={false,true,true,false,false,false,false,false,false,false};
    private boolean[] validCheckC={false,false,false,false,true,true,false,false,false,false};
    private boolean[] validCheckD={true,false,false,false,false,false,true,false,true,true};

    private int index = 0;
    private int score = 0;

    Button optionA;
    Button optionB;
    Button optionC;
    Button optionD;
    TextView questionWeb3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web3);


        optionA = findViewById(R.id.optionA);
        optionB = findViewById(R.id.optionB);
        optionC = findViewById(R.id.optionC);
        optionD = findViewById(R.id.optionD);

        questionWeb3 = findViewById(R.id.questionWeb3);
        questionWeb3.setText(questions[index]);

        optionA.setText(optionAans[index]);
        optionB.setText(optionBans[index]);
        optionC.setText(optionCans[index]);
        optionD.setText(optionDans[index]);

        optionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=questions.length-1){

                    if(validCheckA[index]){
                        score++;
                    }
                    index++;

                    if(index<=questions.length-1){
                        questionWeb3.setText(questions[index]);
                        optionA.setText(optionAans[index]);
                        optionB.setText(optionBans[index]);
                        optionC.setText(optionCans[index]);
                        optionD.setText(optionDans[index]);
                    }
                    else{
                        Toast.makeText(web3.this, "Your score is: "+score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(web3.this, "Restart the app", Toast.LENGTH_SHORT).show();
                }
            }
        });

        optionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=questions.length-1){

                    if(validCheckB[index]){
                        score++;
                    }
                    index++;

                    if(index<=questions.length-1){
                        questionWeb3.setText(questions[index]);
                        optionA.setText(optionAans[index]);
                        optionB.setText(optionBans[index]);
                        optionC.setText(optionCans[index]);
                        optionD.setText(optionDans[index]);
                    }
                    else{
                        Toast.makeText(web3.this, "Your score is: "+score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(web3.this, "Restart the app", Toast.LENGTH_SHORT).show();
                }
            }
        });

        optionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=questions.length-1){

                    if(validCheckC[index]){
                        score++;
                    }
                    index++;

                    if(index<=questions.length-1){
                        questionWeb3.setText(questions[index]);
                        optionA.setText(optionAans[index]);
                        optionB.setText(optionBans[index]);
                        optionC.setText(optionCans[index]);
                        optionD.setText(optionDans[index]);
                    }
                    else{
                        Toast.makeText(web3.this, "Your score is: "+score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(web3.this, "Restart the app", Toast.LENGTH_SHORT).show();
                }
            }
        });

        optionD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=questions.length-1){

                    if(validCheckD[index]){
                        score++;
                    }
                    index++;

                    if(index<=questions.length-1){
                        questionWeb3.setText(questions[index]);
                        optionA.setText(optionAans[index]);
                        optionB.setText(optionBans[index]);
                        optionC.setText(optionCans[index]);
                        optionD.setText(optionDans[index]);
                    }
                    else{
                        Toast.makeText(web3.this, "Your score is: "+score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(web3.this, "Restart the app", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}