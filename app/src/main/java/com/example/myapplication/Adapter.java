package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<ModelClass> userList;
    public Adapter(List<ModelClass> userList){
        this.userList=userList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        int resource=userList.get(position).getImageview1();
        String name=userList.get(position).getTextview();
        String msg=userList.get(position).getTextview2();
        String time=userList.get(position).getTextview1();
        String line=userList.get(position).getDivider();


        holder.setData(resource,name,msg,time,line);

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView textView;
        private TextView textView1;
        private TextView textView2;
        private TextView divider;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageview1);
            textView=itemView.findViewById(R.id.textview);
            textView1=itemView.findViewById(R.id.textview1);
            textView2=itemView.findViewById(R.id.textview2);
            divider=itemView.findViewById(R.id.textview3);

        }

        public void setData(int resource, String name, String msg, String time, String line) {
            imageView.setImageResource(resource);
            textView.setText(name);
            textView1.setText(time);
            textView2.setText(msg);
            divider.setText(line);
        }
    }
}
