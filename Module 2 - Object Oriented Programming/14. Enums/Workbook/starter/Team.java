import java.util.HashMap;
import java.util.Map;

public class Team {

    private String name;
    private Map<String, String> players;

    public Team(String name) {
        this.name = name;
        this.players = new HashMap<>();
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Name cannot be null/blank");
        this.name = name;
    }

    public String getPlayer(String position) {
        return this.players.get(position);
    }

    public void setPlayer(String position, String player) {
        if (!position.equals("SHOOTING_GUARD") || !position.equals("SMALL_FORWARD") || !position.equals("POWER_FORWARD") || !position.equals("CENTER") || !position.equals("POINT_GUARD")) {
            throw new IllegalArgumentException("INVALID POSITION");
        }
        this.players.put(position, player);
    }
    
}
