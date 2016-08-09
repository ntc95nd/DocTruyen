package com.ntc.doctruyen.doctruyen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import com.ntc.doctruyen.DocTruyen;
import com.ntc.doctruyen.adapter.AdapterTruyen;
import com.ntc.doctruyen.models.Truyen;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvTruyen;
    private ArrayList<Truyen> arrTruyen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvTruyen = (ListView) findViewById(R.id.lv_truyen);
        arrTruyen = new ArrayList<>();
        arrTruyen.add(new Truyen(R.drawable.iconbook,"Ân oán người ăn mày"));
        arrTruyen.add(new Truyen(R.drawable.iconbook,"Bà hàng xóm"));
        arrTruyen.add(new Truyen(R.drawable.iconbook,"Bảy người lái buôn"));
        arrTruyen.add(new Truyen(R.drawable.iconbook,"Căn nhà kho"));
        arrTruyen.add(new Truyen(R.drawable.iconbook,"Cây trúc ma"));
        arrTruyen.add(new Truyen(R.drawable.iconbook,"Chuyện nhà ngoại tôi "));
        arrTruyen.add(new Truyen(R.drawable.iconbook,"Chuyện sông nước"));
        arrTruyen.add(new Truyen(R.drawable.iconbook,"Cống tổ rồng"));
        arrTruyen.add(new Truyen(R.drawable.iconbook,"Quê em đất độc"));
        arrTruyen.add(new Truyen(R.drawable.iconbook,"Duyên âm"));
        arrTruyen.add(new Truyen(R.drawable.iconbook,"Lễ trừ tà"));
        arrTruyen.add(new Truyen(R.drawable.iconbook,"Ngậm ngải tìm trầm"));
        arrTruyen.add(new Truyen(R.drawable.iconbook,"Ngôi nhà trong hẻm"));
        arrTruyen.add(new Truyen(R.drawable.iconbook,"Thần Hương- Người khăn trắng"));
        arrTruyen.add(new Truyen(R.drawable.iconbook,"Oan hồn xóm trọ"));
        arrTruyen.add(new Truyen(R.drawable.iconbook,"Quê ngoại"));
        arrTruyen.add(new Truyen(R.drawable.iconbook,"Vong âm"));
        arrTruyen.add(new Truyen(R.drawable.iconbook,"Xóm có vong em phải làm sao ?"));



        AdapterTruyen adapterTruyen = new AdapterTruyen(this,R.layout.item_truyen,arrTruyen);
        lvTruyen.setAdapter(adapterTruyen);
        lvTruyen.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DocTruyen.class);
                intent.putExtra("truyen",i);
                startActivity(intent);
                Log.d("test","cham vao vi tri thu : " + i);
            }
        });
    }
}
