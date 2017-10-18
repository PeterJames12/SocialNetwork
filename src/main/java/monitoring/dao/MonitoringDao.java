package monitoring.dao;

import java.util.List;

/**
 * @author Igor Hnes on 10/18/17.
 */
public interface MonitoringDao {

    /**
     * @return list of good sites.
     */
    List<String> getGoodSite();

    /**
     * @return list of bad sites.
     */
    List<String> getBadSite();

    /**
     * @param site is going to be save in file.
     */
    void save(String site);
}
