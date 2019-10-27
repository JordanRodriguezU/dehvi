package com.example.dehvi.ui.student;

import android.os.Bundle;

import com.example.dehvi.data.RetrofitAdapter;
import com.example.dehvi.data.model.APIClient;
import com.example.dehvi.data.model.Student;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.widget.Toast;

import com.example.dehvi.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StudentActivity extends AppCompatActivity {

    private RetrofitAdapter retrofitAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        recyclerView = findViewById(R.id.recycler);

        fetchJSON();

    }

    private void fetchJSON(){
        APIClient service = APIClient.retrofit.create(APIClient.class);

        Call<List<Student>> call =service.getStudents();
        try {
            call.enqueue(new Callback <List<Student>>() {
                @Override
                public void onResponse(Call <List<Student>> call, Response <List<Student>> response) {
                    Log.i("Responsestring", response.body().toString());
                    //Toast.makeText()
                    if (response.isSuccessful()) {
                        if (response.body() != null) {
                            Log.i("onSuccess", response.body().toString());

                            List<Student> jsonresponse = (List<Student>)response.body();
                            writeRecycler(jsonresponse);

                        } else {
                            Log.i("onEmptyResponse", "Returned empty response");//Toast.makeText(getContext(),"Nothing returned",Toast.LENGTH_LONG).show();
                        }
                    }
                }

                @Override
                public void onFailure(Call<List<Student>> call, Throwable t) {

                }
            });

        }catch (Exception e){
            Log.i("onSuccess", e.toString());
        }


    }

    private void writeRecycler( List<Student> response){

        try {
            //getting the whole json object from the response
            //JSONObject obj = new JSONObject(response);
            if(response.size()>0){

                ArrayList<Student> modelRecyclerArrayList = new ArrayList<>();

                for (int i = 0; i < response.size(); i++) {

                    Student modelRecycler = new Student();
                    //JSONObject dataobj = response.getJSONObject(i);

                    modelRecycler.setFirstName(response.get(i).getFirstName());
                    modelRecycler.setLastName(response.get(i).getLastName());

                    modelRecyclerArrayList.add(modelRecycler);

                }

                retrofitAdapter = new RetrofitAdapter(StudentActivity.this,modelRecyclerArrayList);
                recyclerView.setAdapter(retrofitAdapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));

            }else {
                Toast.makeText(StudentActivity.this, "No tiene datos para mostrar", Toast.LENGTH_SHORT).show();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
