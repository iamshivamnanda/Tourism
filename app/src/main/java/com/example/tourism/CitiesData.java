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
    ArrayList<HangoutItem> restuarentsItemArrayList;
    ArrayList<HangoutItem> shoppingItemArrayList;
    ArrayList<HangoutItem> monumentsItemArrayList;

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
            ArrayList<HangoutItem> hangoutItemArrayList,
            ArrayList<HangoutItem> restuarentsItemArrayList,
            ArrayList<HangoutItem> shoppingItemArrayList,
            ArrayList<HangoutItem> monumentsItemArrayList
            ){
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
        this.restuarentsItemArrayList = restuarentsItemArrayList;
        this.shoppingItemArrayList = shoppingItemArrayList;
        this.monumentsItemArrayList = monumentsItemArrayList;
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
                                ArrayList<HangoutItem> hangoutItemArrayList,
                                ArrayList<HangoutItem> restuarentsItemArrayList,
                                ArrayList<HangoutItem> shoppingItemArrayList,
                                ArrayList<HangoutItem> monumentsItemArrayList
                                ){
        CityItem newCity = new CityItem(cityid,cityname,description,cityweather,cityweatherdescription,cityHumidity,cityimage,cityLatitude,cityLongitude,funfacts,hangoutItemArrayList,restuarentsItemArrayList,shoppingItemArrayList,monumentsItemArrayList);
        cities.add(newCity);
    }
    public void addcity(){
        addmumbai();
        adddelhi();
        addbangalore();
       addchennai();
       addsurat();
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
        ArrayList<HangoutItem> restuarentsItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> shoppingItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> monumentsItemArrayList = new ArrayList<HangoutItem>();


        funfactsMumbai.add(new FunFactItem("India’s first ever train ran between Mumbai and Thane\n" +
                "On 16 April 1853, India’s first train commenced its operation. Mumbai Locals are the busiest railways in the world and carry about 2.2 billion passengers every year. Mumbai also has the most obsolete electric rail chain in India, which was installed in 1925.",R.drawable.mumbai3));
        funfactsMumbai.add(new FunFactItem("Mumbai was the first one to start a bus service in India\n" +
                "It was on 15 July 1926, that the first ever bus service in India was started. The first route was ridden between Afghan Church and Crawford Market.",R.drawable.mumbai4));
        funfactsMumbai.add(new FunFactItem(" World’s most expensive house is in Mumbai\n" +
                "Antilia, Mukesh Ambani’s 27-story skyscraper is cited as the world’s most expensive house, valued at almost $1 billion. The business tycoon moved into the 400,000 square feet mansion in 2012 with his wife and three children.",R.drawable.mumbai5));


        hangoutItemArrayList.add(new HangoutItem(R.drawable.marinedrive,"Marine Drive","3.6-kilometre-long Promenad",
                "Marine Drive linking Nariman Point to Babulnath is a major landmark within the borders of Mumbai tourist spots. It has a string of sparkling lights adorning the town just like a “Queen’s Necklace”. The boulevard is about 3 km long, with the Girgaum Chowpatty beach at the north end and it is one among the perfect hangout places in Mumbai for friends.",16.6602349,73.4780744));

        hangoutItemArrayList.add(new HangoutItem(R.drawable.chowpatty,"Chowpatty","Beach",
                "A popular locality in South Mumbai, Girgaum Chowpatty beach is situated in northern end of Marine Drive curving round the coast. The place is bustling with activity in the evenings and is popular for its snack stalls that are available at evenings. With people flocking to satisfy their hunger pangs, this place receives a heavy footfall every single day.",18.9542624,72.8077065));

        hangoutItemArrayList.add(new HangoutItem(R.drawable.juhu,"Juhu","Home to many celebrities",
                "Juhu is home to many celebrities, and therefore the beach features a carnival-like atmosphere during the year. Balloon stalls, kites, sand sculptures, rides, horse rides, stalls selling food to jewelry are often found here. Unarguably, the simplest place to hold out with friends in Mumbai, a couple of hours spent here will remain etched in the memories forever.",19.1012636,72.8120343));
       hangoutItemArrayList.add(new HangoutItem(R.drawable.sgnp,"Sanjay Gandhi National Park"," National Park",
                "Sanjay Gandhi Park is frequented by many early morning fitness enthusiasts and picnickers. There are a number of attractions just like the wildlife safari, toy train, trekking, a ship ride on the lake and hand-carved Kanheri Buddhist caves, scattered over the hilltop. Each cave has been carved out of igneous rock and has towering, impactful sculptures of Buddha",
               19.2288092,72.9159897));
        hangoutItemArrayList.add(new HangoutItem(R.drawable.smash,"Smaaash"," fun spot",
                "There are a variety of games for all age groups including bumper cars, air hockey, football and even a restaurant that serves a wide range of kid-friendly food items. They even have go-karting. Kids love coming here because it is one among the foremost fun spots.",
                19.1008235,72.7832565));
         hangoutItemArrayList.add(new HangoutItem(R.drawable.snowworld,"Snow World"," theme park",
                "This one among many major theme parks in Mumbai happens to be a big hit with the youngsters of the city because it offers them the experience of playing in snow and also trying out some fun rides. A number of the activities include snowboarding, skating, ice sliding and much more are available here and one can enjoy the pleasures of the snow without having to leave the city.",
                 19.0863795,72.8867887));


        restuarentsItemArrayList.add(new HangoutItem(R.drawable.mumbai6,"Tanatan","Vegan Options, Vegetarian Friendly",
                "An upscale resto-bar in the affluent suburb of Juhu, Mumbai has made its way to Shivaji Park, Dadar. Tanatan has redefined the dining experience serving avant-garde quality of food and drinks.",
                19.1092351,72.8233233));
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.mumbai7,"The Earth Plate","Indian, Chinese, International, Asian",
                "THE EARTH PLATE-GLOBAL CUISINE EXPERIENCE THE CULTURE FROM AROUND THE WORLD Featuring a selection of Italian, Mediterranean, French, Tex-Mex and Far-Eastern delicacies along with Indian regional favourites, The Earth Plate is Sahara Star's global cuisine restaurant.",
                19.095616,72.8518343));
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.mumbai8,"Citrus Cafe","Italian, Indian, Cajun & Creole, European, Asian",
                "Vegetarian Friendly, Vegan Options, Gluten Free Options",
                19.1080707,72.8800221));
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.mumbai9,"Peshwa Pavilion" ,"Indian, Asian, International",
                "Elegant, 24-hour multi-cuisine restaurant set inside the light-filled atrium of a luxury hotel.",
                19.1039406,72.8674359));
        restuarentsItemArrayList.add(new HangoutItem(R.drawable.mumbai10,"Kebabs & Kurries","Indian",
                "This fine dining restaurant with imposing décor exudes a warm vibe. The seating is comfortable and the dining area is spread across different sections. ",
                18.998175,72.836625));


        shoppingItemArrayList.add(new HangoutItem(R.drawable.mumbai11,"Colaba Causeway","Colaba Causeway, south Mumbai.",
                "The everyday carnival of the Colaba Causeway market is a shopping experience like no other in Mumbai. Geared especially towards tourists, that infamous Indian saying of \"sab kuch milega\" (everything is possible) certainly applies at this market. ",
                18.9246004,72.8298892));
        shoppingItemArrayList.add(new HangoutItem(R.drawable.mumbai12,"Chor Bazaar","near Mohammad Ali Road in south Mumbai.",
                "Chor Bazaar is one of the largest flea markets in India, located near Bhendi Bazaar in Grant Road, South Mumbai. The area is one of the tourist attractions of Mumbai. ",
                18.959993,72.8224786));
        shoppingItemArrayList.add(new HangoutItem(R.drawable.mumbai13,"Linking Road"," Linking Road, Bandra West ",
                "A fusion of modern and traditional, and East meets West, in one of Mumbai's hippest suburbs. Here streets stalls contrast with brand name shops, and you'll find a local Indian roadside food vendor on one side of the road ",
                19.0746968,72.8320184));
        shoppingItemArrayList.add(new HangoutItem(R.drawable.mumbai14,"Dharavi Leather Market","90 Feet Road and adjoining Sion-Bandra Link Road",
                "A lot of people automatically associate Mumbai's notorious Dharavi slum with poverty and misery. However, this is actually very ignorant and insulting.While the conditions are poor, Dharavi is in fact home to many flourishing small-scale industries. ",
                19.0403538,72.8452235));
        shoppingItemArrayList.add(new HangoutItem(R.drawable.mumbai15,"Phoenix Marketcity, Mumbai","Kurla West",
                "Retail complex with brand-name stores, restaurants & a cinema, plus extravagant, seasonal displays.",
                19.0403503,72.8189587));


        monumentsItemArrayList.add(new HangoutItem(R.drawable.mumbai16,"Gateway of India","South Mumbai’s Apollo Bunder road",
                "Grand, Indo-Saracenic-style, 26m-tall triumphal stone arch, built on the waterfront in 1924.",
                18.9219841,72.8324656));
         monumentsItemArrayList.add(new HangoutItem(R.drawable.mumbai17," August Kranti Maidan","Tardeo",
                "Mumbai’s August Kranti Maidan is one of the most significant historic chapters in India’s journey of the independence struggle. This is where Mahatma Gandhi commanded the British to leave India on August 8, 1942, ",
                 18.9622943,72.8101406));
         monumentsItemArrayList.add(new HangoutItem(R.drawable.mumbai18,"Rajabai Clock Tower","Karmaveer Bhaurao Patil Marg, Mantralaya, Fort, Mumbai,",
                "The Rajabai Tower is a clock tower in South Mumbai India. It is in the confines of the Fort campus of the University of Mumbai. It stands at a height of 85 m.",
                 18.9297669,72.8278943));
         monumentsItemArrayList.add(new HangoutItem(R.drawable.mumbai19,"Town Hall ","Shahid Bhagat Singh Marg,Mumbai",
                "The Asiatic Society of Mumbai Town Hall or Town Hall Mumbai is a Neoclassical building located in the Fort locality of South Mumbai.",
                 18.9297669,72.830083));
        monumentsItemArrayList.add(new HangoutItem(R.drawable.mumbai20,"Chhatrapati Shivaji Maharaj Vastu Sangrahalaya","Mahatma Gandhi Road, Kala Ghoda, Fort, Mumbai",
                "The Chhatrapati Shivaji Maharaj Vastu Sangrahalaya is an iconic museum the construction of which began in 1905, based on local 15th and 16th century Gujarati architecture. Known earlier as the Prince of Wales Museum",
                18.9269015,72.8305029));


        addcityitem(R.drawable.mumbai,"Mumbai","Mumbai (formerly called Bombay) is a densely populated city on India’s west coast. A financial center, it's India's largest city.  The city's also famous as the heart of the Bollywood film industry. ",
                "25 C","clear Sky",93,R.drawable.mumbai2,19.0821978,72.7411,funfactsMumbai,hangoutItemArrayList,restuarentsItemArrayList,shoppingItemArrayList,monumentsItemArrayList);
    }
    public  void adddelhi(){
        ArrayList<FunFactItem> funfactsDelhi = new ArrayList<FunFactItem>();
        ArrayList<HangoutItem> hangoutItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> restuarentsItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> shoppingItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> monumentsItemArrayList = new ArrayList<HangoutItem>();
        funfactsDelhi.add(new FunFactItem("The Red Fort use to be white in colour  \n You heard it right, the magnificent Red Fort which defines the almightiness of Delhi," +
                " used to be white initially. According to a survey conducted for archaeology, related research unravelled that the Fort was made up of limestone and when the stone started to wither away, the British painted it Red to preserve it. ",R.drawable.delhi3));
        funfactsDelhi.add(new FunFactItem("The Delhi Transport Corporation along with other public transport services in Delhi is entirely run on Compressed Natural Gas (CNG)\n",R.drawable.delhi4));
        funfactsDelhi.add(new FunFactItem("Delhi is the second most bird-rich capital in the world\n",R.drawable.delhi5));

        hangoutItemArrayList.add(new HangoutItem(R.drawable.delhi6,"Moti Bagh – Rock Climbing At IMF","adventure places ",
                "Bored with films, food, and coffee? Then head to one of the most fun places in Delhi – the Indian Mountaineering Foundation! Famous for adventurous and fun activities in Delhi, the sport climbing wall should definitely not be missed! Among the adventure places in Delhi," +
                        " It has anything and everything you would want to do on a ‘fun’tastic day out. It is one of the most fun places to go in Delhi",28.582346,77.1600783));
         hangoutItemArrayList.add(new HangoutItem(R.drawable.delhi7,"Nehru Planetarium – Travel To Space","Planetarium ",
                "A popular picnic spot in Delhi amongst school kids, Nehru Planetarium is sure to charm you if you are an astronomical fan! Spend the afternoon escaping into the galaxy far far away at the Nehru Planetarium. " +
                        "Be charmed by the stars, planets and the solar systems in the sky show as you visit one of the most interesting and fun places in Delhi for an amazing day out.",28.6037965,77.1959036));
         hangoutItemArrayList.add(new HangoutItem(R.drawable.delhi8,"Modern Art Gallery","gallery  ",
                "Museums are a passé but this modern gallery is not! Spend a day exploring not just the fantastic locations but also the breathtaking art that the city has at its disposal. " +
                        "A trip to NGMA, /one of the most unique and fun places to visit in Delhi will surprise you with the amazing collection of paintings and sculptures.",28.6037953,77.1805827));
        hangoutItemArrayList.add(new HangoutItem(R.drawable.delhi9,"Nizamuddin Lane","Qawwali  ",
                "Fancy unique experiences in the capital city? Drop the idea of a jazz bar and instead spend an evening listening to the mystic Sufi Qawwali " +
                        "at the Hazrat Nizamuddin Dargah, one of the best places to visit in Delhi with friends and family. The soulful experience here is simply unforgettable!",28.5909022,77.2427474));

        hangoutItemArrayList.add(new HangoutItem(R.drawable.delhi10,"Paranthe Wali Gali","Paranthe Wali Gali  ",
                "There’s a saying that goes something like this: some of us love to eat, while others live to eat. If you’re of the latter type, we suggest you make a beeline for Paranthe Wali Gali. It is a very narrow street that is lined with world-class eateries selling a range of paranthas." +
                        " These paranthas are topped with dollops of butter and eating them will make your day. ",28.6560677,77.2283697));


        restuarentsItemArrayList.add(new HangoutItem(R.drawable.delhi11,"Berco's","Chinese , Thai",
                "Known throughout the Delhi-NCR area for its Chinese and Thai offerings, Berco's is one of the best restaurants in Delhi perfect for a family lunch or dinner",
                28.6319631,77.2215128));

        restuarentsItemArrayList.add(new HangoutItem(R.drawable.delhi12,"Olive Bar & Kitchen","Italian",
                "Known throughout the Delhi-NCR area for its Chinese and Thai offerings, Berco's is one of the best restaurants in Delhi perfect for a family lunch or dinner",
                31.3061651,75.5764861));

        restuarentsItemArrayList.add(new HangoutItem(R.drawable.delhi13,"Farzi Cafe"," Modern IndianMexican",
                "Known for their attractive presentation of fusion dishes and a very well-organized bar, this place has a lot to give you when it comes to flavors and quality. All of their dishes are prepared with dedication, which can be seen in the attention that they pay to every small detail of a dish.  ",
                28.5906035,77.1426215));

        restuarentsItemArrayList.add(new HangoutItem(R.drawable.delhi14,"Jamun","Light BitesCoffee",
                "Nothing can beat the surreal ambiance and interior of Jamun, you'll be pleased by their commitment to the food they cater too. In a sea of new places, Jamun has definitely stood out with its original concept and exquisite meals.",
                28.5905598,77.1426213));

        restuarentsItemArrayList.add(new HangoutItem(R.drawable.delhi15,"Beeryani","BiryaniNorth Indian",
                "Mamagoto, a famed restaurant for its unique Pan-Asian, this place is good for those who love trying out the exclusive flavor of Asian Cuisines. A very eclectic place with walls decorated with Asian ninjas, yellow striped tigers, sea blue, imperial yellows, radiant reds, and celadon greens",
                28.5466883,77.1944392));


        shoppingItemArrayList.add(new HangoutItem(R.drawable.delhi16,"Chandni Chowk","Near Old Delhi Railway Station",
                "This is an ancient shopping region of Delhi, thriving until date. Enjoying this market region is like a small adventure tours. There are alleys and narrow passages, which lead to endless stream of shops.\n" ,
                28.6513744,77.2228826));
shoppingItemArrayList.add(new HangoutItem(R.drawable.delhi17,"Sarojini Market","Sarojini Nagar, Near Dilli Haat",
                "This is also a thriving market, famous for cheap articles. The articles of this market usually comprises of rejected goods from the packages sent for export. Due to surplus supply of articles, you can always find a better price with bargaining.",
        28.5769069,77.1940743));
shoppingItemArrayList.add(new HangoutItem(R.drawable.delhi18,"Central Market","Lajpat Nagar, New Delhi, India",
                "Also called as the Lajpat Nagar market, this caters to the needs of middle-class shoppers. The main attraction of this market is the mehandi.",
        28.5691204,77.2395249));
shoppingItemArrayList.add(new HangoutItem(R.drawable.delhi19,"Connaught Place","Rajiv Chowk",
                "Connaught Place is a frenetic business and financial hub, centered on a ring of colonnaded Georgian-style buildings with global chain stores, vintage cinemas, bars and Indian restaurants.",
        28.6289017,77.2065322));
shoppingItemArrayList.add(new HangoutItem(R.drawable.delhi20,"Select City Walk","Saket, New Delhi",
                "This is a huge mall, famous for branded showrooms and food joints. You can explore the mall, as a part of a small trip. There are numerous things to buy, items to explore and unique services to enjoy here. ",
        28.5288523,77.2173552));

monumentsItemArrayList.add(new HangoutItem(R.drawable.delhi21, "Red Fort","Chandni Chowk,New Delhi",
        "One of the most relevant historical places in Delhi, the Red Fort constructed with vibrant red sandstone was built by Shahjahan and was the political centre. The Mughals called it their home for some 200 odd years.",
        28.6562176,77.2361931));
monumentsItemArrayList.add(new HangoutItem(R.drawable.delhi22,"Qutub Minar","Seth Sarai, Mehrauli " +
        "New Delhi, ",
        "The Qutb Minar, also spelled as Qutub Minar and Qutab Minar, is a minaret and \"victory tower\" that forms part of the Qutb complex.",
        28.5244946,77.183329));
monumentsItemArrayList.add(new HangoutItem(R.drawable.delhi23,"India Gate","Rajpath, India Gate, New Delhi",
        "The India Gate is a war memorial located astride the Rajpath, on the eastern edge of the \"ceremonial axis\" of New Delhi, formerly called Kingsway.",
        28.612912,77.227321));
monumentsItemArrayList.add(new HangoutItem(R.drawable.delhi24,"Jama Masjid","Chandni Chowk,New Delhi",
        "The Jama Masjid was regarded as a symbolic node of Islamic power across India\u200B, well into the colonial era.",
        28.6506792,77.2312534));
monumentsItemArrayList.add(new HangoutItem(R.drawable.delhi25,"Akshardham","Noida Mor, Pandav Nagar, New Delhi",
        "Over 11,000 artisans worked on this lavishly decorated Hindu temple complex inaugurated in 2005.",
        28.663684,77.2952913));


        addcityitem(R.drawable.delhi,"Delhi","Delhi, India’s capital territory, is a massive metropolitan area in the country’s north. In Old Delhi, a neighborhood dating to the 1600s, stands the imposing Mughal-era Red Fort, a symbol of India,",
                "25 C","clear Sky",93,R.drawable.delhi2,28.6466773,76.8130722,funfactsDelhi,hangoutItemArrayList,restuarentsItemArrayList,shoppingItemArrayList,monumentsItemArrayList);
    }

    public  void addbangalore(){
        ArrayList<FunFactItem> funfactsMumbai = new ArrayList<FunFactItem>();
        ArrayList<HangoutItem> hangoutItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> restuarentsItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> shoppingItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> monumentsItemArrayList = new ArrayList<HangoutItem>();

        funfactsMumbai.add(new FunFactItem("Every 5 minute a person is bitten by stray dogs in mumbai",R.drawable.mumbai));
        funfactsMumbai.add(new FunFactItem("Another Fun Fact",R.drawable.mumbai));

        hangoutItemArrayList.add(new HangoutItem(R.drawable.mumbai,"India Gate","Old Monument",
                "built in 40's",77,88));
        addcityitem(R.drawable.bangalore,"Bangalore","City Famous For IT Industires",
                "25 C","clear Sky",93,R.drawable.bangalore,19.0821978,72.7411,funfactsMumbai,hangoutItemArrayList,restuarentsItemArrayList,shoppingItemArrayList,monumentsItemArrayList);
    }
    public  void addchennai(){
        ArrayList<FunFactItem> funfactsMumbai = new ArrayList<FunFactItem>();
        ArrayList<HangoutItem> hangoutItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> restuarentsItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> shoppingItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> monumentsItemArrayList = new ArrayList<HangoutItem>();

        funfactsMumbai.add(new FunFactItem("Every 5 minute a person is bitten by stray dogs in mumbai",R.drawable.mumbai));
        funfactsMumbai.add(new FunFactItem("Another Fun Fact",R.drawable.mumbai));

        hangoutItemArrayList.add(new HangoutItem(R.drawable.mumbai,"India Gate","Old Monument",
                "built in 40's",77,88));
        addcityitem(R.drawable.chennai,"Chennai","Very Hot City",
                "25 C","clear Sky",93,R.drawable.chennai,19.0821978,72.7411,funfactsMumbai,hangoutItemArrayList,restuarentsItemArrayList,shoppingItemArrayList,monumentsItemArrayList);
    }
    public  void addsurat(){
        ArrayList<FunFactItem> funfactsSurat = new ArrayList<FunFactItem>();
        ArrayList<HangoutItem> hangoutItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> restuarentsItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> shoppingItemArrayList = new ArrayList<HangoutItem>();
        ArrayList<HangoutItem> monumentsItemArrayList = new ArrayList<HangoutItem>();

        funfactsSurat.add(new FunFactItem("India’s Largest Manufacturing Hub for Artificial Fabrics\n" +
                "If you fancy silk sarees or dress material, Surat is the place to buy it. The city has a blooming textile industry with more than 300 dyeing and printing mills, and is the largest manufacturing industry for manmade fabrics, especially silk. Markets at Sahara Darwaja offers a wide variety of fabrics at wholesale price",R.drawable.surat1));
        funfactsSurat.add(new FunFactItem("Surat is Ranked 3rd Cleanest City in India\n" +
                "Surat is surely a place for tourists to explore given the fact that it maintains healthy lifestyle standards. From its streets to its markets, public transport to residential areas, you find the residents and administration putting efforts to maintain cleanliness. ",R.drawable.surat2));
funfactsSurat.add(new FunFactItem("Surat is the World’s Largest Diamond Cutting & Polishing Hub\n" +
        "Surat amounts to more than 90% of world’s total rough diamond cutting and polishing industry. If you want to buy diamond jewellery, there cannot be any other place than Varachha or Mahidharpura market to look for best designs and competitive price.",R.drawable.surat3));

        hangoutItemArrayList.add(new HangoutItem(R.drawable.surat5,"Amaazia Water Park","Opp. Dumbal Transport Godown Canal Road Parvat Patiya",
                "Modern amusement park with water slides, a misted dance floor & a casual cafeteria-style eatery.",
                21.1945138,72.8628476));
         hangoutItemArrayList.add(new HangoutItem(R.drawable.surat6,"VR Surat","Dumas Rd, Magdalla",
                "VR Surat is a world class shopping destination with over a collection of 100+ premium brands including Zara, Marks & Spencer, Shoppers Stop, Swarovski, MAC Cosmetics, and many more.",
                 21.1451737,72.7548968));
         hangoutItemArrayList.add(new HangoutItem(R.drawable.surat7,"ISKCON Temple","Sri Sri Radha Damodar Temple, Ashram Rd, Jahangir Pura, Surat",
                "Sprawling temple complex of the Hare Krishna movement, with food for visitors on Sundays.",
                 21.2398481,72.7908206));
         hangoutItemArrayList.add(new HangoutItem(R.drawable.surat8,"Gopi Talav","Rustampura, Surat",
                "Gopi Talav is a lake in the Gopipura locality in Surat. It was built in circa 1510 CE by Malik Gopi, who was an affluent merchant and governor of Surat during the Mughal Empire. ",
                 21.1886016,72.8297614));
         hangoutItemArrayList.add(new HangoutItem(R.drawable.surat9,"Sarthana Nature Park","Opposite Old Sarthana Octroi Naka, Surat",
                "Opened in 1984, this 81-acre zoo offers a reptile house & butterfly park, plus food kiosks & a pond.\n" ,
                 21.2303193,72.896579));

         restuarentsItemArrayList.add(new HangoutItem(R.drawable.surat10,"Level 5 Terrace Restro","Italian, Mexican, Chinese, Indian, Cafe, Fast food, Asian, Healthy",
                 "Vegetarian Friendly, Vegan Options, Gluten Free Options",
                 21.1860371,72.7921654));
  restuarentsItemArrayList.add(new HangoutItem(R.drawable.surat11,"BLUE CORIANDER","Indian, Asian, American, International",
                 "Vegetarian Friendly, Vegan Options, Gluten Free Options",
          21.7522958,72.8383756));
restuarentsItemArrayList.add(new HangoutItem(R.drawable.surat12,"Barbeque Nation","Indian, Barbecue, Asian, International, Fusion",
                 "Vegetarian Friendly, Vegan Options, Halal, Gluten Free Options",
        21.171228,72.7871342));
restuarentsItemArrayList.add(new HangoutItem(R.drawable.surat13,"Leonardo Italian Mediterranean Dining","Italian, Mexican, Pizza",
                 "Vegetarian Friendly, Vegan Options, Gluten Free Options",
        21.1616208,72.7725407));
restuarentsItemArrayList.add(new HangoutItem(R.drawable.surat14,"Sasumaa Gujarati Thali","Indian, Asian",
                 "Vegetarian Friendly, Vegan Options, Gluten Free Options",
        21.18306,72.8127258));

shoppingItemArrayList.add(new HangoutItem(R.drawable.surat15,"Sahara Darwaja","Begampura ,Surat",
        "Sahara Darwaja is popular for its textile market and considered as the best shopping place in Surat, especially for ladies. You will find many manufacturers as well as wholesalers of textiles and sarees in this market.",
        21.1912387,72.8389585));
shoppingItemArrayList.add(new HangoutItem(R.drawable.surat16,"Shanivari Market","Chowk Bazar ," +
        "Surat",
        "Shanivari market, located near Makai Pul is the place where all the home décor and antique lovers go. The only thing that you need to remember while making your plan for this market is that it is open only on Saturdays. ",
        21.1959545,72.816397));
shoppingItemArrayList.add(new HangoutItem(R.drawable.surat17,"Old Bombay Market","Umarwada ," +
        "Surat",
        "Just like Sahara Darwaja, Old Bombay market is also one place where you will come across wide range of textiles. It is one of the best places for wedding shopping in Surat, where you will get a wide variety of top-notch quality clothing at wholesale prices.",
        21.1993278,72.8497017));
shoppingItemArrayList.add(new HangoutItem(R.drawable.surat18,"Rander Road","Rander Rd ," +
        "Surat",
        "Rander road is another textile market in Surat that you may want to visit. The gorgeous designer dresses available here can be purchased at the most reasonable prices",
        21.2070983,72.7950468));
shoppingItemArrayList.add(new HangoutItem(R.drawable.surat19,"Chauta Bazaar","Chauta Pul",
        "This is one of the most popular shopping places in Surat, which also happens to be the oldest market in the city. From clothes to cosmetics, from utensils to grocery, everything is available at this market.",
        21.1982573,72.823563));

monumentsItemArrayList.add(new HangoutItem(R.drawable.surat20,"Surat Castle","near, dakka ovara, makkai pull, Chowk Bazar, Surat",
        "This defensive fortress was constructed in the 16th century by Sultan Mahmood III.",
        21.1960961,72.8155234));
monumentsItemArrayList.add(new HangoutItem(R.drawable.surat21,"Sardar Patel Museum","Swamy Dayananad Sagar Marg, Chowk Bazar, Gopipura",
        "Established in 1890, Sardar Patel Museum contains great rich history of Surat and is dedicated to Sardar Vallabhai Patel, the iron man of India.",
        21.1959311,72.802085));
monumentsItemArrayList.add(new HangoutItem(R.drawable.surat22,"Surat Clock Tower","Navapura Karwa Rd, Kumbharwada, Navapura, Begampura",
        "The clock tower was built by Khan Bahadur Burjorjee Hormusjee Fraser as a tribute to his father in the year 1871. ",
        21.1975768,72.8296878));
monumentsItemArrayList.add(new HangoutItem(R.drawable.surat23,"Andrew’s Library","76, Chowk Bazar Rd, Nanavat, Gopipura",
        "Established in 1850, Andrew’s library is the old library in Surat which is quite popular among students from commerce, science, engineering and medical fields due to its rare works in arts and history.",
        21.196941,72.8168732));
monumentsItemArrayList.add(new HangoutItem(R.drawable.surat24,"Dutch and Armenian Cemetery","1, Katargam Rd, Rampura, Raman Nagar, Katargam Darwaja",
        "The monuments consist of Dutch tombs of various sizes and shapes which are relatively larger than the Armenian graves, the largest among which is the grandiose mausoleum of Baron Adrian Van Reede, who was the Director of the Dutch Company in the Indies.",
        21.2093335,72.8251347));


        addcityitem(R.drawable.surat,"Surat","Surat is a large city beside the Tapi River in the west Indian state of Gujarat. Once known for silk weaving, Surat remains a commercial center for textiles, and the New Textile Market area is lined with fabric shops",
                "25 C","clear Sky",93,R.drawable.surat4,21.1591857,72.7522558,funfactsSurat,hangoutItemArrayList,restuarentsItemArrayList,shoppingItemArrayList,monumentsItemArrayList);
    }
}
