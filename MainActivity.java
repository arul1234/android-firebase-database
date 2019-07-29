package packagename.com.packagename;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    DatabaseReference t1,c1,c2,c3,dt,dw,allbd,ba,bb,bc,td,fd;
    TextView title1,content1,content2,content3,date,draw,allb,a,b,c,three,four;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        title1 = (TextView)findViewById(R.id.title1);
        content1 = (TextView)findViewById(R.id.content1);
        content2 = (TextView)findViewById(R.id.content2);
        content3 = (TextView)findViewById(R.id.content3);

        date = (TextView)findViewById(R.id.date);
        draw = (TextView)findViewById(R.id.draw);
        allb = (TextView)findViewById(R.id.all_board);

        a = (TextView)findViewById(R.id.board_a);
        b = (TextView)findViewById(R.id.board_b);
        c = (TextView)findViewById(R.id.board_c);

        three = (TextView)findViewById(R.id.three_digit);
        four = (TextView)findViewById(R.id.four_digit);






     t1 = FirebaseDatabase.getInstance().getReference().child("result").child("title1");

     c1 = FirebaseDatabase.getInstance().getReference().child("result").child("content1");
     c2 = FirebaseDatabase.getInstance().getReference().child("result").child("content2");
     c3 = FirebaseDatabase.getInstance().getReference().child("result").child("content3");

     dt = FirebaseDatabase.getInstance().getReference().child("result").child("date");
     dw = FirebaseDatabase.getInstance().getReference().child("result").child("draw");

     allbd = FirebaseDatabase.getInstance().getReference().child("result").child("all_board");

        ba = FirebaseDatabase.getInstance().getReference().child("result").child("a");
        bb = FirebaseDatabase.getInstance().getReference().child("result").child("b");
        bc = FirebaseDatabase.getInstance().getReference().child("result").child("c");


        td = FirebaseDatabase.getInstance().getReference().child("result").child("three_digit");
        fd = FirebaseDatabase.getInstance().getReference().child("result").child("four_digit");


       t1.addValueEventListener(new ValueEventListener() {
          @Override
           public void onDataChange(DataSnapshot dataSnapshot) {
               String str;
               str=dataSnapshot.getValue(String.class);
               title1.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
       });


        c1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                content1.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        c2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                content2.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        c3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                content3.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        dt.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                date.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        dw.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                draw.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        allbd.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                allb.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        ba.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                a.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        bb.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                b.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        bc.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                c.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        td.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                three.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        fd.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String str;
                str=dataSnapshot.getValue(String.class);
                four.setText(str);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });




    }
}
