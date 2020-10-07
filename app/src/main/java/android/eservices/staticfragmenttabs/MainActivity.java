package android.eservices.staticfragmenttabs;

import android.os.Bundle;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends FragmentActivity {

    private ViewPager2 viewpager;
    private TabLayout tabLayout;
    private int currentCounter;
    private TextView counterTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //viewpager = (ViewPager2)findViewById(R.id.tab_viewpager);

        setupViewPagerAndTabs();
    }

    //TODO fill the method to get view references and initialize viewpager to display our fragments
    private void setupViewPagerAndTabs() {

        //TODO we want two fragments with layouts : fragment_one, fragment_two.
        Fragment f1 = new FragmentOne();

        //TODO set adapter to viewpager and handle fragment change inside
        viewpager.setAdapter(new FragAdapter(f1));

        //TabLayoutMediator tabLayoutMediator = new
    }

    //TODO : increment and decrement counter, use the already provided String resource (see strings.xml)
}
