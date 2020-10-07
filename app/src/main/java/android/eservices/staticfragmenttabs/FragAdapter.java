package android.eservices.staticfragmenttabs;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragAdapter extends FragmentStateAdapter {
    public FragAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public FragAdapter(Fragment f) {
        super(f);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position == 1) {
            return new FragmentOne();
        } else {
            //return new FragmentTwo();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
