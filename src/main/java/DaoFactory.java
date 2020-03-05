public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
//            asdDao = new ListAdsDao();
            adsDao = new MySQLAdsDao();
        }
        return adsDao;
    }
}
