package codingwithmitch.com.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String>  mDescription = new ArrayList<>();
    private ArrayList<String>  mDetailedDescription = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");
        mDetailedDescription.add("Shark Tank is an American reality TV show on ABC that features a panel of business executives and investors (called 'Sharks')");
        mNames.add("Shark Tank");
        mDescription.add("American Business TV show");
        mImageUrls.add("https://upload.wikimedia.org/wikipedia/en/6/68/Shark_Tank_Logo.jpg");

        mDetailedDescription.add("Premise. Set in Albuquerque, New Mexico, between 2008 and 2010, Breaking Bad follows Walter White, a meek high school chemistry teacher who transforms into a ruthless player ");
        mNames.add("Breaking Bad");
        mDescription.add("Story occurs in New Mexico");
        mImageUrls.add("https://banner2.cleanpng.com/20180816/kzi/kisspng-logo-walter-white-vector-graphics-television-show-breaking-bad-png-18-5b754e1068c945.0272561515344143524292.jpg");

        mDetailedDescription.add("Series overview. The Walking Dead takes place after the onset of a worldwide zombie apocalypse. The zombies, colloquially referred to as \"walkers\"");
        mNames.add("Walking Dead");
        mDescription.add("Story is about a Zombie apoclypse");
        mImageUrls.add("https://hyperpix.net/wp-content/uploads/2020/05/the-walking-dead-logo-font-download.jpg");

        mDetailedDescription.add("The Big Bang Theory is a comedy about brilliant physicists, Leonard and Sheldon, who are the kind of \"beautiful minds\" that understand how the universe works. g");
        mNames.add("The Big Bang Theory");
        mDescription.add("Is a comedy show based on nerdy people");
        mImageUrls.add("https://www.portablepress.com/wp-content/uploads/2019/05/biig-bang.jpg");


        mDetailedDescription.add("Family Guy is an American adult animated sitcom created by Seth MacFarlane for the Fox Broadcasting Company. T");
        mNames.add("Family Guy");
        mDescription.add("animated Sitcom");
        mImageUrls.add("https://i.pinimg.com/originals/3f/ca/d4/3fcad4b4c6b86644c7bfc701737e4154.jpg");

        mDetailedDescription.add("Tom and Jerry is an American animated franchise and series of comedy short films created in 1940 by William Hanna and Joseph Barbera.");
        mNames.add("Tom and Jerry");
        mDescription.add("Animated comedy show");
        mImageUrls.add("https://i.pinimg.com/originals/7f/2d/34/7f2d34cbb74b190eb8deafa339954678.jpg");

        mDetailedDescription.add("Tom and Jerry is an American animated franchise and series of comedy short films created in 1940 by William Hanna and Joseph Barbera.");
        mNames.add("Drugs Inc");
        mDescription.add("Animated Crime show");
        mImageUrls.add("https://cdn1.edgedatg.com/aws/v2/natgeotv/DrugsIncTheFix/showimages/c3baf9205878f5bb1ad1122c6c521ea2/1200x676-Q75_c3baf9205878f5bb1ad1122c6c521ea2.jpg");

        mDetailedDescription.add("Tom and Jerry is an American animated franchise and series of comedy short films created in 1940 by William Hanna and Joseph Barbera.");
        mNames.add("Police Activity");
        mDescription.add("Animated Police show");
        mImageUrls.add("https://cdn1.edgedatg.com/aws/v2/natgeotv/DrugsIncTheFix/showimages/c3baf9205878f5bb1ad1122c6c521ea2/1200x676-Q75_c3baf9205878f5bb1ad1122c6c521ea2.jpg");

        mDetailedDescription.add("Tom and Jerry is an American animated franchise and series of comedy short films created in 1940 by William Hanna and Joseph Barbera.");
        mNames.add("Naruto");
        mDescription.add("Animated fighttng show" );
        mImageUrls.add("https://toppng.com/public/uploads/preview/aruto-title-naruto-logo-115628961389dsl2anitl.png");

        mDetailedDescription.add("Tom and Jerry is an American animated franchise and series of comedy short films created in 1940 by William Hanna and Joseph Barbera.");
        mNames.add("Dragon Ball Z");
        mDescription.add("Animated fighting show2" );
        mImageUrls.add("https://upload.wikimedia.org/wikipedia/commons/9/9b/Dragon_Ball_Z_Logo.png");

        mDetailedDescription.add("Tom and Jerry is an American animated franchise and series of comedy short films created in 1940 by William Hanna and Joseph Barbera.");
        mNames.add("One Punch Man");
        mDescription.add("Animated fighttng show3" );
        mImageUrls.add("https://m.media-amazon.com/images/I/61-4DCUc9cL.jpg");

        mDetailedDescription.add("Tom and Jerry is an American animated franchise and series of comedy short films created in 1940 by William Hanna and Joseph Barbera.");
        mNames.add("Mind hunter");
        mDescription.add("Catching Criminal show" );
        mImageUrls.add("https://toppng.com/public/uploads/preview/aruto-title-naruto-logo-115628961389dsl2anitl.png");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls, mDescription,mDetailedDescription);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}






















