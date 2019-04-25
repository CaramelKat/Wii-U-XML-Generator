import java.util.ArrayList;

public class topic {
    private String icon, title_id, community_id, is_recommended, name, participant_count;
    private ArrayList<person> people = new ArrayList<person>();
    private String empathy_count, has_shop_page, modified_at, position;
    public topic(String icon, String title_id, String community_id, String is_recommended, String name, String participant_count, String has_shop_page, String modified_at, ArrayList<person> people) {
        this.icon = icon;
        this.title_id = title_id;
        this.community_id = community_id;
        this.is_recommended = is_recommended;
        this.name = name;
        this.participant_count = participant_count;
        this.people = people;
        this.empathy_count = "0";
        this.has_shop_page = has_shop_page;
        this.modified_at = modified_at;
        this.position = "2";

    }
}

