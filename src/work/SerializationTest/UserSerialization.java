package work.SerializationTest;

import java.io.Serializable;

public class UserSerialization implements Serializable {

    private int lifeLevel;
   transient Sord sord;

    public int getLifeLevel() {
        return lifeLevel;
    }

    public void setLifeLevel(int lifeLevel) {
        this.lifeLevel = lifeLevel;
    }
}
