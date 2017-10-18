package monitoring.service;

import java.util.List;

/**
 * @author Igor Hnes on 10/18/17.
 */
public interface MonitoringService {

    /**
     * @param site is given url.
     * @return is present this site in bad site file.
     */
    boolean check(String site);

    /**
     * @param site is going to be save in good site file.
     */
    void save(String site);

    /**
     * @return list of good sites.
     */
    List<String> getGoodSite();

    /**
     * @return list of bad sites.
     */
    List<String> getBadSite();
}
