import java.util.*;

public class result {
    private String version, has_error, request_name, expire;
    private List topics = new ArrayList();

    public result(String version, String has_error, String request_name, String expire) {
        this.version = version;
        this.has_error = has_error;
        this.request_name = request_name;
        this.expire = expire;
    }

    public void add(topic entry) {
        topics.add(entry);
    }

    public List getContent() {
        return topics;
    }
}