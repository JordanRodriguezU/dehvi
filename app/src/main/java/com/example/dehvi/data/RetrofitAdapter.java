package com.example.dehvi.data;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.dehvi.R;
import com.example.dehvi.data.model.Student;

import java.util.ArrayList;
import java.util.List;

public class RetrofitAdapter extends RecyclerView.Adapter<RetrofitAdapter.MyViewHolder> {
    private LayoutInflater inflater;
    private List<Student> dataModelArrayList;

    public RetrofitAdapter(Context ctx, ArrayList<Student> dataModelArrayList){

        inflater = LayoutInflater.from(ctx);
        this.dataModelArrayList = dataModelArrayList;
    }

    @Override
    public RetrofitAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.content_student, parent, false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(RetrofitAdapter.MyViewHolder holder, int position) {

        holder.firstname.setText(dataModelArrayList.get(position).getFirstName());
        holder.lastname.setText(dataModelArrayList.get(position).getLastName());
    }

    @Override
    public int getItemCount() {
        return dataModelArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView lastname, firstname;

        public MyViewHolder(View itemView) {
            super(itemView);

            lastname = (TextView) itemView.findViewById(R.id.lastname);
            firstname = (TextView) itemView.findViewById(R.id.firstname);

        }

    }
}
