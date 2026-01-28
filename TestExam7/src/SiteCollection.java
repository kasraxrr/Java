public class SiteCollection {
    private int size;
    private static final int MAX_SITES = 25;
    private WebSite[] webSites;

    public SiteCollection() {
        webSites = new WebSite[MAX_SITES];
    }

    public int getNumberOfSites() {
        return webSites.length;
    }

    public void AddSite(WebSite site) {
        for (int i = 0; i < size; i++) {
            if (webSites[i] == null) {
                webSites[i] = site;
            }
        }
    }

    public void removeSite(String url) {
        for (int i = 0; i < size; i++) {
            WebSite website = webSites[i];
            if (website.getUrl().equals(url)) {
                for (int j = i; j < size-1; j++) {
                    webSites[i]=webSites[i+1];


                }
                webSites[size-1] = null;
                size--;
                break;
            }



        }
    }
    public WebSite getWebSite(int index){
        return webSites[index];
    }

    public boolean contains(WebSite site){
        for (int i = 0; i < webSites.length ; i++) {
           if (webSites[i].equals(site))return true;
        }return false;
    }

}
