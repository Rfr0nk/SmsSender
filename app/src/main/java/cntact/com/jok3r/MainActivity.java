package cntact.com.jok3r.cntact;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;

import java.util.ArrayList;

import tools.ReadFile;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = getApplicationContext();



        ArrayList<String> stringArray = new ArrayList<String>();
        ReadFile readfile = new ReadFile();

        String line = readfile.read_file(context,"hello.txt");

        String[] splitArray = line.split("\n");

        for (int i = 0; i < splitArray.length; i++) {

            stringArray.add(splitArray[i]);
        }

        //ArrayList <ContentProviderOperation> ops = new ArrayList < ContentProviderOperation > ();




        // printing all values
        for (int i = 0; i < stringArray.size(); i++) {

               /* System.out.println("values of index " + i + " are :"
                        + stringArray.get(i));
            String name = "Hedie Naz " + i;
            WritePhoneContact(name, stringArray.get(i),context);*/

            String message = "با سلام و درود \n این یک متن به صورت تست می باشد موفق باشید";
            SmsManager smsManager = SmsManager.getDefault();
            ArrayList<String> parts = smsManager.divideMessage(message);
            smsManager.sendMultipartTextMessage(stringArray.get(i), null, parts, null, null);
            SystemClock.sleep(6000);
            System.out.println("values of index " + i + " are :"
                    + stringArray.get(i));

        }

    }
}
