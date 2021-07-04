package com.example.tourism;

import com.example.tourism.adapters.HangoutItem;

import java.util.ArrayList;

class  FunFactItem{
    String funfactinfo;
    int FunFactImage;

    FunFactItem(String info,int image){
        this.funfactinfo = info;
        this.FunFactImage = image;
    }
}

class CityItem{
    int cityid;
    String cityname;
    String description;
    String cityweather;
    String cityweatherdescription;
    int cityHumidity;
    int cityimage;
    double cityLatitude;
    double cityLongitude;
    ArrayList<FunFactItem> funfacts;
    ArrayList<HangoutItem> hangoutItemArrayList;

    public  CityItem(
            int cityid,
            String cityname,
                     String description,
                     String cityweather,
                     String cityweatherdescription,
                     int cityHumidity,
                     int cityimage,
                     double cityLatitude,
                     double cityLongitude,
            ArrayList<FunFactItem> funfacts,
            ArrayList<HangoutItem> hangoutItemArrayList){
        this.cityid = cityid;
        this.cityname   = cityname;
        this.description = description;
        this.cityweather = cityweather;
        this.cityweatherdescription = cityweatherdescription;
        this.cityHumidity = cityHumidity;
        this.cityimage = cityimage;
        this.cityLatitude = cityLatitude;
        this.cityLongitude = cityLongitude;
        this.funfacts = funfacts;
        this.hangoutItemArrayList = hangoutItemArrayList;
    }
}

public class CitiesData {
    static ArrayList<CityItem> cities = new ArrayList<CityItem>();

    public  void  addcityitem(  int cityid,
                                String cityname,
                                String description,
                                String cityweather,
                                String cityweatherdescription,
                                int cityHumidity,
                                int cityimage,
                                double cityLatitude,
                                double cityLongitude,
                                ArrayList<FunFactItem> funfacts,
                                ArrayList<HangoutItem> hangoutItemArrayList){
        CityItem newCity = new CityItem(cityid,cityname,description,cityweather,cityweatherdescription,cityHumidity,cityimage,cityLatitude,cityLongitude,funfacts,hangoutItemArrayList);
        cities.add(newCity);
    }
    public void addcity(){
        addmumbai();
        adddelhi();
        addbangalore();
       addchennai();
    }
    public  CityItem getCity(int id){
        for (int i = 0; i < cities.size(); i++) {
            if(cities.get(i).cityid == id){
                return  cities.get(i);
            }
        }
        return  null;
    }

    public  void addmumbai(){
        ArrayList<FunFactItem> funfactsMumbai = new ArrayList<FunFactItem>();
        ArrayList<HangoutItem> hangoutItemArrayList = new ArrayList<HangoutItem>();
        funfactsMumbai.add(new FunFactItem("Every 5 minute a person is bitten by stray dogs in mumbai",R.drawable.mumbai));
        funfactsMumbai.add(new FunFactItem("Another Fun Fact",R.drawable.mumbai));

        hangoutItemArrayList.add(new HangoutItem(R.drawable.mumbai,"India Gate","Old Monument",
                "built in 40's",77,88));
        addcityitem(R.drawable.mumbai,"Mumbai","Mumbai is the capital city of  Maharashtra, Earlier it was known as Bombay. This capital city is analogous with the city of Dreams not just for the people of India but also for the people around the globe and definitely Mumbai is famous for many things. ",
                "25 C","clear Sky",93,R.drawable.mumbai,19.0821978,72.7411,funfactsMumbai,hangoutItemArrayList);
    }
    public  void adddelhi(){
        ArrayList<FunFactItem> funfactsMumbai = new ArrayList<FunFactItem>();
        ArrayList<HangoutItem> hangoutItemArrayList = new ArrayList<HangoutItem>();
        funfactsMumbai.add(new FunFactItem("Every 5 minute a person is bitten by stray dogs in mumbai",R.drawable.mumbai));
        funfactsMumbai.add(new FunFactItem("Another Fun Fact",R.drawable.mumbai));

        hangoutItemArrayList.add(new HangoutItem(R.drawable.mumbai,"India Gate","Old Monument",
                "built in 40's",77,88));
        addcityitem(R.drawable.delhi,"Delhi","Famous For India Gate",
                "25 C","clear Sky",93,R.drawable.delhi,19.0821978,72.7411,funfactsMumbai,hangoutItemArrayList);
    }

    public  void addbangalore(){
        ArrayList<FunFactItem> funfactsMumbai = new ArrayList<FunFactItem>();
        ArrayList<HangoutItem> hangoutItemArrayList = new ArrayList<HangoutItem>();
        funfactsMumbai.add(new FunFactItem("Every 5 minute a person is bitten by stray dogs in mumbai",R.drawable.mumbai));
        funfactsMumbai.add(new FunFactItem("Another Fun Fact",R.drawable.mumbai));

        hangoutItemArrayList.add(new HangoutItem(R.drawable.mumbai,"India Gate","Old Monument",
                "built in 40's",77,88));
        addcityitem(R.drawable.bangalore,"Bangalore","City Famous For IT Industires",
                "25 C","clear Sky",93,R.drawable.bangalore,19.0821978,72.7411,funfactsMumbai,hangoutItemArrayList);
    }
    public  void addchennai(){
        ArrayList<FunFactItem> funfactsMumbai = new ArrayList<FunFactItem>();
        ArrayList<HangoutItem> hangoutItemArrayList = new ArrayList<HangoutItem>();
        funfactsMumbai.add(new FunFactItem("Every 5 minute a person is bitten by stray dogs in mumbai",R.drawable.mumbai));
        funfactsMumbai.add(new FunFactItem("Another Fun Fact",R.drawable.mumbai));

        hangoutItemArrayList.add(new HangoutItem(R.drawable.mumbai,"India Gate","Old Monument",
                "built in 40's",77,88));
        addcityitem(R.drawable.chennai,"Chennai","Very Hot City",
                "25 C","clear Sky",93,R.drawable.chennai,19.0821978,72.7411,funfactsMumbai,hangoutItemArrayList);
    }
}
