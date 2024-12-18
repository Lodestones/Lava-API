package to.lodestone.lavaapi;

import org.bukkit.Location;
import to.lodestone.lavaapi.api.TimerType;

public interface ILavaAPI {

    Location getOrigin();
    void setOrigin(Location location);

    int getRadius();
    void setRadius(int radius);

    boolean shouldGravityBlocksFall();
    void setShouldGravityBlocksFall(boolean gravityBlocksFall);

    boolean canPlayersFillLavaBucket();
    void setCanPlayersFillLavaBucket(boolean canPlayersFillLavaBucket);

    int getRisingInterval();
    void setRisingInterval(int interval);

    TimerType getTimerType();
    void setTimerType(TimerType timerType);

    boolean shouldPlayersBePunished();
    void setShouldPlayersBePunished(boolean shouldPlayersBePunished);

    int getProcessingPower();
    void setProcessingPower(int processingPower);

    boolean shouldReplaceLayer();
    void setShouldReplaceLayer(boolean shouldReplaceLayer);

}
