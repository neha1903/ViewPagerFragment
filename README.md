# ViewPagerFragment
Display a Custom Fragment in View Pager

      
      private void setUpViewPager(ViewPager viewPager){
        SectionsStatePagerAdapter adapter = new SectionsStatePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new CustomFragment(), "Fragment1");
        adapter.addFragment(new CustomFragment(), "Fragment1");
        adapter.addFragment(new CustomFragment(), "Fragment1");
        viewPager.setAdapter(adapter);
    }
