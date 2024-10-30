package model.pojo;

import constants.game.NextLevelType;
import lombok.Data;

@Data
public class NextLevelContext {
    private NextLevelType levelType;
    private String lastLevel;
    private String nextLevel;
    private String prefix;

    public void clear() {
        this.levelType = null;
        this.lastLevel = null;
        this.nextLevel = null;
        this.prefix = null;
    }
}
