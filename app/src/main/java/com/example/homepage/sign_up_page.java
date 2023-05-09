package com.example.homepage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class sign_up_page extends AppCompatActivity {
//    TextInputEditText textemail,textpass;
//    Button buttonreg;
//    FirebaseAuth mauth;
//    ProgressBar progressBar;
//    @Override
//    public void onStart() {
//        super.onStart();
//        // Check if user is signed in (non-null) and update UI accordingly.
//        FirebaseUser currentUser = mauth.getCurrentUser();
//        if(currentUser != null){
//            Intent intent=new Intent(sign_up_page.this,mainActivity.class);
//            startActivity(intent);
//            finish();
//        }
//    }


//    @SuppressLint("WrongViewCast")
//    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);
////        textemail= findViewById(R.id.email1);
////        textpass=findViewById(R.id.Password);
////        buttonreg= findViewById(R.id.button);
////        progressBar=findViewById(R.id.progressbar);
////        mauth=FirebaseAuth.getInstance();
//        buttonreg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                progressBar.setVisibility(View.VISIBLE);
//                String email,password;
//                email=String.valueOf(textemail.getText());
//                password=String.valueOf((textpass.getText()));
//
//                if(TextUtils.isEmpty(email))
//                {
//                    Toast.makeText(sign_up_page.this, "Enter Mail", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                if(TextUtils.isEmpty(password))
//                {
//                    Toast.makeText(sign_up_page.this, "Enter password", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//
//                mauth.createUserWithEmailAndPassword(email, password)
//                        .addOnCompleteListener( new OnCompleteListener<AuthResult>() {
//                            @Override
//                            public void onComplete(@NonNull Task<AuthResult> task) {
//                                progressBar.setVisibility(View.GONE);
//                                if (task.isSuccessful()) {
//
//                                    Toast.makeText(sign_up_page.this, "Account Created",
//                                            Toast.LENGTH_SHORT).show();
//                                    // Sign in success, update UI with the signed-in user's information
////                                    Log.d(TAG, "createUserWithEmail:success");
////                                    FirebaseUser user = mauth.getCurrentUser();
//
//                                } else {
//                                    // If sign in fails, display a message to the user.
//
//                                    Toast.makeText(sign_up_page.this, "Authentication failed.",
//                                            Toast.LENGTH_SHORT).show();
//
//                                }
//                            }
//                        });
//            }
//        });
    }
}