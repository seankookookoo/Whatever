package rltut;

import java.util.List;

public class PlayerAi extends CreatureAi {

    public void onNotify(String message) {
        messages.add(message);
    }

    @Override
    public void onEnter(int x, int y, Tile tile) {
        if (tile.isGround()) {
            creature.x = x;
            creature.y = y;
        } else if (tile.isDiggable()) {
            creature.dig(x, y);
        }

    }
    private List<String> messages;

    public PlayerAi(Creature creature, List<String> messages) {
        super(creature);
        this.messages = messages;
    }

}
