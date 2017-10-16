package com.hydra.christendsouza.auvcontrol;

/**
 * Created by christendsouza on 13/10/17.
 */

import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by christendsouza on 03/10/17.
 */

public class CardAccess extends Fragment{
    CardView cardView;
    CardView cardView2;
    CardView cardView3;
    CardView cardView4;
    CardView cardView5;
    CardView cardView6;
    CardView cardView7;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.card_scene,container,false);
        cardView=(CardView) view.findViewById(R.id.cardview);
        cardView2=(CardView) view.findViewById(R.id.cardview2);
        cardView3=(CardView) view.findViewById(R.id.cardview3);
        cardView4=(CardView) view.findViewById(R.id.cardview4);
        cardView5=(CardView) view.findViewById(R.id.cardview5);
        cardView6=(CardView) view.findViewById(R.id.cardview6);
        cardView7=(CardView) view.findViewById(R.id.cardview7);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                File fileBrochure = new File(cardView.getContext().getExternalFilesDir(null) + "/" + "help.pdf");
                if (!fileBrochure.exists()) {
                    copyAssets();
                }
                File file = new File(cardView.getContext().getExternalFilesDir(null) + "/" + "help.pdf");

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(Uri.fromFile(file), "application/pdf");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                try {
                    cardView.getContext().startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Toast t = Toast.makeText(cardView.getContext(), "NO Pdf Viewer", Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                File fileBrochure = new File(cardView.getContext().getExternalFilesDir(null) + "/" + "help.pdf");
                if (!fileBrochure.exists()) {
                    copyAssets();
                }
                File file = new File(cardView.getContext().getExternalFilesDir(null) + "/" + "help.pdf");

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(Uri.fromFile(file), "application/pdf");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                try {
                    cardView.getContext().startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Toast t = Toast.makeText(cardView.getContext(), "NO Pdf Viewer", Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                File fileBrochure = new File(cardView.getContext().getExternalFilesDir(null) + "/" + "help.pdf");
                if (!fileBrochure.exists()) {
                    copyAssets();
                }
                File file = new File(cardView.getContext().getExternalFilesDir(null) + "/" + "help.pdf");

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(Uri.fromFile(file), "application/pdf");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                try {
                    cardView.getContext().startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Toast t = Toast.makeText(cardView.getContext(), "NO Pdf Viewer", Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                File fileBrochure = new File(cardView.getContext().getExternalFilesDir(null) + "/" + "help.pdf");
                if (!fileBrochure.exists()) {
                    copyAssets();
                }
                File file = new File(cardView.getContext().getExternalFilesDir(null) + "/" + "help.pdf");

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(Uri.fromFile(file), "application/pdf");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                try {
                    cardView.getContext().startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Toast t = Toast.makeText(cardView.getContext(), "NO Pdf Viewer", Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                File fileBrochure = new File(cardView.getContext().getExternalFilesDir(null) + "/" + "help.pdf");
                if (!fileBrochure.exists()) {
                    copyAssets();
                }
                File file = new File(cardView.getContext().getExternalFilesDir(null) + "/" + "help.pdf");

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(Uri.fromFile(file), "application/pdf");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                try {
                    cardView.getContext().startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Toast t = Toast.makeText(cardView.getContext(), "NO Pdf Viewer", Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                File fileBrochure = new File(cardView.getContext().getExternalFilesDir(null) + "/" + "help.pdf");
                if (!fileBrochure.exists()) {
                    copyAssets();
                }
                File file = new File(cardView.getContext().getExternalFilesDir(null) + "/" + "help.pdf");

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(Uri.fromFile(file), "application/pdf");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                try {
                    cardView.getContext().startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Toast t = Toast.makeText(cardView.getContext(), "NO Pdf Viewer", Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                File fileBrochure = new File(cardView.getContext().getExternalFilesDir(null) + "/" + "help.pdf");
                if (!fileBrochure.exists()) {
                    copyAssets();
                }
                File file = new File(cardView.getContext().getExternalFilesDir(null) + "/" + "help.pdf");

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(Uri.fromFile(file), "application/pdf");
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                try {
                    cardView.getContext().startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Toast t = Toast.makeText(cardView.getContext(), "NO Pdf Viewer", Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });
        return view;
    }


    /*private void CopyAssetsbrochure() {
        AssetManager assetManager=cardView.getContext().getAssets();
        String[] files = null;
        try
        {
            files = assetManager.list("");
        }
        catch (IOException e)
        {
            Log.e("tag", e.getMessage());
        }
        for(int i=0; i<files.length; i++)
        {
            String fStr = files[i];
            if(fStr.equalsIgnoreCase("help.pdf"))
            {
                InputStream in = null;
                OutputStream out = null;
                try
                {
                    in = assetManager.open(files[i]);
                    out = new FileOutputStream(Environment.getExternalStorageDirectory() + "/" + files[i]);
                    copyFile(in, out);
                    in.close();
                    in = null;
                    out.flush();
                    out.close();
                    out = null;
                    break;
                }
                catch(Exception e)
                {
                    Log.e("tag", e.getMessage());
                }
            }
        }
    }

    private void copyFile(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[1024];
        int read;
        while((read = in.read(buffer)) != -1){
            out.write(buffer, 0, read);
        }
    }*/
    private void copyAssets() {
        AssetManager assetManager = cardView.getContext().getAssets();
        String[] files = null;
        try {
            files = assetManager.list("");
        } catch (IOException e) {
            Log.e("tag", "Failed to get asset file list.", e);
        }
        if (files != null) for (String filename : files) {
            InputStream in = null;
            OutputStream out = null;
            try {
                in = assetManager.open(filename);
                File outFile = new File(cardView.getContext().getExternalFilesDir(null), filename);
                out = new FileOutputStream(outFile);
                copyFile(in, out);
            } catch(IOException e) {
                Log.e("tag", "Failed to copy asset file: " + filename, e);
            }
            finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        // NOOP
                    }
                }
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        // NOOP
                    }
                }
            }
        }
    }
    private void copyFile(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[1024];
        int read;
        while((read = in.read(buffer)) != -1){
            out.write(buffer, 0, read);
        }
    }
}
