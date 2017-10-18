package monitoring.service.impl;

import monitoring.dao.MonitoringDao;
import monitoring.dao.impl.MonitoringDaoImpl;
import monitoring.exception.BadSiteException;
import monitoring.exception.NoProtocolException;
import monitoring.service.MonitoringService;

import java.util.List;

/**
 * @author Igor Hnes on 10/18/17.
 */
public class MonitoringServiceImpl implements MonitoringService {

    /**
     * {@inheritDoc}.
     */
    @Override
    public boolean check(String site) {
        if (!site.startsWith("https://")) {
            try {
                throw new NoProtocolException();
            } catch (NoProtocolException e) {
                e.printStackTrace();
                return false;
            }
        }

        final List<String> badSite = getBadSite();
        for (String elem : badSite) {
            if (elem.equals(site)) {
                try {
                    throw new BadSiteException();
                } catch (BadSiteException e) {
                    e.printStackTrace();
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public void save(String site) {
        MonitoringDao monitoringDao = new MonitoringDaoImpl();
        monitoringDao.save(site);
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public List<String> getGoodSite() {
        MonitoringDao monitoringDao = new MonitoringDaoImpl();
        return monitoringDao.getGoodSite();
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public List<String> getBadSite() {
        MonitoringDao monitoringDao = new MonitoringDaoImpl();
        return monitoringDao.getBadSite();
    }
}
