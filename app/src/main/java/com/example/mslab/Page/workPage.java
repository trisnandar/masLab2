package com.example.mslab.Page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.mslab.Adapter.TabAdapter;
import com.example.mslab.FinishJobFragment;
import com.example.mslab.NewJobFragment;
import com.example.mslab.ProsesJobFragment;
import com.example.mslab.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class workPage extends Fragment {
    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    private NewJobFragment newJobFragment;
    private ProsesJobFragment prosesJobFragment;
    private FinishJobFragment finishJobFragment;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.work_fragment, container, false);

//        toolbar = view.findViewById(R.id.toolbar);

        viewPager = view.findViewById(R.id.view_pager);
        tabLayout = view.findViewById(R.id.tab_layout);

        newJobFragment = new NewJobFragment();
        prosesJobFragment = new ProsesJobFragment();
        finishJobFragment = new FinishJobFragment();

        tabLayout.setupWithViewPager(viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getFragmentManager(), 0);
        viewPagerAdapter.addFragment(newJobFragment, "Baru");
        viewPagerAdapter.addFragment(prosesJobFragment, "Proses");
        viewPagerAdapter.addFragment(finishJobFragment, "Selesai");
        viewPager.setAdapter(viewPagerAdapter);

        BadgeDrawable badgeDrawable = tabLayout.getTabAt(0).getOrCreateBadge();
        badgeDrawable.setVisible(true);
        badgeDrawable.setNumber(4);


        return inflater.inflate(R.layout.work_fragment, container, false);
    }

    private class ViewPagerAdapter extends FragmentPagerAdapter {

        private List<Fragment> fragments = new ArrayList<>();
        private List<String> fragmentTitle = new ArrayList<>();

        public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        public void addFragment(Fragment fragment, String title){
            fragments.add(fragment);
            fragmentTitle.add(title);
        }
        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentTitle.get(position);
        }
    }
}
