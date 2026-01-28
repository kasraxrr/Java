public class Administrator extends User{
    public Administrator(String name){
        super(name);
    }
    public void setUserAccessForSite(WebSite site){
        for (int i = 0; i < getSiteCollection().getNumberOfSites(); i++) {
        if (getSiteCollection().getWebSite(i).equals(site)){
            getSiteCollection().getWebSite(i).setAccess(true);
        }
        }
    }
    public Administrator createAdministrator(User user){
        return new Administrator(user.getName());
    }
}
