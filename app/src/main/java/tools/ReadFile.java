package tools;

import android.content.Context;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * Created by Jok3r on 3/6/2017.
 */
public class ReadFile{
    public String read_file(Context context, String filename) {

        try {

            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(context.getAssets().open("hello.txt")));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line).append("\n");
            }
            return sb.toString();
        } catch (FileNotFoundException e) {
            return "";
        } catch (UnsupportedEncodingException e) {
            return "";
        } catch (IOException e) {
            return "";
        }
    }


}
