import java.util.List;

public interface Ads {
    // get a list of all the ads
    List<Ad> all();
    // insert a new ad and return the new ad's id
    Long insert(Ad ad);
//    some extra things to possibly  add
//    List<Ad> getAllByCategory(String category);
//    List<Ad> getAllByUser(long userId);
//    Ad retrieve(long id);
    boolean delete(long id);
//    boolean update(Ad ad);

}
