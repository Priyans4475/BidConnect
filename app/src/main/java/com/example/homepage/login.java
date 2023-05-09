package com.example.homepage;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class login extends AppCompatActivity {
//    TextInputEditText textemail,textpass;
//    Button MaterialButton;
//    FirebaseAuth mauth;
//    ProgressBar progressBar;
    TextView signup;
//
////    @Override
////    public void onStart() {
////        super.onStart();
////        // Check if user is signed in (non-null) and update UI accordingly.
////        FirebaseUser currentUser = mauth.getCurrentUser();
////        if(currentUser != null){
////            Intent intent=new Intent(login.this,mainActivity.class);
////            startActivity(intent);
////            finish();
////        }
////    }
//    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView email=(TextView) findViewById(R.id.email);
        TextView password=(TextView) findViewById(R.id.password);
       TextView signup=(TextView) findViewById(R.id.sign_up);
        MaterialButton loginbutton =(MaterialButton) findViewById(R.id.loginbtn);
////        textemail=findViewById(R.id.email);
////        textpass=findViewById(R.id.Password);
//        textemail= findViewById(R.id.email);
//        textpass=findViewById(R.id.Password);
//        MaterialButton = findViewById(R.id.button);
//        progressBar=findViewById(R.id.progressbar);
//        mauth=FirebaseAuth.getInstance();
//        signup=findViewById(R.id.sign_up);
//
//        MaterialButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                progressBar.setVisibility(View.VISIBLE);
//                String email,password;
//                email=String.valueOf(textemail.getText());
//                password=String.valueOf((textpass.getText()));
//
//                if(TextUtils.isEmpty(email))
//                {
//                    Toast.makeText(login.this, "Enter Mail", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                if(TextUtils.isEmpty(password))
//                {
//                    Toast.makeText(login.this, "Enter password", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                mauth.signInWithEmailAndPassword(email, password)
//                        .addOnCompleteListener( new OnCompleteListener<AuthResult>() {
//                            @Override
//                            public void onComplete(@NonNull Task<AuthResult> task) {
//                                progressBar.setVisibility(View.GONE);
//                                if (task.isSuccessful()) {
//
//                                    // Sign in success, update UI with the signed-in user's information
//
//                                    Toast.makeText(login.this, "Login Successful.",
//                                            Toast.LENGTH_SHORT).show();
//                                    Intent intent=new Intent(login.this,mainActivity.class);
//                                    startActivity(intent);
//                                    finish();
//                                } else {
//                                    // If sign in fails, display a message to the user.
//
//                                    Toast.makeText(login.this, "Authentication failed.",
//                                            Toast.LENGTH_SHORT).show();
//
//                                }
//                            }
//                        });
//            }
//        });
////
////        progressBar=findViewById(R.id.progressbar);
////        mauth=FirebaseAuth.getInstance();


        loginbutton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(email.getText().toString().equals("priyanshukumar@gmail.com")&&password.getText().toString().equals("diwakar123")){
               Intent intent=new Intent(login.this, mainActivity.class);
                startActivity(intent);
            }else
            {
                Toast.makeText(login.this,"Login unsuccessful",Toast.LENGTH_SHORT).show();
            }
        }
    });
       signup.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(login.this,sign_up_page.class);
               startActivity(intent);
           }
       });

    }
}