import java.util.Map;

public interface Tracker {

    public Map<String, Integer> tracker();

    void push(String message);

    Boolean has(String message);

    void handle(String message, EventHandler e);
}
