public class User {
    private String name;
    private SiteCollection siteCollection;

    public User(String name) {
        this.name = name;
        siteCollection = new SiteCollection();
    }

    public String getName() {
        return name;
    }

    public SiteCollection getSiteCollection() {
        return siteCollection;
    }

    public SiteCollection getAccessibleSite() {
        SiteCollection si=null;
        for (int i = 0; i < siteCollection.getNumberOfSites(); i++) {
            if (siteCollection.getWebSite(i).hasAccess()) {
             si.AddSite( siteCollection.getWebSite(i));
            }
        }return si;

    }
}
