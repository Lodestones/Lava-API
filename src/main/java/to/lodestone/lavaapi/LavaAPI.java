package to.lodestone.lavaapi;

/**
 * Official API of the Lava Plugin
 * This interface allows access to certain internals of the teams plugin.
 *
 * @author John Aquino
 */
public class LavaAPI {

    private static ILavaAPI api;

    /**
     * Internal use of the API for Lava to use.
     * DO NOT TOUCH!!
     * @param api {@link ILavaAPI}
     */
    public static void setApi(ILavaAPI api) {
        LavaAPI.api = api;
    }

    /**
     * Retrieves the API that Lava uses.
     */
    public static ILavaAPI getApi() {
        return api;
    }

}
