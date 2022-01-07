package com.example.consume_api_with_retrofit.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.consume_api_with_retrofit.R;
import com.example.consume_api_with_retrofit.models.Post;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    List<Post> postsLists;
    Context context;

    public PostAdapter(Context context, List<Post> posts)
    {
        this.context  = context;
        this.postsLists = posts;
    }


    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        Post post = postsLists.get(position);

        holder.id.setText(post.getId());
//        holder.title.setText(post.getTitle().getRender());
//        holder.content.setText(post.getContent().getRendered());
    }





    @Override
    public int getItemCount() {
       return postsLists.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder{

        TextView title,id,content;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
//            title = itemView.findViewById(R.id.id_tv);
            id = itemView.findViewById(R.id.user_id_tv);
//            content = itemView.findViewById(R.id.body_tv);
        }
    }
}
