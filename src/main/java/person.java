import java.util.ArrayList;
import java.util.List;

public class person {
    private post post;
    private List posts = new ArrayList();
    public person() {

    }

    public person(post post) {
        this.post = post;
    }
    public void add(post entry) {
        posts.add(entry);
    }

}
