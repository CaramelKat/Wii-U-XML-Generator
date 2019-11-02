public class post {
    private String body, subreddit, community_id, country_id, created_at, feeling_id, id, is_autopost, is_community_private_autopost, is_spoiler, is_app_jumpable, empathy_count, language_id, mii, mii_face_url, number;
    private painting painting;
    private String pid,platform_id, region_id;
    private int reply_count;
    private String screen_name, title_id;
    public post(String body, String subreddit, String mii,painting painting, int reply_count, String title_id, String created_at, String screen_name, String community_id) {
        this.body = body;
        this.subreddit = subreddit;
        this.community_id = community_id;
        this.country_id = "1";
        this.created_at = created_at;
        this.feeling_id = "0";
        this.id = "";
        this.is_autopost = "0";
        this.is_community_private_autopost = "0";
        this.is_spoiler = "0";
        this.is_app_jumpable = "0";
        this.empathy_count = "";
        this.language_id = "1";
        this.mii = mii;
        this.mii_face_url = "";
        this.number = "0";
        this.painting = painting;
        this.pid = "";
        this.platform_id = "0";
        this.region_id = "2";
        this.reply_count = reply_count;
        this.screen_name = screen_name;
        this.title_id = title_id;


    }

    public String getSubreddit(){
        return subreddit;
    }


}
